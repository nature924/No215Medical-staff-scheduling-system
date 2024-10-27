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
 * 科室信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
@TableName("keshixinxi")
public class KeshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KeshixinxiEntity() {
		
	}
	
	public KeshixinxiEntity(T t) {
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
	 * 科室
	 */
					
	private String keshi;
	
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
