package io.insource.spring.ws.examples.gateway.service;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collections;

/* Not marked @Component to simplify WebSecurityConfiguration. */
public class SimpleUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO: Implement with your own logic to resolve username
        return new User(username, "", Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER")));
    }
}
