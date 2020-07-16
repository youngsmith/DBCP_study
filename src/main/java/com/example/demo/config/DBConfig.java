package com.example.demo.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@RequiredArgsConstructor
public class DBConfig {
    private final DBProperties dbProperties;


    @Bean(name = "DataSource")
    public HikariDataSource dataSource2() {
        HikariConfig config = new HikariConfig("/Users/we/Desktop/demo/src/main/resources/HikariConfig.properties");
        return new HikariDataSource(config);
    }


//    @Bean(name = "DataSource")
//    public BasicDataSource dataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setUrl(dbProperties.getUrl());
//        dataSource.setUsername(dbProperties.getUsername());
//        dataSource.setDriverClassName(dbProperties.getDriverClassName());
//        dataSource.setPassword(dbProperties.getPassword());
//        dataSource.setMaxTotal(20);
//        dataSource.setMaxIdle(20);
//        dataSource.setMinIdle(0);
//        dataSource.setInitialSize(20);
//        dataSource.setMaxWaitMillis(300);
//        return dataSource;
//    }

//    @Bean(name = "DataSource")
//    public DataSource dataSource2() {
//        DataSource dataSource = new DataSource();
//        dataSource.setUrl(dbProperties.getUrl());
//        dataSource.setUsername(dbProperties.getUsername());
//        dataSource.setDriverClassName(dbProperties.getDriverClassName());
//        dataSource.setPassword(dbProperties.getPassword());
//        dataSource.setMaxActive(4);
//        dataSource.setMaxIdle(4);
//        dataSource.setMinIdle(0);
//        dataSource.setInitialSize(4);
//        dataSource.setMaxWait(300);
//        return dataSource;
//    }
}