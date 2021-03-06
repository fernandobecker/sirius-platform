package br.com.fiorde.gatewayserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.config.GatewayProperties;

import javax.annotation.PostConstruct;
import java.lang.invoke.MethodHandles;
import java.util.Objects;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@Autowired
	private GatewayProperties props;

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@PostConstruct
	public void init() {
		logger.info(Objects.toString(props));
	}
}
