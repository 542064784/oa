package com.damon.oa.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * 
 * @author Damon Chen
 * @email 542064784@qq.com
 * @date 2021-03-31 11:37:01
 */
@Data
@TableName("department")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 部门名称
	 */
	private String name;
	/**
	 * 
	 */
	private Integer parentid;
	/**
	 * 
	 */
	private String deppath;
	/**
	 * 
	 */
	private Integer enabled;
	/**
	 * 
	 */
	private Integer isparent;

}
