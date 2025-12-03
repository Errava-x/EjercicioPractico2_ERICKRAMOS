/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico2.demo;

/**
 *
 * @author enano
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {   

    
 @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/public").permitAll() 
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/login") 
                .permitAll()
            )
            .logout(logout -> logout.permitAll());

        return http.build();
    }

    
    /*@Bean
    public UsuarioDetallesService usuarioDetallesService() {
       Username("usuario")
                .password("{noop}password") // {noop} indica sin codificación
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }*/


}
