package com.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblGoodsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    public TblGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNmIsNull() {
            addCriterion("goods_nm is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNmIsNotNull() {
            addCriterion("goods_nm is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNmEqualTo(String value) {
            addCriterion("goods_nm =", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmNotEqualTo(String value) {
            addCriterion("goods_nm <>", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmGreaterThan(String value) {
            addCriterion("goods_nm >", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmGreaterThanOrEqualTo(String value) {
            addCriterion("goods_nm >=", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmLessThan(String value) {
            addCriterion("goods_nm <", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmLessThanOrEqualTo(String value) {
            addCriterion("goods_nm <=", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmLike(String value) {
            addCriterion("goods_nm like", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmNotLike(String value) {
            addCriterion("goods_nm not like", value, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmIn(List<String> values) {
            addCriterion("goods_nm in", values, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmNotIn(List<String> values) {
            addCriterion("goods_nm not in", values, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmBetween(String value1, String value2) {
            addCriterion("goods_nm between", value1, value2, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andGoodsNmNotBetween(String value1, String value2) {
            addCriterion("goods_nm not between", value1, value2, "goodsNm");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Long value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Long value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Long value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Long value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Long value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Long value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Long> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Long> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Long value1, Long value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Long value1, Long value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIsNull() {
            addCriterion("basic_info is null");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIsNotNull() {
            addCriterion("basic_info is not null");
            return (Criteria) this;
        }

        public Criteria andBasicInfoEqualTo(String value) {
            addCriterion("basic_info =", value, "basicInfo");
            return (Criteria) this;
        }

        public Criteria andBasicInfoNotEqualTo(String value) {
            addCriterion("basic_info <>", value, "basicInfo");
            return (Criteria) this;
        }

        public Criteria andBasicInfoGreaterThan(String value) {
            addCriterion("basic_info >", value, "basicInfo");
            return (Criteria) this;
        }

        public Criteria andBasicInfoGreaterThanOrEqualTo(String value) {
            addCriterion("basic_info >=", value, "basicInfo");
            return (Criteria) this;
        }

        public Criteria andBasicInfoLessThan(String value) {
            addCriterion("basic_info <", value, "basicInfo");
            return (Criteria) this;
        }

        public Criteria andBasicInfoLessThanOrEqualTo(String value) {
            addCriterion("basic_info <=", value, "basicInfo");
            return (Criteria) this;
        }

        public Criteria andBasicInfoLike(String value) {
            addCriterion("basic_info like", value, "basicInfo");
            return (Criteria) this;
        }

        public Criteria andBasicInfoNotLike(String value) {
            addCriterion("basic_info not like", value, "basicInfo");
            return (Criteria) this;
        }

        public Criteria andBasicInfoIn(List<String> values) {
            addCriterion("basic_info in", values, "basicInfo");
            return (Criteria) this;
        }

        public Criteria andBasicInfoNotIn(List<String> values) {
            addCriterion("basic_info not in", values, "basicInfo");
            return (Criteria) this;
        }

        public Criteria andBasicInfoBetween(String value1, String value2) {
            addCriterion("basic_info between", value1, value2, "basicInfo");
            return (Criteria) this;
        }

        public Criteria andBasicInfoNotBetween(String value1, String value2) {
            addCriterion("basic_info not between", value1, value2, "basicInfo");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("keyword is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("keyword is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("keyword =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("keyword <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("keyword >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("keyword >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("keyword <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("keyword <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("keyword like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("keyword not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("keyword in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("keyword not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("keyword between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("keyword not between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIsNull() {
            addCriterion("register_id is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIsNotNull() {
            addCriterion("register_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdEqualTo(String value) {
            addCriterion("register_id =", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotEqualTo(String value) {
            addCriterion("register_id <>", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThan(String value) {
            addCriterion("register_id >", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThanOrEqualTo(String value) {
            addCriterion("register_id >=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThan(String value) {
            addCriterion("register_id <", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThanOrEqualTo(String value) {
            addCriterion("register_id <=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLike(String value) {
            addCriterion("register_id like", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotLike(String value) {
            addCriterion("register_id not like", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIn(List<String> values) {
            addCriterion("register_id in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotIn(List<String> values) {
            addCriterion("register_id not in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdBetween(String value1, String value2) {
            addCriterion("register_id between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotBetween(String value1, String value2) {
            addCriterion("register_id not between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andDelFlgIsNull() {
            addCriterion("del_flg is null");
            return (Criteria) this;
        }

        public Criteria andDelFlgIsNotNull() {
            addCriterion("del_flg is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlgEqualTo(String value) {
            addCriterion("del_flg =", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotEqualTo(String value) {
            addCriterion("del_flg <>", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgGreaterThan(String value) {
            addCriterion("del_flg >", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgGreaterThanOrEqualTo(String value) {
            addCriterion("del_flg >=", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgLessThan(String value) {
            addCriterion("del_flg <", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgLessThanOrEqualTo(String value) {
            addCriterion("del_flg <=", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgLike(String value) {
            addCriterion("del_flg like", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotLike(String value) {
            addCriterion("del_flg not like", value, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgIn(List<String> values) {
            addCriterion("del_flg in", values, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotIn(List<String> values) {
            addCriterion("del_flg not in", values, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgBetween(String value1, String value2) {
            addCriterion("del_flg between", value1, value2, "delFlg");
            return (Criteria) this;
        }

        public Criteria andDelFlgNotBetween(String value1, String value2) {
            addCriterion("del_flg not between", value1, value2, "delFlg");
            return (Criteria) this;
        }

        public Criteria andRegistDateIsNull() {
            addCriterion("regist_date is null");
            return (Criteria) this;
        }

        public Criteria andRegistDateIsNotNull() {
            addCriterion("regist_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegistDateEqualTo(Date value) {
            addCriterion("regist_date =", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateNotEqualTo(Date value) {
            addCriterion("regist_date <>", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateGreaterThan(Date value) {
            addCriterion("regist_date >", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateGreaterThanOrEqualTo(Date value) {
            addCriterion("regist_date >=", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateLessThan(Date value) {
            addCriterion("regist_date <", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateLessThanOrEqualTo(Date value) {
            addCriterion("regist_date <=", value, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateIn(List<Date> values) {
            addCriterion("regist_date in", values, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateNotIn(List<Date> values) {
            addCriterion("regist_date not in", values, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateBetween(Date value1, Date value2) {
            addCriterion("regist_date between", value1, value2, "registDate");
            return (Criteria) this;
        }

        public Criteria andRegistDateNotBetween(Date value1, Date value2) {
            addCriterion("regist_date not between", value1, value2, "registDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_goods
     *
     * @mbg.generated do_not_delete_during_merge Sat Aug 05 15:00:28 JST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_goods
     *
     * @mbg.generated Sat Aug 05 15:00:28 JST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}