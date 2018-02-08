package br.com.payment.management.security.common.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

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

  @Value("${spring.security.role.admin.securedUrl}")
  private String adminRoleSecuredUrl;

  @Value("${spring.security.ignoredUrl}")
  private String ignoredUrl;

  public String getUsersQuery() {
    return usersQuery;
  }

  public String getRolesQuery() {
    return rolesQuery;
  }

  public String getLoginUrl() {
    return loginUrl;
  }

  public String getLoginErrorUrl() {
    return loginErrorUrl;
  }

  public String getLoginSuccessUrl() {
    return loginSuccessUrl;
  }

  public String getLoginAccessDeniedUrl() {
    return loginAccessDeniedUrl;
  }

  public String getLogoutUrl() {
    return logoutUrl;
  }

  public String getAdminRole() {
    return adminRole;
  }

  public String getAdminRoleSecuredUrl() {
    return adminRoleSecuredUrl;
  }

  public String getIgnoredUrl() {
    return ignoredUrl;
  }
}
