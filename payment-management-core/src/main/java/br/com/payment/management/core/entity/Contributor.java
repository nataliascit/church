package br.com.payment.management.core.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * Entity which represents the table with the definition of a person who will make contributions for a certain {@link Church}.
 *
 * @author wcustodio
 */
@Entity
@Table(name = "CONTRIBUTOR")
public class Contributor implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "FISCAL_NUMBER")
    private Long fiscalNumber;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "CIVIL_STATE")
    private String civilState;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    @Column(name = "MARRIAGE_DATE")
    private Date marriageDate;

    @Column(name = "PARTNER_NAME")
    private String partnerName;

    @Column(name = "TELEPHONE")
    private Long telephone;

    @Column(name = "CELLPHONE")
    private Long cellphone;

    @OneToMany(mappedBy = "contributor")
    private List<Contribution> contributions;

    @OneToMany(mappedBy = "contributor")
    private List<Bead> beads;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getFiscalNumber() {
        return fiscalNumber;
    }

    public void setFiscalNumber(Long fiscalNumber) {
        this.fiscalNumber = fiscalNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCivilState() {
        return civilState;
    }

    public void setCivilState(String civilState) {
        this.civilState = civilState;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(Date marriageDate) {
        this.marriageDate = marriageDate;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public Long getCellphone() {
        return cellphone;
    }

    public void setCellphone(Long cellphone) {
        this.cellphone = cellphone;
    }

    public List<Contribution> getContributions() {
        return contributions;
    }

    public void setContributions(List<Contribution> contributions) {
        this.contributions = contributions;
    }

    public List<Bead> getBeads() {
        return beads;
    }

    public void setBeads(List<Bead> beads) {
        this.beads = beads;
    }
}
