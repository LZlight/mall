package com.light.chen.user.config;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 动态表名
 * </p>
 *
 * @author jack_sun
 * @since 2020-02-24
 */
@Slf4j
@Configuration
@MapperScan("com.light.chen.**.mapper")
public class MybatisPlusConfig {


}
