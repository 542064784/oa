package com.damon.oa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *  用户表
 *
 * @author Damon Chen
 * @date 2021/03/09
 */
@Data
public class User implements UserDetails {

    /**
     *  主键
     */
    private Integer id;
    /**
     *  名称
     */
    private String name;
    /**
     *  电话
     */
    private String phone;
    /**
     *  移动电话
     */
    private String telephone;
    /**
     *  地址
     */
    private String address;
    /**
     *  是否启用
     */
    private Boolean enabled;
    /**
     *  用户名
     */
    private String username;
    /**
     *  密码
     */
    private String password;
    /**
     *  用户界面
     */
    private String userFace;
    /**
     *  备注
     */
    private String remark;
    /**
     *  角色集合
     */
    private List<Role> roles;

    /**
     *  获得所有权限
     *
     * @return  GrantedAuthority collection
     */
    @Override
    @JsonIgnore
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>(roles.size());
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    /**
     *  账户是否未过期
     *
     * @return  true
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     *  账户是否未锁定
     *
     * @return  true
     */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     *  凭证是否未过期
     *
     * @return  true
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     *  是否启用
     *
     * @return   enabled
     */
    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
