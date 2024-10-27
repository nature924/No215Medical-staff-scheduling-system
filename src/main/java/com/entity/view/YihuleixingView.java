package com.entity.view;

import com.entity.YihuleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医护类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
@TableName("yihuleixing")
public class YihuleixingView  extends YihuleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YihuleixingView(){
	}
 
 	public YihuleixingView(YihuleixingEntity yihuleixingEntity){
 	try {
			BeanUtils.copyProperties(this, yihuleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
