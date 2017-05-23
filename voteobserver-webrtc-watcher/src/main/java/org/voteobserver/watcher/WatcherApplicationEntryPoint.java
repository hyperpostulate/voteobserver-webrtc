package org.voteobserver.watcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAutoConfiguration
@Import(EndpointConfig.class)
public class WatcherApplicationEntryPoint {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WatcherApplicationEntryPoint.class, args);
	}
}
