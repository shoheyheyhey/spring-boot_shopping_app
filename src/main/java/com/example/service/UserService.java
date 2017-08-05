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
	 * ユーザー一覧取得サービス
	 * @return List<TblUser>
	 */
	public List<TblUser> findAll() {
		TblUserExample example = new TblUserExample();
		example.createCriteria().andDelFlgEqualTo(String.valueOf("0"));
		return tblUserMapper.selectByExample(example);
	}
	
	/**
	 * ユーザー取得サービス(キー：PK)
	 * @param id
	 * @return
	 */
	public TblUser findByPk(String id) {
		TblUserExample example = new TblUserExample();
		example.createCriteria().andUserIdEqualTo(id).andDelFlgEqualTo(String.valueOf("0"));
		return tblUserMapper.selectByPrimaryKey(id);
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
	 * ユーザー削除サービス(物理削除)
	 * @param String
	 */
	public void deletePhysical(String id) {
		tblUserMapper.deleteByPrimaryKey(id);
	}
	
	/**
	 * ユーザー削除サービス(論理削除)
	 * @param String
	 * @return int
	 */
	public int deleteLogical(String id) {
		TblUser user = new TblUser();
		user.setUserId(id);
		user.setDelFlg("1");
		return tblUserMapper.updateByPrimaryKeySelective(user);
		
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
