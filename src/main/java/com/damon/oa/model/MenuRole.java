package com.damon.oa.model;

import lombok.Data;

import java.io.Serializable;

/**
 *  资源 角色 关联表
 *
 * @author Damon Chen
 * @date 2021/03/09
 */
@Data
public class MenuRole implements Serializable {

    private static final long serialVersionUID = 4L;
    /**
     *  主键
     */
    private Integer id;
    /**
     *  资源表主键
     */
    private Integer menuId;
    /**
     *  角色表主键
     */
    private Integer roleId;

}
