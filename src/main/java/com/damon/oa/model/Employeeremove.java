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
@TableName("employeeremove")
public class Employeeremove implements Serializable {
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
	 * 调动后部门
	 */
	private Integer afterdepid;
	/**
	 * 调动后职位
	 */
	private Integer afterjobid;
	/**
	 * 调动日期
	 */
	private Date removedate;
	/**
	 * 调动原因
	 */
	private String reason;
	/**
	 * 
	 */
	private String remark;

}
