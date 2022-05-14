
package com.lucreciaguisasola.portafolio.seguridad;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SeguridadConfig {

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(final HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/admin/*").hasRole("ADMIN")
                .antMatchers("/css/*", "/js/*", "/img/*",
                        "/**").permitAll()
                .and().
                formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/logincheck")
                .usernameParameter("username")
                .passwordParameter("password")
                .defaultSuccessUrl("/portafolio")
                .permitAll()
                .and().logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout")             
                .permitAll().
                and().csrf().disable();
    }

}

}
