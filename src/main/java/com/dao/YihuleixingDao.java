package com.dao;

import com.entity.YihuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YihuleixingVO;
import com.entity.view.YihuleixingView;


/**
 * 医护类型
 * 
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
public interface YihuleixingDao extends BaseMapper<YihuleixingEntity> {
	
	List<YihuleixingVO> selectListVO(@Param("ew") Wrapper<YihuleixingEntity> wrapper);
	
	YihuleixingVO selectVO(@Param("ew") Wrapper<YihuleixingEntity> wrapper);
	
	List<YihuleixingView> selectListView(@Param("ew") Wrapper<YihuleixingEntity> wrapper);

	List<YihuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<YihuleixingEntity> wrapper);
	
	YihuleixingView selectView(@Param("ew") Wrapper<YihuleixingEntity> wrapper);
	
}
