//package org.example.account_service.configs;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//import java.net.http.HttpRequest;
//
//@Configuration
public class SecurityConfiguration {
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.authorizeHttpRequests(
//                (requests) -> {
//                    try{
//                        requests
//                                .anyRequest().permitAll()
//                                .and().cors().disable()
//                                .csrf().disable();
//                    }catch (Exception e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//        );
//        return httpSecurity.build();
//    }

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.authorizeHttpRequests(
//                (requests) -> {
//                    try{
//                        requests.requestMatchers("/demo").permitAll()
//                                .anyRequest().authenticated()
//                                .and().cors().disable()
//                                .csrf().disable();
//                    }catch (Exception e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//        );
//        return httpSecurity.build();
//    }


//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http.cors().disable()
//                .csrf().disable()
//                .authorizeHttpRequests().requestMatchers("/demo").permitAll().and()
//                .build();
//    }
}
