package com.entity.model;

import com.entity.KeshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 科室信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
public class KeshixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 科室介绍
	 */
	
	private String keshijieshao;
		
	/**
	 * 科室位置
	 */
	
	private String keshiweizhi;
		
	/**
	 * 科室医生
	 */
	
	private String keshiyisheng;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：科室介绍
	 */
	 
	public void setKeshijieshao(String keshijieshao) {
		this.keshijieshao = keshijieshao;
	}
	
	/**
	 * 获取：科室介绍
	 */
	public String getKeshijieshao() {
		return keshijieshao;
	}
				
	
	/**
	 * 设置：科室位置
	 */
	 
	public void setKeshiweizhi(String keshiweizhi) {
		this.keshiweizhi = keshiweizhi;
	}
	
	/**
	 * 获取：科室位置
	 */
	public String getKeshiweizhi() {
		return keshiweizhi;
	}
				
	
	/**
	 * 设置：科室医生
	 */
	 
	public void setKeshiyisheng(String keshiyisheng) {
		this.keshiyisheng = keshiyisheng;
	}
	
	/**
	 * 获取：科室医生
	 */
	public String getKeshiyisheng() {
		return keshiyisheng;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
			
}
