package com.boa.customerapiext.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@RefreshScope
@ConfigurationProperties(prefix = "config")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageConfiguration {
	@Value("${message}")
	private String message;
}
