package com.dao;

import com.entity.PaibanleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PaibanleixingVO;
import com.entity.view.PaibanleixingView;


/**
 * 排班类型
 * 
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
public interface PaibanleixingDao extends BaseMapper<PaibanleixingEntity> {
	
	List<PaibanleixingVO> selectListVO(@Param("ew") Wrapper<PaibanleixingEntity> wrapper);
	
	PaibanleixingVO selectVO(@Param("ew") Wrapper<PaibanleixingEntity> wrapper);
	
	List<PaibanleixingView> selectListView(@Param("ew") Wrapper<PaibanleixingEntity> wrapper);

	List<PaibanleixingView> selectListView(Pagination page,@Param("ew") Wrapper<PaibanleixingEntity> wrapper);
	
	PaibanleixingView selectView(@Param("ew") Wrapper<PaibanleixingEntity> wrapper);
	
}
