package app.reddot.config;

//CODE BELOW IS TO LIFT RESTRICTIONS ON DATABASE CONSOLE ACCESS

//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/h2-console/**").permitAll()
//                .anyRequest().authenticated();
//
//        http.csrf().disable();
//        http.headers().frameOptions().disable();
//    }
//}
