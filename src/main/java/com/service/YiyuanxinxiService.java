package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiyuanxinxiView;


/**
 * 医院信息
 *
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
public interface YiyuanxinxiService extends IService<YiyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiyuanxinxiVO> selectListVO(Wrapper<YiyuanxinxiEntity> wrapper);
   	
   	YiyuanxinxiVO selectVO(@Param("ew") Wrapper<YiyuanxinxiEntity> wrapper);
   	
   	List<YiyuanxinxiView> selectListView(Wrapper<YiyuanxinxiEntity> wrapper);
   	
   	YiyuanxinxiView selectView(@Param("ew") Wrapper<YiyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiyuanxinxiEntity> wrapper);
   	
}

