package br.com.payment.management.core.enumerable;

/**
 * Catalog with all main information used by the unit tests.
 *
 * @author wcustodio
 */
public enum ConfigurationCatalog {

    BASE_TEST_CASE_DIRECTORY("/testCases"),

    BASE_COMMON_DIRECTORY(BASE_TEST_CASE_DIRECTORY.getValue() + "/common"),

    BEAD_FILE_PATH(BASE_COMMON_DIRECTORY.getValue() + "/bead.json"),

    CAMPAIGN_FILE_PATH(BASE_COMMON_DIRECTORY.getValue() + "/campaign.json"),

    CHURCH_FILE_PATH(BASE_COMMON_DIRECTORY.getValue() + "/church.json"),

    CONTRIBUTOR_FILE_PATH(BASE_COMMON_DIRECTORY.getValue() + "/contributor.json"),

    CONTRIBUTION_FILE_PATH(BASE_COMMON_DIRECTORY.getValue() + "/contribution.json");

    private String value;

    ConfigurationCatalog(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
