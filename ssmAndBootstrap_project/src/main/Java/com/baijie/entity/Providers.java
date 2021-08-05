package com.baijie.entity;

public class Providers {

    //对应表store_admin_providers(货品供应商信息)
    private int id;//主键ID
    private String companyCode;//供应商编码
    private String companyName;//供应商公司名称
    private String companyDesc;//供应商货品信息详细描述
    private String companyUser;//供应商联系人名称
    private String comPhoneNum;//供应商联系电话
    private String companySite;//供应商地址

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyDesc() {
        return companyDesc;
    }

    public void setCompanyDesc(String companyDesc) {
        this.companyDesc = companyDesc;
    }

    public String getCompanyUser() {
        return companyUser;
    }

    public void setCompanyUser(String companyUser) {
        this.companyUser = companyUser;
    }

    public String getComPhoneNum() {
        return comPhoneNum;
    }

    public void setComPhoneNum(String comPhoneNum) {
        this.comPhoneNum = comPhoneNum;
    }

    public String getCompanySite() {
        return companySite;
    }

    public void setCompanySite(String companySite) {
        this.companySite = companySite;
    }

    @Override
    public String toString() {
        return "Providers{" +
                "id=" + id +
                ", companyCode='" + companyCode + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyDesc='" + companyDesc + '\'' +
                ", companyUser='" + companyUser + '\'' +
                ", comPhoneNum='" + comPhoneNum + '\'' +
                ", companySite='" + companySite + '\'' +
                '}';
    }
}
