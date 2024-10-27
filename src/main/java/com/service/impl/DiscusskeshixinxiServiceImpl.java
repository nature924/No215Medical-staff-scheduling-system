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


import com.dao.DiscusskeshixinxiDao;
import com.entity.DiscusskeshixinxiEntity;
import com.service.DiscusskeshixinxiService;
import com.entity.vo.DiscusskeshixinxiVO;
import com.entity.view.DiscusskeshixinxiView;

@Service("discusskeshixinxiService")
public class DiscusskeshixinxiServiceImpl extends ServiceImpl<DiscusskeshixinxiDao, DiscusskeshixinxiEntity> implements DiscusskeshixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskeshixinxiEntity> page = this.selectPage(
                new Query<DiscusskeshixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusskeshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskeshixinxiEntity> wrapper) {
		  Page<DiscusskeshixinxiView> page =new Query<DiscusskeshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskeshixinxiVO> selectListVO(Wrapper<DiscusskeshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskeshixinxiVO selectVO(Wrapper<DiscusskeshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskeshixinxiView> selectListView(Wrapper<DiscusskeshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskeshixinxiView selectView(Wrapper<DiscusskeshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
