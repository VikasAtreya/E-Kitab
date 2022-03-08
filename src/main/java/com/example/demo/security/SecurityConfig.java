package com.example.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity //to enable web security
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	// in it we will define our url's
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		super.configure(http);
	}
	// will tell which type of authentication is required
	@Override 
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		super.configure(auth);
	}
}
