package com.dao;

import com.entity.DiscussyiyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyiyuanxinxiVO;
import com.entity.view.DiscussyiyuanxinxiView;


/**
 * 医院信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-08 16:41:20
 */
public interface DiscussyiyuanxinxiDao extends BaseMapper<DiscussyiyuanxinxiEntity> {
	
	List<DiscussyiyuanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyiyuanxinxiEntity> wrapper);
	
	DiscussyiyuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussyiyuanxinxiEntity> wrapper);
	
	List<DiscussyiyuanxinxiView> selectListView(@Param("ew") Wrapper<DiscussyiyuanxinxiEntity> wrapper);

	List<DiscussyiyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyiyuanxinxiEntity> wrapper);
	
	DiscussyiyuanxinxiView selectView(@Param("ew") Wrapper<DiscussyiyuanxinxiEntity> wrapper);
	
}
