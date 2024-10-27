package com.dao;

import com.entity.YihuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YihuxinxiVO;
import com.entity.view.YihuxinxiView;


/**
 * 医护信息
 * 
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
public interface YihuxinxiDao extends BaseMapper<YihuxinxiEntity> {
	
	List<YihuxinxiVO> selectListVO(@Param("ew") Wrapper<YihuxinxiEntity> wrapper);
	
	YihuxinxiVO selectVO(@Param("ew") Wrapper<YihuxinxiEntity> wrapper);
	
	List<YihuxinxiView> selectListView(@Param("ew") Wrapper<YihuxinxiEntity> wrapper);

	List<YihuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YihuxinxiEntity> wrapper);
	
	YihuxinxiView selectView(@Param("ew") Wrapper<YihuxinxiEntity> wrapper);
	
}
