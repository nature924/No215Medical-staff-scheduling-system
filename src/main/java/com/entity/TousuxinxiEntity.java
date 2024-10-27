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
 * 投诉信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
@TableName("tousuxinxi")
public class TousuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TousuxinxiEntity() {
		
	}
	
	public TousuxinxiEntity(T t) {
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tousuriqi;
	
	
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
