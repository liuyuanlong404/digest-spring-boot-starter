package com.lakers.digest.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created on 2023/2/27 11:08
 *
 * @author lakers
 */
@Component
@ConfigurationProperties(prefix = "digest")
public class Settings {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
