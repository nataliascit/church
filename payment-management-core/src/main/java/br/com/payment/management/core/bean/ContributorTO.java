package br.com.payment.management.core.bean;

import java.time.LocalDate;
import java.util.List;

/**
 * Transition Object which represents the table with the definition of a person who will make contributions for a certain {@link ChurchTO}.
 *
 * @author wcustodio.
 */
public class ContributorTO {

    private Long id;

    private String name;

    private Long fiscalNumber;

    private String gender;

    private String civilState;

    private String address;

    private LocalDate birthDate;

    private LocalDate marriageDate;

    private String partnerName;

    private Long telephone;

    private Long cellphone;

    private List<ContributionTO> contributions;

    private List<BeadTO> beads;

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
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

    public List<ContributionTO> getContributions() {
        return contributions;
    }

    public void setContributions(List<ContributionTO> contributions) {
        this.contributions = contributions;
    }

    public List<BeadTO> getBeads() {
        return beads;
    }

    public void setBeads(List<BeadTO> beads) {
        this.beads = beads;
    }
}
