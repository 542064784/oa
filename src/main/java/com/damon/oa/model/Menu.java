package com.damon.oa.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *  资源表
 *
 * @author Damon Chen
 * @date 2021/03/09
 */
@Data
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     *  主键
     */
    private Integer id;
    /**
     *  路径匹配规则
     */
    private String url;
    /**
     *  有权限的path
     */
    private String path;
    /**
     *  组件
     */
    private String component;
    /**
     *  名称
     */
    private String name;
    /**
     *  图标
     */
    private String iconCls;
    /**
     *  是否使用
     */
    private String keepAlive;
    /**
     *  要求权限
     */
    private String requireAuth;
    /**
     *  父Id
     */
    private String parentId;
    /**
     *  子资源集合
     */
    private List<Menu> children;
    /**
     *  角色集合
     */
    private List<Role> roles;


}
