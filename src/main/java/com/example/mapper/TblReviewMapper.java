package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.entity.TblReview;
import com.example.entity.TblReviewExample;

@Mapper
public interface TblReviewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_review
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    long countByExample(TblReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_review
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int deleteByExample(TblReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_review
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int deleteByPrimaryKey(String reviewId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_review
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int insert(TblReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_review
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int insertSelective(TblReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_review
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    List<TblReview> selectByExample(TblReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_review
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    TblReview selectByPrimaryKey(String reviewId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_review
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int updateByExampleSelective(@Param("record") TblReview record, @Param("example") TblReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_review
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int updateByExample(@Param("record") TblReview record, @Param("example") TblReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_review
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int updateByPrimaryKeySelective(TblReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_review
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    int updateByPrimaryKey(TblReview record);
}