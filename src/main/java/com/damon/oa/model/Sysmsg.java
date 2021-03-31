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
@TableName("sysmsg")
public class Sysmsg implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 消息id
	 */
	private Integer mid;
	/**
	 * 0表示群发消息
	 */
	private Integer type;
	/**
	 * 这条消息是给谁的
	 */
	private Integer userid;
	/**
	 * 0 未读 1 已读
	 */
	private Integer state;

}
