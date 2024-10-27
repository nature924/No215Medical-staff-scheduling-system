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


import com.dao.YihuxinxiDao;
import com.entity.YihuxinxiEntity;
import com.service.YihuxinxiService;
import com.entity.vo.YihuxinxiVO;
import com.entity.view.YihuxinxiView;

@Service("yihuxinxiService")
public class YihuxinxiServiceImpl extends ServiceImpl<YihuxinxiDao, YihuxinxiEntity> implements YihuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YihuxinxiEntity> page = this.selectPage(
                new Query<YihuxinxiEntity>(params).getPage(),
                new EntityWrapper<YihuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YihuxinxiEntity> wrapper) {
		  Page<YihuxinxiView> page =new Query<YihuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YihuxinxiVO> selectListVO(Wrapper<YihuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YihuxinxiVO selectVO(Wrapper<YihuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YihuxinxiView> selectListView(Wrapper<YihuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YihuxinxiView selectView(Wrapper<YihuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
