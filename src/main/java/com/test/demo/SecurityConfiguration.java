// package com.test.demo;

// import com.test.demo.Services.UserDetailsLoader;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// public class SecurityConfiguration{

//     private UserDetailsLoader usersLoader;

//     public SecurityConfiguration(UserDetailsLoader usersLoader) {
//         this.usersLoader = usersLoader;
//     }

//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }

// //     @Bean
// //     public InMemoryUserDetailsManager userDetailsService() {
// //         auth
// //                 .userDetailsService(usersLoader) // How to find users by their username
// //                 .passwordEncoder(passwordEncoder()) // How to encode and verify passwords
// //         ;
// //         return new InMemoryUserDetailsManager(user);
// //     }
// // }
// //     @Override
// //     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
// //         auth
// //                 .userDetailsService(usersLoader) // How to find users by their username
// //                 .passwordEncoder(passwordEncoder()) // How to encode and verify passwords
// //         ;
// //     }


//     // @Bean
//     // public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        
//     //     http
//     //     /* Login configuration */
//     //     .formLogin()
//     //     .loginPage("/login")
//     //     .defaultSuccessUrl("/profile") // user's home page, it can be any URL
//     //     .permitAll() // Anyone can go to the login page
//     //     /* Logout configuration */
//     //     .and()
//     //     .logout()
//     //     .logoutSuccessUrl("/login?logout") // append a query string value
//     //     /* Pages that can be viewed without having to log in */
//     //     .and()
//     //     .authorizeHttpRequests()
//     //     .requestMatchers("/", "/posts") // anyone can see the home and the ads pages
//     //     .permitAll()
//     //     /* Pages that require authentication */
//     //     // .and()
//     //     // .authorizeHttpRequests()
//     //     // .requestMatchers("/") // anyone can see the home and the ads pages
//     //     // (
//     //     //         "/posts/create", // only authenticated users can create ads
//     //     //         "/posts/{id}/edit",// only authenticated users can edit ads
//     //     //         "/posts/user-posts",// only authenticated users can view personal posts
//     //     //         "/profile",//only authenticated users can access the profile page
//     //     //         "/profile/edit"//only authenticated users can access the edit profile page
//     //     // )
//     //     // .authenticated()
//     //     ;
//     //     return http.build();
//     // }

    
//     // @Override
//     // protected void configure(HttpSecurity http) throws Exception {
//     //     http
//     //             /* Login configuration */
//     //             .formLogin()
//     //             .loginPage("/login")
//     //             .defaultSuccessUrl("/profile") // user's home page, it can be any URL
//     //             .permitAll() // Anyone can go to the login page
//     //             /* Logout configuration */
//     //             .and()
//     //             .logout()
//     //             .logoutSuccessUrl("/login?logout") // append a query string value
//     //             /* Pages that can be viewed without having to log in */
//     //             .and()
//     //             .authorizeRequests()
//     //             .antMatchers("/", "/posts") // anyone can see the home and the ads pages
//     //             .permitAll()
//     //             /* Pages that require authentication */
//     //             .and()
//     //             .authorizeRequests()
//     //             .antMatchers(
//     //                     "/posts/create", // only authenticated users can create ads
//     //                     "/posts/{id}/edit",// only authenticated users can edit ads
//     //                     "/posts/user-posts",// only authenticated users can view personal posts
//     //                     "/profile",//only authenticated users can access the profile page
//     //                     "/profile/edit"//only authenticated users can access the edit profile page
//     //             )
//     //             .authenticated()
//     //     ;
//     // }
// }
