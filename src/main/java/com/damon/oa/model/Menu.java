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
 * @date 2021-03-31 11:37:00
 */
@Data
@TableName("menu")
public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private String url;
	/**
	 * 
	 */
	private String path;
	/**
	 * 
	 */
	private String component;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String iconcls;
	/**
	 * 
	 */
	private Integer keepalive;
	/**
	 * 
	 */
	private Integer requireauth;
	/**
	 * 
	 */
	private Integer parentid;
	/**
	 * 
	 */
	private Integer enabled;

}
