package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.TblGoods;
import com.example.entity.TblGoodsExample;
import com.example.mapper.TblGoodsMapper;

@Service
@Transactional
public class GoodsService {

	@Autowired
	TblGoodsMapper tblGoodsMapper;
	
	/**
	 * 商品一覧取得サービス
	 * @return List<TblGoods>
	 */
	public List<TblGoods> findAll() {
		TblGoodsExample example = new TblGoodsExample();
		example.createCriteria().andDelFlgEqualTo(String.valueOf("0"));
		return tblGoodsMapper.selectByExample(example);
	}
	
	/**
	 * 商品取得サービス(キー：PK)
	 * @param id
	 * @return
	 */
	public TblGoods findByPk(String id) {
		TblGoodsExample example = new TblGoodsExample();
		example.createCriteria().andGoodsIdEqualTo(id).andDelFlgEqualTo(String.valueOf("0"));
		return tblGoodsMapper.selectByPrimaryKey(id);
	}
	
	/**
	 * 商品登録サービス
	 * @param TblUser
	 * @return int
	 */
	public int create(TblGoods goods) {
		return tblGoodsMapper.insertSelective(goods);
	}
	
	/**
	 * 商品削除サービス(物理削除)
	 * @param String
	 */
	public void deletePhysical(String id) {
		tblGoodsMapper.deleteByPrimaryKey(id);
	}
	
	/**
	 * 商品削除サービス(論理削除)
	 * @param String
	 * @return int
	 */
	public int deleteLogical(String id) {
		TblGoods goods = new TblGoods();
		goods.setGoodsId(id);
		goods.setDelFlg("1");
		return tblGoodsMapper.updateByPrimaryKeySelective(goods);
		
	}
	
	/**
	 * 商品更新サービス
	 * @param TblUser
	 * @return int
	 */
	public int update(TblGoods goods) {
		return tblGoodsMapper.updateByPrimaryKeySelective(goods);
	}
}
