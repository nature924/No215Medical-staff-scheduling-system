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


import com.dao.PaibanleixingDao;
import com.entity.PaibanleixingEntity;
import com.service.PaibanleixingService;
import com.entity.vo.PaibanleixingVO;
import com.entity.view.PaibanleixingView;

@Service("paibanleixingService")
public class PaibanleixingServiceImpl extends ServiceImpl<PaibanleixingDao, PaibanleixingEntity> implements PaibanleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PaibanleixingEntity> page = this.selectPage(
                new Query<PaibanleixingEntity>(params).getPage(),
                new EntityWrapper<PaibanleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PaibanleixingEntity> wrapper) {
		  Page<PaibanleixingView> page =new Query<PaibanleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PaibanleixingVO> selectListVO(Wrapper<PaibanleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PaibanleixingVO selectVO(Wrapper<PaibanleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PaibanleixingView> selectListView(Wrapper<PaibanleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PaibanleixingView selectView(Wrapper<PaibanleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
