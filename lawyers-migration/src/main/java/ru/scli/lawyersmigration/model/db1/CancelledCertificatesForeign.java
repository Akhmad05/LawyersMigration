package ru.scli.lawyersmigration.model.db1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "CANCELLED_CERTIFICATES_FOREIGN")
public class CancelledCertificatesForeign {
    @Id
    @Column(name="ID")
    private Long id;
    @Column(name="COUNTRY")
    private String country;
    @Column(name="COUNTRY_CODE", length = 5)
    private String countryCode;
    @Column(name="DATE_NULLIFICATION", columnDefinition = "Date")
    private Date dateNullification;
    @Column(name="FIO", length = 253)
    private String fio;
    @Column(name="FOREIGN_LAWYER_ID")
    private Long foreign_lawyer_id;
    @Column(name="NOT_RETURNED")
    private Short notReturned;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Date getDateNullification() {
        return dateNullification;
    }

    public void setDateNullification(Date dateNullification) {
        this.dateNullification = dateNullification;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Long getForeign_lawyer_id() {
        return foreign_lawyer_id;
    }

    public void setForeign_lawyer_id(Long foreign_lawyer_id) {
        this.foreign_lawyer_id = foreign_lawyer_id;
    }

    public Short getNotReturned() {
        return notReturned;
    }

    public void setNotReturned(Short notReturned) {
        this.notReturned = notReturned;
    }
}
