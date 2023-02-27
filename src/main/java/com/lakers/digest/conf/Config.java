package com.lakers.digest.conf;

import com.lakers.digest.Digest;
import com.lakers.digest.impl.Md5Digest;
import com.lakers.digest.impl.ShaDigest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 2023/2/27 11:09
 *
 * @author lakers
 */
@Configuration
@EnableConfigurationProperties(Settings.class)
public class Config {

    private final Logger log = LoggerFactory.getLogger(Config.class);

    @Bean
    @ConditionalOnProperty(prefix = "digest", name = "type", havingValue = "md5")
    public Digest md5Digest() {
        log.info("Loading-MD5算法加密Bean");
        return new Md5Digest();
    }

    @Bean
    @ConditionalOnProperty(prefix = "digest", name = "type", havingValue = "sha")
    public Digest shaDigest() {
        log.info("Loading-Sha算法加密Bean");
        return new ShaDigest();
    }
}
