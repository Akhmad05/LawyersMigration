package ru.scli.lawyersmigration.config;

import java.util.HashMap;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;


@Configuration
@EnableJpaRepositories(basePackages = {"ru.scli.lawyersmigration.repository.db1"},
        entityManagerFactoryRef = "db1EntityManager",
        transactionManagerRef = "db1TransactionManager")
@PropertySource("classpath:db.properties")
public class DB1_DataSource {

    @Autowired
    private Environment env;

    @Bean
    public LocalContainerEntityManagerFactoryBean db1EntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(db1Datasource());
        em.setPackagesToScan("ru.scli.lawyersmigration.model.db1");
        em.setPersistenceUnitName("db1EntityManager");
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        em.setJpaProperties(hibernateProperties());
        return em;
    }

    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", env.getProperty("db1.dialect"));
        properties.setProperty("hibernate.show-sql", env.getProperty("jdbc.showSql1"));
        return properties;
    }

    @Bean
    public DataSource db1Datasource() {
        DriverManagerDataSource dataSource
                = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("db1.driverClassName1"));
        dataSource.setUrl(env.getProperty("db1.datasource.url"));
        dataSource.setUsername(env.getProperty("db1.datasource.username"));
        dataSource.setPassword(env.getProperty("db1.datasource.password"));

        return dataSource;
    }

    @Bean
    public PlatformTransactionManager db1TransactionManager() {
        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                db1EntityManager().getObject());
        return transactionManager;
    }
}