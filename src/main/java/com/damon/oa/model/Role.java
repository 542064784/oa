package com.damon.oa.model;

import lombok.Data;

import java.io.Serializable;

/**
 *  角色表
 *
 * @author Damon Chen
 * @date 2021/03/09
 */
@Data
public class Role implements Serializable {

    private static final long serialVersionUID = 2L;
    /**
     *   主键
     */
    private Integer id;
    /**
     *  英文名称
     */
    private String name;
    /**
     *  中文名称
     */
    private String nameZh;

}
