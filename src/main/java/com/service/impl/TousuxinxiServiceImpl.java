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


import com.dao.TousuxinxiDao;
import com.entity.TousuxinxiEntity;
import com.service.TousuxinxiService;
import com.entity.vo.TousuxinxiVO;
import com.entity.view.TousuxinxiView;

@Service("tousuxinxiService")
public class TousuxinxiServiceImpl extends ServiceImpl<TousuxinxiDao, TousuxinxiEntity> implements TousuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TousuxinxiEntity> page = this.selectPage(
                new Query<TousuxinxiEntity>(params).getPage(),
                new EntityWrapper<TousuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TousuxinxiEntity> wrapper) {
		  Page<TousuxinxiView> page =new Query<TousuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TousuxinxiVO> selectListVO(Wrapper<TousuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TousuxinxiVO selectVO(Wrapper<TousuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TousuxinxiView> selectListView(Wrapper<TousuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TousuxinxiView selectView(Wrapper<TousuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
