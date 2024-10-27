package com.entity.view;

import com.entity.PaibanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 排班信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
@TableName("paibanxinxi")
public class PaibanxinxiView  extends PaibanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PaibanxinxiView(){
	}
 
 	public PaibanxinxiView(PaibanxinxiEntity paibanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, paibanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
