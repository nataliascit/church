package br.com.payment.management.webapp.common.configuration.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.boot.orm.jpa.hibernate.SpringNamingStrategy;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.persistenceunit.PersistenceUnitManager;

import javax.sql.DataSource;
import java.util.Map;

/**
 * Class responsible for setting up the local database configuration.
 *
 * @author wcustodio
 */
@Configuration
public class DataBaseConfig implements EnvironmentAware {

    @Autowired(required = false)
    private PersistenceUnitManager persistenceUnitManager;

    private RelaxedPropertyResolver jpaPropertyResolver;

    @Override
    public void setEnvironment(Environment environment) {
        this.jpaPropertyResolver = new RelaxedPropertyResolver(environment, "spring.jpa.");
    }

    @Bean
    @DependsOn("jdbcTemplate")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory( DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {

        final LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        if (persistenceUnitManager != null) {
            entityManagerFactoryBean.setPersistenceUnitManager(persistenceUnitManager);
        }
        entityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        entityManagerFactoryBean.setDataSource(dataSource);
        entityManagerFactoryBean.setPackagesToScan("br.com.payment.management.core");
        entityManagerFactoryBean.getJpaPropertyMap().putAll(jpaPropertyResolver.getSubProperties("properties."));

        final Map<String, Object> properties = entityManagerFactoryBean.getJpaPropertyMap();
        properties.put("hibernate.ejb.naming_strategy", jpaPropertyResolver.getProperty("hibernate.naming-strategy", SpringNamingStrategy.class.getName()));
        properties.put("hibernate.hbm2ddl.auto", jpaPropertyResolver.getProperty("hibernate.ddl-auto", "none"));

        return entityManagerFactoryBean;
    }
}