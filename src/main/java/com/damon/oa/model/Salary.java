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
@TableName("salary")
public class Salary implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 基本工资
	 */
	private Integer basicsalary;
	/**
	 * 奖金
	 */
	private Integer bonus;
	/**
	 * 午餐补助
	 */
	private Integer lunchsalary;
	/**
	 * 交通补助
	 */
	private Integer trafficsalary;
	/**
	 * 应发工资
	 */
	private Integer allsalary;
	/**
	 * 养老金基数
	 */
	private Integer pensionbase;
	/**
	 * 养老金比率
	 */
	private Float pensionper;
	/**
	 * 启用时间
	 */
	private Date createdate;
	/**
	 * 医疗基数
	 */
	private Integer medicalbase;
	/**
	 * 医疗保险比率
	 */
	private Float medicalper;
	/**
	 * 公积金基数
	 */
	private Integer accumulationfundbase;
	/**
	 * 公积金比率
	 */
	private Float accumulationfundper;
	/**
	 * 
	 */
	private String name;

}
