package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YihuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YihuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YihuleixingView;


/**
 * 医护类型
 *
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
public interface YihuleixingService extends IService<YihuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YihuleixingVO> selectListVO(Wrapper<YihuleixingEntity> wrapper);
   	
   	YihuleixingVO selectVO(@Param("ew") Wrapper<YihuleixingEntity> wrapper);
   	
   	List<YihuleixingView> selectListView(Wrapper<YihuleixingEntity> wrapper);
   	
   	YihuleixingView selectView(@Param("ew") Wrapper<YihuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YihuleixingEntity> wrapper);
   	
}

