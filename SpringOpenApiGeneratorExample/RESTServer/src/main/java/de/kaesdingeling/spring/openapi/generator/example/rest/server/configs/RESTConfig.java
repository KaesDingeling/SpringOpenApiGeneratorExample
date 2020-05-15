package de.kaesdingeling.spring.openapi.generator.example.rest.server.configs;

import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RESTConfig {
	
	@Bean
    public WebServerFactoryCustomizer<NettyReactiveWebServerFactory> serverFactoryCustomizer() {
        return new NettyTimeoutCustomizer();
    }

    class NettyTimeoutCustomizer implements WebServerFactoryCustomizer<NettyReactiveWebServerFactory> {

        @Override
        public void customize(NettyReactiveWebServerFactory factory) {
        	factory.setPort(8090);
        }
    }
}