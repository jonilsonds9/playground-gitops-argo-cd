package br.com.jonilson.playground;

import org.apache.catalina.Context;
import org.apache.catalina.Wrapper;
import org.apache.catalina.webresources.ExtractingRoot;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatConfig {

    @Bean
    WebServerFactoryCustomizer<TomcatServletWebServerFactory> servletContainerCustomizer() {
        return (TomcatServletWebServerFactory container) -> container.addContextCustomizers((Context context) -> {
            // This configuration is used to improve initialization performance.
            Wrapper jsp = (Wrapper) context.findChild("jsp");
            jsp.addInitParameter("development", "true");
            jsp.addInitParameter("modificationTestInterval", "1000000000000");
            context.setResources(new ExtractingRoot());
            context.setReloadable(false);
        });
    }
}
