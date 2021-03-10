package com.damon.oa.service;

import com.damon.oa.mapper.UserMapper;
import com.damon.oa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Transient;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *  用户service
 *
 * @author Damon Chen
 * @date 2021/03/10
 */
@Component
@Transactional
public class UserService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        final User user = userMapper.loadUserByUsername(username);
        if (null == user) {
            throw new UsernameNotFoundException("未找到用户.");
        }
        return user;
    }
}
