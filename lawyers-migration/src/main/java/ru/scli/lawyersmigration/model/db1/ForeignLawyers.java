package ru.scli.lawyersmigration.model.db1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FOREIGN_LAWYERS")
public class ForeignLawyers {
    @Id
    @Column(name="ID")
    private Long id;
    @Column(name="COUNTRY_CAPTION", length = 253)
    private String countryCaption;
    @Column(name="COUNTRY_CODE", length = 10)
    private String countryCode;
    @Column(name="FIO", length = 253)
    private String fio;
    @Column(name="REGISTER_NUMBER", length = 9)
    private String registerNumber;
    @Column(name="STATUS")
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryCaption() {
        return countryCaption;
    }

    public void setCountryCaption(String countryCaption) {
        this.countryCaption = countryCaption;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}

