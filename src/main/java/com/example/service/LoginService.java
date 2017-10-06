package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.TblUser;
import com.example.mapper.TblUserMapper;

@Service
@Transactional
public class LoginService {

	@Autowired
	TblUserMapper tblUserMapper;
	
	/**
	 * ログイン処理
	 * @param TblUser
	 * @return TblUser
	 */
	public TblUser login(TblUser user){		
		TblUser authResult = tblUserMapper.selectByPrimaryKey(user.getUserId());
		if (authResult != null && user.getPassword().equals(authResult.getPassword())){
			// ログイン成功
			return authResult;
		}
		//ログイン失敗
		return null;
	}
}
