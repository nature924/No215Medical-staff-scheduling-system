package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyiyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyiyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyiyuanxinxiView;


/**
 * 医院信息评论表
 *
 * @author 
 * @email 
 * @date 2021-05-08 16:41:20
 */
public interface DiscussyiyuanxinxiService extends IService<DiscussyiyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyiyuanxinxiVO> selectListVO(Wrapper<DiscussyiyuanxinxiEntity> wrapper);
   	
   	DiscussyiyuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussyiyuanxinxiEntity> wrapper);
   	
   	List<DiscussyiyuanxinxiView> selectListView(Wrapper<DiscussyiyuanxinxiEntity> wrapper);
   	
   	DiscussyiyuanxinxiView selectView(@Param("ew") Wrapper<DiscussyiyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyiyuanxinxiEntity> wrapper);
   	
}

