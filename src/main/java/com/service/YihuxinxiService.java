package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YihuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YihuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YihuxinxiView;


/**
 * 医护信息
 *
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
public interface YihuxinxiService extends IService<YihuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YihuxinxiVO> selectListVO(Wrapper<YihuxinxiEntity> wrapper);
   	
   	YihuxinxiVO selectVO(@Param("ew") Wrapper<YihuxinxiEntity> wrapper);
   	
   	List<YihuxinxiView> selectListView(Wrapper<YihuxinxiEntity> wrapper);
   	
   	YihuxinxiView selectView(@Param("ew") Wrapper<YihuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YihuxinxiEntity> wrapper);
   	
}

