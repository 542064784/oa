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
@TableName("appraise")
public class Appraise implements Serializable {
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
	 * 考评日期
	 */
	private Date appdate;
	/**
	 * 考评结果
	 */
	private String appresult;
	/**
	 * 考评内容
	 */
	private String appcontent;
	/**
	 * 备注
	 */
	private String remark;

}
