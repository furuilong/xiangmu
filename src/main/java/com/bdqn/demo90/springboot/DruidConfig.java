package com.bdqn.demo90.springboot;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.zaxxer.hikari.util.DriverDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @outhor shkstart
 * 浮瑞龙
 */
@Configuration
public class DruidConfig {

    //    @ConfigurationProperties(prefix = "spring.datasource")
//    @Bean
//    public DataSource druid(){
//        return  new DruidDataSource();
//    }
//    public ServletRegistrationBean statViewServlet(){
//        ServletRegistrationBean bean=new ServletRegistrationBean (new StatViewServlet(),"/druid/*");
//        bean.addInitParameter("allow", "127.0.0.1");
//        //IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的即提示:Sorry, you are not permitted to view this page.
//        bean.addInitParameter("deny", "192.168.1.100");
//        //登录查看信息的账号密码.
//        bean.addInitParameter("loginUsername", "druid");
//        bean.addInitParameter("loginPassword", "12345678");
//        //是否能够重置数据.
//        bean.addInitParameter("resetEnable", "false");
//        return bean;
//    }
    @Bean
    public ServletRegistrationBean statViewServle() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        //IP白名单
        //servletRegistrationBean.addInitParameter("allow","192.168.1.12,127.0.0.1");
        //IP黑名单
        //servletRegistrationBean.addInitParameter("deny","192.168.4.23");
        //控制台用户
        servletRegistrationBean.addInitParameter("loginUsername", "admin");
        servletRegistrationBean.addInitParameter("loginPassword", "123456");
        //是否能够重置数据
        servletRegistrationBean.addInitParameter("resetEnable", "false");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean statFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        //添加过滤规则
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }

}
