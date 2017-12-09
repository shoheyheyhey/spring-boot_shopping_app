package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.TblUser;
import com.example.entity.TblUserExample;
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
		TblUserExample tblUserExample = new TblUserExample();
		tblUserExample.createCriteria().andUserIdEqualTo(user.getUserId()).andDelFlgEqualTo("0");
		List<TblUser> authResultList = tblUserMapper.selectByExample(tblUserExample);
		if (authResultList != null && authResultList.size() > 0){
			// ログイン成功
			TblUser authResult = authResultList.get(0);
			if(authResult.getPassword().equals(user.getPassword())) {
				return authResult;
			}
		}
		//ログイン失敗
		return null;
	}
}
