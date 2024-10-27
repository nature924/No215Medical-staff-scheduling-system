package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YihuleixingDao;
import com.entity.YihuleixingEntity;
import com.service.YihuleixingService;
import com.entity.vo.YihuleixingVO;
import com.entity.view.YihuleixingView;

@Service("yihuleixingService")
public class YihuleixingServiceImpl extends ServiceImpl<YihuleixingDao, YihuleixingEntity> implements YihuleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YihuleixingEntity> page = this.selectPage(
                new Query<YihuleixingEntity>(params).getPage(),
                new EntityWrapper<YihuleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YihuleixingEntity> wrapper) {
		  Page<YihuleixingView> page =new Query<YihuleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YihuleixingVO> selectListVO(Wrapper<YihuleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YihuleixingVO selectVO(Wrapper<YihuleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YihuleixingView> selectListView(Wrapper<YihuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YihuleixingView selectView(Wrapper<YihuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
