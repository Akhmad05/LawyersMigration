package ru.scli.lawyersmigration.model.db1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REGIONS")
public class Regions {
    @Id
    @Column(name="REG_CODE", length = 3)
    private String regCode;
    @Column(name="REG_CAPTION", length = 80)
    private String regCaption;

    public String getRegCode() {
        return regCode;
    }

    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }

    public String getRegCaption() {
        return regCaption;
    }

    public void setRegCaption(String regCaption) {
        this.regCaption = regCaption;
    }
}
