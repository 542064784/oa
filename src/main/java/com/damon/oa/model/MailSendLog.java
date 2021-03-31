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
@TableName("mail_send_log")
public class MailSendLog implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String msgid;
	/**
	 * 
	 */
	private Integer empid;
	/**
	 * 0发送中，1发送成功，2发送失败
	 */
	private Integer status;
	/**
	 * 
	 */
	private String routekey;
	/**
	 * 
	 */
	private String exchange;
	/**
	 * 重试次数
	 */
	private Integer count;
	/**
	 * 第一次重试时间
	 */
	private Date trytime;
	/**
	 * 
	 */
	private Date createtime;
	/**
	 * 
	 */
	private Date updatetime;

}
