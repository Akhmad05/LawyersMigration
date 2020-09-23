package ru.scli.lawyersmigration.model.db1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LAWYERS")
public class Lawyer {

    @Id
    @Column(name="ID")
    private Long id;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "LAW_CHAMBER")
    private String lawChamber;
    @Column(name = "DISTRICT_CODE", length = 3)
    private String districtCode;
    @Column(name = "DISTRICT_NAME", length = 80)
    private String districtName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "FIO")
    private String fio;
    @Column(name = "IDENTITY_CARD", length = 25)
    private String identityCard;
    @Column(name = "ORG_FORM")
    private Integer orgForm;
    @Column(name = "ORG_NAME")
    private String orgName;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "REG_CAPTION", length = 80)
    private String regCaption;
    @Column(name = "REG_CODE", length = 3)
    private String regCode;
    @Column(name = "REGISTER_NUMBER", length = 9)
    private String registerNumber;
    @Column(name = "SERIAL_NUMBER", length = 6)
    private String serialNumber;
    @Column(name = "STATUS")
    private Integer status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLawChamber() {
        return lawChamber;
    }

    public void setLawChamber(String lawChamber) {
        this.lawChamber = lawChamber;
    }

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public Integer getOrgForm() {
        return orgForm;
    }

    public void setOrgForm(Integer orgForm) {
        this.orgForm = orgForm;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegCaption() {
        return regCaption;
    }

    public void setRegCaption(String regCaption) {
        this.regCaption = regCaption;
    }

    public String getRegCode() {
        return regCode;
    }

    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

