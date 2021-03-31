package com.damon.oa.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author Damon Chen
 * @email 542064784@qq.com
 * @date 2021-03-31 11:37:00
 */
@Data
@TableName("joblevel")
public class Joblevel implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 职称名称
	 */
	private String name;
	/**
	 * 
	 */
	private Enum titlelevel;
	/**
	 * 
	 */
	private Date createdate;
	/**
	 * 
	 */
	private Integer enabled;

}
