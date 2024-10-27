package com.entity.model;

import com.entity.TousuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 投诉信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
public class TousuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 投诉名称
	 */
	
	private String tousumingcheng;
		
	/**
	 * 投诉内容
	 */
	
	private String tousuneirong;
		
	/**
	 * 投诉日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tousuriqi;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：投诉名称
	 */
	 
	public void setTousumingcheng(String tousumingcheng) {
		this.tousumingcheng = tousumingcheng;
	}
	
	/**
	 * 获取：投诉名称
	 */
	public String getTousumingcheng() {
		return tousumingcheng;
	}
				
	
	/**
	 * 设置：投诉内容
	 */
	 
	public void setTousuneirong(String tousuneirong) {
		this.tousuneirong = tousuneirong;
	}
	
	/**
	 * 获取：投诉内容
	 */
	public String getTousuneirong() {
		return tousuneirong;
	}
				
	
	/**
	 * 设置：投诉日期
	 */
	 
	public void setTousuriqi(Date tousuriqi) {
		this.tousuriqi = tousuriqi;
	}
	
	/**
	 * 获取：投诉日期
	 */
	public Date getTousuriqi() {
		return tousuriqi;
	}
			
}
