
package com.lucreciaguisasola.portafolio.configuraciones;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SeguridadConfig {

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        // @formatter:off
        http
            .csrf().disable()
            .authorizeRequests()
            .antMatchers("/login*", "/logout*").permitAll()
            .antMatchers("/user/updatePassword*", "/user/savePassword*").hasRole("ROLE_USER")
            .antMatchers("/admin/**").hasRole("ROLE_ADMIN")
            .and()
            .formLogin()
            .loginPage("/login")
            .defaultSuccessUrl("/homepage.html")
            .permitAll()
            .and()
            .logout()
            .logoutSuccessUrl("/logout.html")
            .permitAll();
        // @formatter:on
    }

}

}
