package com.poseidon.springboot_study;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: jiong.yu
 * @Date: Create at 2022-10-29
 */
// 定义要封装的对象
@Data
// 定义为spring管控的Bean
@Component
// 指定要加载的数据
@ConfigurationProperties(prefix = "datasource")
public class MyDatasource {
    private String driver;
    private String url;
    private String username;
    private String password;
}
