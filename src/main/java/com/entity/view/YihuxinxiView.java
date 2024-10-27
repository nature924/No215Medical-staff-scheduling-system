package com.entity.view;

import com.entity.YihuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医护信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
@TableName("yihuxinxi")
public class YihuxinxiView  extends YihuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YihuxinxiView(){
	}
 
 	public YihuxinxiView(YihuxinxiEntity yihuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yihuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
