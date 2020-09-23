package ru.scli.lawyersmigration.model.db1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CHANGE_FIO_FILTER")
public class ChangeFioFilter {
    @Id
    @Column(name="ID")
    private Long id;
    @Column(name="LAWYER_ID")
    private Long lawyerId;
    @Column(name="NEW_FIO", length = 150)
    private String newFio;
    @Column(name="OLD_FIO", length = 150)
    private String oldFio;
    @Column(name="ORDER_NAME", length = 80)
    private String orderName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLawyerId() {
        return lawyerId;
    }

    public void setLawyerId(Long lawyerId) {
        this.lawyerId = lawyerId;
    }

    public String getNewFio() {
        return newFio;
    }

    public void setNewFio(String newFio) {
        this.newFio = newFio;
    }

    public String getOldFio() {
        return oldFio;
    }

    public void setOldFio(String oldFio) {
        this.oldFio = oldFio;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}

