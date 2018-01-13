package br.com.payment.management.core.bean;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Transition Object which represents the table with the definition of a certain campaign used by a {@link ChurchTO}.
 *
 * @author wcustodio.
 */
public class CampaignTO {

    private Long id;

    private String name;

    private LocalDateTime creationDate;

    private LocalDateTime initialDate;

    private LocalDateTime finalDate;

    private ChurchTO church;

    private ProvingTypeTO provingType;

    private List<ContributionTO> contributions;

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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDateTime initialDate) {
        this.initialDate = initialDate;
    }

    public LocalDateTime getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDateTime finalDate) {
        this.finalDate = finalDate;
    }

    public ChurchTO getChurch() {
        return church;
    }

    public void setChurch(ChurchTO church) {
        this.church = church;
    }

    public ProvingTypeTO getProvingType() {
        return provingType;
    }

    public void setProvingType(ProvingTypeTO provingType) {
        this.provingType = provingType;
    }

    public List<ContributionTO> getContributions() {
        return contributions;
    }

    public void setContributions(List<ContributionTO> contributions) {
        this.contributions = contributions;
    }
}