package ie.manager.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	public void configure(HttpSecurity httpSec) throws Exception{
		httpSec.authorizeRequests()
				.antMatchers("/*").hasRole("USER")//requests going to any page with / before it will require authentication
			.and()
				.formLogin().loginPage("/login").permitAll()//form authentication is used. /login is url used for login form
			.and()
				.logout().permitAll();//allow anyone to log out
	}
	
	@Autowired
	public void ConfigureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
			.withUser("admin").password("admin").roles("USER", "ADMIN");
	}

}
