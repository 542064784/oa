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
 * @date 2021-03-31 11:37:01
 */
@Data
@TableName("employeetrain")
public class Employeetrain implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 员工编号
	 */
	private Integer eid;
	/**
	 * 培训日期
	 */
	private Date traindate;
	/**
	 * 培训内容
	 */
	private String traincontent;
	/**
	 * 备注
	 */
	private String remark;

}
