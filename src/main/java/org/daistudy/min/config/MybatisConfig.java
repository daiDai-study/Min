package org.daistudy.min.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("org.daistudy.min.mapper")
public class MybatisConfig {
}
