package com.damon.oa.model;

import lombok.Data;

import java.io.Serializable;

/**
 *  用户 角色 中间表
 *
 * @author Damon Chen
 * @date 2021/03/09
 */
@Data
public class UserRole implements Serializable {

    private static final long serialVersionUID = 5L;
    /**
     *  主键
     */
    private Integer id;
    /**
     *  用户表主键
     */
    private Integer userId;
    /**
     *  角色表主键
     */
    private Integer roleId;

}
