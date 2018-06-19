package net.yang.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@EnableJpaRepositories("net.yang.core.repository")
@ComponentScan(basePackages = { "net.yang.core" })
@PropertySource("classpath:database.properties")
public class CoreConfig {

}
