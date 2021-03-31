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
@TableName("oplog")
public class Oplog implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 添加日期
	 */
	private Date adddate;
	/**
	 * 操作内容
	 */
	private String operate;
	/**
	 * 操作员ID
	 */
	private Integer userid;

}
