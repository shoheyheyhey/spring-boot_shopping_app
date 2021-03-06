package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.entity.TblGoods;
import com.example.entity.TblGoodsExample;

@Mapper
public interface TblGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    long countByExample(TblGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int deleteByExample(TblGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int deleteByPrimaryKey(String goodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int insert(TblGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int insertSelective(TblGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    List<TblGoods> selectByExample(TblGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    TblGoods selectByPrimaryKey(String goodsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int updateByExampleSelective(@Param("record") TblGoods record, @Param("example") TblGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int updateByExample(@Param("record") TblGoods record, @Param("example") TblGoodsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int updateByPrimaryKeySelective(TblGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int updateByPrimaryKey(TblGoods record);
}