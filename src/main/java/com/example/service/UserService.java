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
public class UserService {

	@Autowired
	TblUserMapper tblUserMapper;
	
	/**
	 * ユーザ一覧取得サービス
	 * @return List<TblUser>
	 */
	public List<TblUser> findAll() {
		TblUserExample example = new TblUserExample();
		example.createCriteria().andDelFlgEqualTo(String.valueOf("0"));
		return tblUserMapper.selectByExample(example);
	}
	
	/**
	 * ユーザー登録サービス
	 * @param TblUser
	 * @return int
	 */
	public int create(TblUser user) {
		return tblUserMapper.insertSelective(user);
	}
	/**
	 * ユーザー削除サービス
	 * @param String
	 */
	public void delete(String id) {
		tblUserMapper.deleteByPrimaryKey(id);
	}
	
	/**
	 * ユーザー更新サービス
	 * @param TblUser
	 * @return int
	 */
	public int update(TblUser user) {
		return tblUserMapper.updateByPrimaryKeySelective(user);
	}
}
