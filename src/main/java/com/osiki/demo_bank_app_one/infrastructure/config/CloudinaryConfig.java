package com.osiki.demo_bank_app_one.infrastructure.config;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CloudinaryConfig {
    private final String CLOUD_NAME = "dxvrgukbs";


    private final String API_KEY = "675522941385482";

    @Value("${cloudinary.api.secret}")
    private String API_SECRET;
//    private final String API_SECRET = "fK5hquVGIdMJCt-vX3666deV4nE";

    @Bean
    public Cloudinary cloudinary() {
        Map<String, String> config = new HashMap<>();

        config.put("cloud_name", CLOUD_NAME);
        config.put("api_key", API_KEY);
        config.put("api_secret", API_SECRET);

        return new Cloudinary(config);

    }
}
