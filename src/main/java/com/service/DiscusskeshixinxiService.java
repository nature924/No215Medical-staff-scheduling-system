package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskeshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskeshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskeshixinxiView;


/**
 * 科室信息评论表
 *
 * @author 
 * @email 
 * @date 2021-05-08 16:41:20
 */
public interface DiscusskeshixinxiService extends IService<DiscusskeshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskeshixinxiVO> selectListVO(Wrapper<DiscusskeshixinxiEntity> wrapper);
   	
   	DiscusskeshixinxiVO selectVO(@Param("ew") Wrapper<DiscusskeshixinxiEntity> wrapper);
   	
   	List<DiscusskeshixinxiView> selectListView(Wrapper<DiscusskeshixinxiEntity> wrapper);
   	
   	DiscusskeshixinxiView selectView(@Param("ew") Wrapper<DiscusskeshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskeshixinxiEntity> wrapper);
   	
}

