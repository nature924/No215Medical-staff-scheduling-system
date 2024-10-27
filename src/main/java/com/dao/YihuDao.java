package com.dao;

import com.entity.YihuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YihuVO;
import com.entity.view.YihuView;


/**
 * 医护
 * 
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
public interface YihuDao extends BaseMapper<YihuEntity> {
	
	List<YihuVO> selectListVO(@Param("ew") Wrapper<YihuEntity> wrapper);
	
	YihuVO selectVO(@Param("ew") Wrapper<YihuEntity> wrapper);
	
	List<YihuView> selectListView(@Param("ew") Wrapper<YihuEntity> wrapper);

	List<YihuView> selectListView(Pagination page,@Param("ew") Wrapper<YihuEntity> wrapper);
	
	YihuView selectView(@Param("ew") Wrapper<YihuEntity> wrapper);
	
}
