package com.entity.view;

import com.entity.DiscusskeshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 科室信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 16:41:20
 */
@TableName("discusskeshixinxi")
public class DiscusskeshixinxiView  extends DiscusskeshixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusskeshixinxiView(){
	}
 
 	public DiscusskeshixinxiView(DiscusskeshixinxiEntity discusskeshixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusskeshixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
