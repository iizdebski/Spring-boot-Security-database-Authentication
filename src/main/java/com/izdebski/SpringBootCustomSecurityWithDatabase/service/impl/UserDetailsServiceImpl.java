package com.izdebski.SpringBootCustomSecurityWithDatabase.service.impl;

import java.util.Arrays;

import com.izdebski.SpringBootCustomSecurityWithDatabase.dao.UserInfoDAO;
import com.izdebski.SpringBootCustomSecurityWithDatabase.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserInfoDAO userInfoDAO;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserInfo userInfo = userInfoDAO.getActiveUser(userName);
        GrantedAuthority authority = new SimpleGrantedAuthority(userInfo.getRole());

        User user = new User(userInfo.getUserName(),userInfo.getPassword(),Arrays.asList(authority));

        UserDetails userDetails = (UserDetails)user;
        return userDetails;
    }
}