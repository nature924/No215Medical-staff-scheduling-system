package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PaibanleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PaibanleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PaibanleixingView;


/**
 * 排班类型
 *
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
public interface PaibanleixingService extends IService<PaibanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PaibanleixingVO> selectListVO(Wrapper<PaibanleixingEntity> wrapper);
   	
   	PaibanleixingVO selectVO(@Param("ew") Wrapper<PaibanleixingEntity> wrapper);
   	
   	List<PaibanleixingView> selectListView(Wrapper<PaibanleixingEntity> wrapper);
   	
   	PaibanleixingView selectView(@Param("ew") Wrapper<PaibanleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PaibanleixingEntity> wrapper);
   	
}

