package com.example.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = MybatisConfig.BASE_PACKAGE, sqlSessionFactoryRef = "dealMasterSqlSessionFactory")
public class MybatisConfig {
    static final String BASE_PACKAGE = "com.example.demo";
    private static final String MAPPER_LOCATIONS_PATH = "classpath:/sql/**/*.xml";

    @Autowired
    @Qualifier("DataSource")
    public DataSource dataSource;

    @Bean
    public SqlSessionFactory dealMasterSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver pathResolver = new PathMatchingResourcePatternResolver();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setMapperLocations(pathResolver.getResources(MAPPER_LOCATIONS_PATH));
        return sessionFactoryBean.getObject();
    }
}
