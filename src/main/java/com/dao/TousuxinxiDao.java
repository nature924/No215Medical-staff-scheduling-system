package com.dao;

import com.entity.TousuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TousuxinxiVO;
import com.entity.view.TousuxinxiView;


/**
 * 投诉信息
 * 
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
public interface TousuxinxiDao extends BaseMapper<TousuxinxiEntity> {
	
	List<TousuxinxiVO> selectListVO(@Param("ew") Wrapper<TousuxinxiEntity> wrapper);
	
	TousuxinxiVO selectVO(@Param("ew") Wrapper<TousuxinxiEntity> wrapper);
	
	List<TousuxinxiView> selectListView(@Param("ew") Wrapper<TousuxinxiEntity> wrapper);

	List<TousuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TousuxinxiEntity> wrapper);
	
	TousuxinxiView selectView(@Param("ew") Wrapper<TousuxinxiEntity> wrapper);
	
}
