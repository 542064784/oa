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
@TableName("adjustsalary")
public class Adjustsalary implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private Integer eid;
	/**
	 * 调薪日期
	 */
	private Date asdate;
	/**
	 * 调前薪资
	 */
	private Integer beforesalary;
	/**
	 * 调后薪资
	 */
	private Integer aftersalary;
	/**
	 * 调薪原因
	 */
	private String reason;
	/**
	 * 备注
	 */
	private String remark;

}
