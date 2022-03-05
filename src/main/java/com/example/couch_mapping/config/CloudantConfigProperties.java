package com.example.couch_mapping.config;

import java.net.URL;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="cloudant")
@Data
public class CloudantConfigProperties {

    private URL url;

    private String username;

    private String password;

    private String db;
}
