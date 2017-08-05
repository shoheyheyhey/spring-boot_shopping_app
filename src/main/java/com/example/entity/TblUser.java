package com.example.entity;

import java.util.Date;

public class TblUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.user_id
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.password
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.user_nm
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    private String userNm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.user_frigana
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    private String userFrigana;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.tel
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.mail
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    private String mail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.postal_code
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    private String postalCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.address
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.del_flg
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    private String delFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.regist_date
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    private Date registDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.update_date
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.user_id
     *
     * @return the value of tbl_user.user_id
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.user_id
     *
     * @param userId the value for tbl_user.user_id
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.password
     *
     * @return the value of tbl_user.password
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.password
     *
     * @param password the value for tbl_user.password
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.user_nm
     *
     * @return the value of tbl_user.user_nm
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public String getUserNm() {
        return userNm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.user_nm
     *
     * @param userNm the value for tbl_user.user_nm
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public void setUserNm(String userNm) {
        this.userNm = userNm == null ? null : userNm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.user_frigana
     *
     * @return the value of tbl_user.user_frigana
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public String getUserFrigana() {
        return userFrigana;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.user_frigana
     *
     * @param userFrigana the value for tbl_user.user_frigana
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public void setUserFrigana(String userFrigana) {
        this.userFrigana = userFrigana == null ? null : userFrigana.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.tel
     *
     * @return the value of tbl_user.tel
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.tel
     *
     * @param tel the value for tbl_user.tel
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.mail
     *
     * @return the value of tbl_user.mail
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public String getMail() {
        return mail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.mail
     *
     * @param mail the value for tbl_user.mail
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.postal_code
     *
     * @return the value of tbl_user.postal_code
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.postal_code
     *
     * @param postalCode the value for tbl_user.postal_code
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.address
     *
     * @return the value of tbl_user.address
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.address
     *
     * @param address the value for tbl_user.address
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.del_flg
     *
     * @return the value of tbl_user.del_flg
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public String getDelFlg() {
        return delFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.del_flg
     *
     * @param delFlg the value for tbl_user.del_flg
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg == null ? null : delFlg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.regist_date
     *
     * @return the value of tbl_user.regist_date
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public Date getRegistDate() {
        return registDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.regist_date
     *
     * @param registDate the value for tbl_user.regist_date
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.update_date
     *
     * @return the value of tbl_user.update_date
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.update_date
     *
     * @param updateDate the value for tbl_user.update_date
     *
     * @mbg.generated Fri Aug 04 02:22:41 JST 2017
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}