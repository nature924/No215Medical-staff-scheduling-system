package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YihuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YihuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YihuView;


/**
 * 医护
 *
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
public interface YihuService extends IService<YihuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YihuVO> selectListVO(Wrapper<YihuEntity> wrapper);
   	
   	YihuVO selectVO(@Param("ew") Wrapper<YihuEntity> wrapper);
   	
   	List<YihuView> selectListView(Wrapper<YihuEntity> wrapper);
   	
   	YihuView selectView(@Param("ew") Wrapper<YihuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YihuEntity> wrapper);
   	
}

