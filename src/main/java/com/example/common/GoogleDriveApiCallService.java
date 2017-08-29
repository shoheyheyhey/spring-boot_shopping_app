package com.example.common;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;

@Service
public class GoogleDriveApiCallService {

	/** クライアントID */
	private static String CLIENT_ID = "758998258762-stlr2r9tf5ug0mkr6s00rqfduvofa4q7.apps.googleusercontent.com";
	/** クライアントシークレット */
	private static String CLIENT_SECRET = "z7cL2PtnpU8Lazg-jlh1avhX";
	/** リフレッシュトークン */
	private static String REFRESH_TOKEN = "1/j3EH1XaT8In5yIN5HvUTXA91cNTcE6C86rhsPcptIoI";
	/** アップロード先フォルダ */
	private static List<String> UPLOAD_FOLDER = Arrays.asList("0B6um_MQAw3fJdGMzODVCQWkzT2M");

	/**
	 * Google Drive画像アップロードサービス
	 * 
	 * @param MultipartFile
	 * @return String
	 */
	public String uploadImg(MultipartFile uploadFile) {
		String fileId = null;
		// リフレッシュトークンでアクセストークン取得
		HttpTransport httpTransport = new NetHttpTransport.Builder().build();
		JsonFactory jsonFactory = new JacksonFactory();
		GoogleCredential credential = createCredentialWithRefreshToken(httpTransport, jsonFactory,
				new TokenResponse().setRefreshToken(REFRESH_TOKEN));

		// 新規認証APIクライアントを作成
		Drive service = new Drive.Builder(httpTransport, jsonFactory, credential).build();

		// アップロードファイル読み込み&アップロード設定
		File body = new File();
		body.setName(uploadFile.getOriginalFilename());
		body.setDescription(uploadFile.getOriginalFilename());
		body.setMimeType(uploadFile.getContentType());
		body.setParents(UPLOAD_FOLDER);

		// Google Driveへファイルアップロード
		try {
			File file = service.files()
					.create(body, new ByteArrayContent(uploadFile.getContentType(), uploadFile.getBytes())).execute();
			fileId = file.getId();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return fileId;

	}

	/**
	 * アクセストークン取得処理
	 * 
	 * @param transport
	 * @param jsonFactory
	 * @param tokenResponse
	 * @return
	 */
	private static GoogleCredential createCredentialWithRefreshToken(HttpTransport transport, JsonFactory jsonFactory,
			TokenResponse tokenResponse) {
		return new GoogleCredential.Builder().setTransport(transport).setJsonFactory(jsonFactory)
				.setClientSecrets(CLIENT_ID, CLIENT_SECRET).build().setFromTokenResponse(tokenResponse);
	}

}
