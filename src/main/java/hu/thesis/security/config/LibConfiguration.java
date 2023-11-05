//package hu.thesis.security.config;
//
//import hu.thesis.security.JwtAuthFilter;
//import hu.thesis.security.JwtTokenService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ComponentScan(basePackages = {"hu.thesis.security"})
//public class LibConfiguration {
//
//    private final JwtTokenService jwtTokenService;
//
//    public LibConfiguration(JwtTokenService jwtTokenService) {
//        this.jwtTokenService = jwtTokenService;
//    }
//
//    @Bean
//    public JwtTokenService jwtTokenService() {
//        return new JwtTokenService();
//    }
//
//    @Bean
//    public JwtAuthFilter jwtAuthFilter() {
//        return new JwtAuthFilter(jwtTokenService);
//    }
//
//}
