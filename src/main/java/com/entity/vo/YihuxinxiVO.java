package com.entity.vo;

import com.entity.YihuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 医护信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
public class YihuxinxiVO  implements Serializable {
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
	 * 医护类型
	 */
	
	private String yihuleixing;
		
	/**
	 * 医院
	 */
	
	private String yiyuan;
		
	/**
	 * 科室
	 */
	
	private String keshi;
		
	/**
	 * 擅长
	 */
	
	private String shanzhang;
		
	/**
	 * 简介
	 */
	
	private String jianjie;
				
	
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
	 * 设置：医护类型
	 */
	 
	public void setYihuleixing(String yihuleixing) {
		this.yihuleixing = yihuleixing;
	}
	
	/**
	 * 获取：医护类型
	 */
	public String getYihuleixing() {
		return yihuleixing;
	}
				
	
	/**
	 * 设置：医院
	 */
	 
	public void setYiyuan(String yiyuan) {
		this.yiyuan = yiyuan;
	}
	
	/**
	 * 获取：医院
	 */
	public String getYiyuan() {
		return yiyuan;
	}
				
	
	/**
	 * 设置：科室
	 */
	 
	public void setKeshi(String keshi) {
		this.keshi = keshi;
	}
	
	/**
	 * 获取：科室
	 */
	public String getKeshi() {
		return keshi;
	}
				
	
	/**
	 * 设置：擅长
	 */
	 
	public void setShanzhang(String shanzhang) {
		this.shanzhang = shanzhang;
	}
	
	/**
	 * 获取：擅长
	 */
	public String getShanzhang() {
		return shanzhang;
	}
				
	
	/**
	 * 设置：简介
	 */
	 
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	
	/**
	 * 获取：简介
	 */
	public String getJianjie() {
		return jianjie;
	}
			
}
