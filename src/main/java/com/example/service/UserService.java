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
	 * @return List<item>
	 */
	public List<TblUser> findAll() {
		TblUserExample example = new TblUserExample();
		return tblUserMapper.selectByExample(example);
	}
	
//	/**
//	 * ユーザー登録サービス
//	 * @param item
//	 * @return item
//	 */
//	public Item create(Item item) {
//		return itemRepository.save(item);
//	}
//	/**
//	 * ユーザー削除サービス
//	 * @param id
//	 */
//	public void delete(Integer id) {
//		itemRepository.delete(id);
//	}
//	
//	/**
//	 * ユーザー更新サービス
//	 * @param item
//	 * @return item
//	 */
//	public Item update(Item item) {
//		return itemRepository.save(item);
//	}
}
