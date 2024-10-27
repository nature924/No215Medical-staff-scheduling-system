package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 医护信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
@TableName("yihuxinxi")
public class YihuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YihuxinxiEntity() {
		
	}
	
	public YihuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 工号
	 */
					
	private String gonghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
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
