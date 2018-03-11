package br.com.payment.management.core.contributor.model;

import br.com.payment.management.core.bead.model.Bead;
import br.com.payment.management.core.church.model.Church;
import br.com.payment.management.core.contribution.model.Contribution;
import br.com.payment.management.core.contributor.enumerable.CivilStateType;
import br.com.payment.management.core.contributor.enumerable.GenderType;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Entity which represents the table with the definition of a person who will make contributions for a certain {@link Church}.
 *
 * @author wcustodio
 */
@Entity
@Table(name = "CONTRIBUTOR",
        uniqueConstraints = @UniqueConstraint(name = "UK_CONTRIBUTOR_F_NUMBER", columnNames = {"FISCAL_NUMBER"})
)
public class Contributor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @NotEmpty(message = "application.contributor.messages.name.empty")
    @Column(name = "NAME")
    private String name;

    @Column(name = "FISCAL_NUMBER")
    private Long fiscalNumber;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "application.contributor.messages.gender.empty")
    @Column(name = "GENDER")
    private GenderType gender;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "application.contributor.messages.civilState.empty")
    @Column(name = "CIVIL_STATE")
    private CivilStateType civilState;

    @NotEmpty(message = "application.contributor.messages.address.empty")
    @Column(name = "ADDRESS")
    private String address;

    @NotNull(message = "application.contributor.messages.birthDate.empty")
    @Column(name = "BIRTH_DATE")
    private LocalDateTime birthDate;

    @Column(name = "MARRIAGE_DATE")
    private LocalDateTime marriageDate;

    @Column(name = "PARTNER_NAME")
    private String partnerName;

    @Column(name = "TELEPHONE")
    private Long telephone;

    @Column(name = "CELLPHONE")
    private Long cellphone;

    @OneToMany
    @JoinColumn(name="ID_CONTRIBUTOR", referencedColumnName = "ID")
    private List<Contribution> contributions;

    @OneToMany
    @JoinColumn(name="ID_CONTRIBUTOR", referencedColumnName = "ID")
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

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public CivilStateType getCivilState() {
        return civilState;
    }

    public void setCivilState(CivilStateType civilState) {
        this.civilState = civilState;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDateTime getMarriageDate() {
        return marriageDate;
    }

    public void setMarriageDate(LocalDateTime marriageDate) {
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
