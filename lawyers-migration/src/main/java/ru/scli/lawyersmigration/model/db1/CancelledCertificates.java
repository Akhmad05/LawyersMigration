package ru.scli.lawyersmigration.model.db1;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "CANCELLED_CERTIFICATES")
public class CancelledCertificates {
    @Id
    @Column(name="ID")
    private Long id;
    @Column(name="CERT_DATE", columnDefinition = "DATE")
    private Date certDate;
    @Column(name="CERT_NUMBER", length = 25)
    private String certNumber;
    @Column(name="FIO", length = 253)
    private String fio;
    @Column(name="LAWYER_ID")
    private Long lawyerId;
    @Column(name="NOT_RETURNED")
    private Short notReturned;
    @Column(name="REASON_ID")
    private Integer reasonId;
    @Column(name="REG_CAPTION", length = 80)
    private String regCaption;
    @Column(name="REG_CODE", length = 3)
    private String regCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCertDate() {
        return certDate;
    }

    public void setCertDate(Date certDate) {
        this.certDate = certDate;
    }

    public String getCertNumber() {
        return certNumber;
    }

    public void setCertNumber(String certNumber) {
        this.certNumber = certNumber;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Long getLawyerId() {
        return lawyerId;
    }

    public void setLawyerId(Long lawyerId) {
        this.lawyerId = lawyerId;
    }

    public Short getNotReturned() {
        return notReturned;
    }

    public void setNotReturned(Short notReturned) {
        this.notReturned = notReturned;
    }

    public Integer getReasonId() {
        return reasonId;
    }

    public void setReasonId(Integer reasonId) {
        this.reasonId = reasonId;
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

}

