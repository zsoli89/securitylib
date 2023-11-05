package hu.webuni.security.config;

import hu.webuni.security.JwtAuthFilter;
import hu.webuni.security.JwtTokenService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"hu.webuni.security"})
public class LibConfiguration {

    private final JwtTokenService jwtTokenService;

    public LibConfiguration(JwtTokenService jwtTokenService) {
        this.jwtTokenService = jwtTokenService;
    }

    @Bean
    public JwtTokenService jwtTokenService() {
        return new JwtTokenService();
    }

    @Bean
    public JwtAuthFilter jwtAuthFilter() {
        return new JwtAuthFilter(jwtTokenService);
    }

}
