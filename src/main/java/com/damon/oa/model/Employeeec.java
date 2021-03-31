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
@TableName("employeeec")
public class Employeeec implements Serializable {
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
	 * 奖罚日期
	 */
	private Date ecdate;
	/**
	 * 奖罚原因
	 */
	private String ecreason;
	/**
	 * 奖罚分
	 */
	private Integer ecpoint;
	/**
	 * 奖罚类别，0：奖，1：罚
	 */
	private Integer ectype;
	/**
	 * 备注
	 */
	private String remark;

}
