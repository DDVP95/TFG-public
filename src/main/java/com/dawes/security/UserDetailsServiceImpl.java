/*package com.dawes.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dawes.modelo.UserVO;
import com.dawes.servicio.UserServicio;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserServicio us;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserVO user = us.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        return new UserDetailsImpl(user);
    }
}
*/
