package org.voteobserber.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAutoConfiguration
@Import(EndpointConfig.class)
public class ServerApplicationEntryPoint {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServerApplicationEntryPoint.class, args);
	}
}
