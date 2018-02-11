package br.com.payment.management.security.common.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Class responsible for reading the security options from 'application.yml' file.
 *
 * @author wcustodio
 */
@Configuration
public class SecurityParameter {

  @Value("${spring.security.queries.users}")
  private String usersQuery;

  @Value("${spring.security.queries.roles}")
  private String rolesQuery;

  @Value("${spring.security.login.url}")
  private String loginUrl;

  @Value("${spring.security.login.errorUrl}")
  private String loginErrorUrl;

  @Value("${spring.security.login.successUrl}")
  private String loginSuccessUrl;

  @Value("${spring.security.login.accessDeniedUrl}")
  private String loginAccessDeniedUrl;

  @Value("${spring.security.logout.url}")
  private String logoutUrl;

  @Value("${spring.security.role.admin.mnemonic}")
  private String adminRole;

  @Value("${spring.security.role.admin.securedPageUrl}")
  private String adminRoleSecuredPageUrl;

  @Value("${spring.security.role.admin.securedApiUrl}")
  private String adminRoleSecuredApiUrl;

  @Value("${spring.security.ignoredUrl}")
  private String ignoredUrl;

  /**
   * Get the property that defines the query used to retrieve the data associated to the {@link br.com.payment.management.security.user.model.User}.
   * @return The user's query.
   */
  public String getUsersQuery() {
    return usersQuery;
  }

  /**
   * Get the property that defines the query used to retrieve the data associated to the {@link br.com.payment.management.security.user.model.Role}.
   * @return The role's query.
   */
  public String getRolesQuery() {
    return rolesQuery;
  }

  /**
   * Get the property that defines the url for the login page.
   * @return The url for the login page.
   */
  public String getLoginUrl() {
    return loginUrl;
  }

  /**
   * Get the property that defines the url for the login error page.
   * @return The url for the login error page.
   */
  public String getLoginErrorUrl() {
    return loginErrorUrl;
  }

  /**
   * Get the property that defines the url for the login success page.
   * @return The url for the login success page.
   */
  public String getLoginSuccessUrl() {
    return loginSuccessUrl;
  }

  /**
   * Get the property that defines the url when an user has the access denied.
   * @return The url for the access denied page.
   */
  public String getLoginAccessDeniedUrl() {
    return loginAccessDeniedUrl;
  }

  /**
   * Get the property that defines the url for the logout page.
   * @return The url for the logout page.
   */
  public String getLogoutUrl() {
    return logoutUrl;
  }

  /**
   * Get the property that defines the MNEMONIC for the admin role.
   * @return The mnemonic for the admin role.
   */
  public String getAdminRole() {
    return adminRole;
  }

  /**
   * Get the property that defines the url secured by the admin role.
   * @return The url secured by the admin role.
   */
  public String getAdminRoleSecuredPageUrl() {
    return adminRoleSecuredPageUrl;
  }

  /**
   * Get the property that defines the url secured by the admin role.
   * @return The url secured by the admin role.
   */
  public String getAdminRoleSecuredApiUrl() {
    return adminRoleSecuredApiUrl;
  }

  /**
   * Get the property that defines the url for the resources that will be ignored by the security module.
   * @return The ignored url.
   */
  public String getIgnoredUrl() {
    return ignoredUrl;
  }
}
