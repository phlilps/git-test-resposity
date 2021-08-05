package com.baijie.entity;

public class Site {

    //对应表store_admin_site(商品订单收货地址信息)
    private int id;//主键ID
    private String contact;//联系人姓名
    private String siteDesc;//收货地址明细
    private String postCode;//邮编
    private String telPhoneNum;//联系人电话
    private  User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSiteDesc() {
        return siteDesc;
    }

    public void setSiteDesc(String siteDesc) {
        this.siteDesc = siteDesc;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getTelPhoneNum() {
        return telPhoneNum;
    }

    public void setTelPhoneNum(String telPhoneNum) {
        this.telPhoneNum = telPhoneNum;
    }


    @Override
    public String toString() {
        return "Site{" +
                "id=" + id +
                ", contact='" + contact + '\'' +
                ", siteDesc='" + siteDesc + '\'' +
                ", postCode='" + postCode + '\'' +
                ", telPhoneNum='" + telPhoneNum + '\'' +
                ", user=" + user +
                '}';
    }
}
