package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PaibanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PaibanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PaibanxinxiView;


/**
 * 排班信息
 *
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
public interface PaibanxinxiService extends IService<PaibanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PaibanxinxiVO> selectListVO(Wrapper<PaibanxinxiEntity> wrapper);
   	
   	PaibanxinxiVO selectVO(@Param("ew") Wrapper<PaibanxinxiEntity> wrapper);
   	
   	List<PaibanxinxiView> selectListView(Wrapper<PaibanxinxiEntity> wrapper);
   	
   	PaibanxinxiView selectView(@Param("ew") Wrapper<PaibanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PaibanxinxiEntity> wrapper);
   	
}

