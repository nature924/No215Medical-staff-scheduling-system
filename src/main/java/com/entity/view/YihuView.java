package com.entity.view;

import com.entity.YihuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 医护
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
@TableName("yihu")
public class YihuView  extends YihuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YihuView(){
	}
 
 	public YihuView(YihuEntity yihuEntity){
 	try {
			BeanUtils.copyProperties(this, yihuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
