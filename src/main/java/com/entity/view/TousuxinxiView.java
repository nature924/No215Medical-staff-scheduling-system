package com.entity.view;

import com.entity.TousuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投诉信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
@TableName("tousuxinxi")
public class TousuxinxiView  extends TousuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TousuxinxiView(){
	}
 
 	public TousuxinxiView(TousuxinxiEntity tousuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, tousuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
