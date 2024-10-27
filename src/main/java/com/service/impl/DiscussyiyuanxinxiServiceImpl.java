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


import com.dao.DiscussyiyuanxinxiDao;
import com.entity.DiscussyiyuanxinxiEntity;
import com.service.DiscussyiyuanxinxiService;
import com.entity.vo.DiscussyiyuanxinxiVO;
import com.entity.view.DiscussyiyuanxinxiView;

@Service("discussyiyuanxinxiService")
public class DiscussyiyuanxinxiServiceImpl extends ServiceImpl<DiscussyiyuanxinxiDao, DiscussyiyuanxinxiEntity> implements DiscussyiyuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyiyuanxinxiEntity> page = this.selectPage(
                new Query<DiscussyiyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyiyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyiyuanxinxiEntity> wrapper) {
		  Page<DiscussyiyuanxinxiView> page =new Query<DiscussyiyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyiyuanxinxiVO> selectListVO(Wrapper<DiscussyiyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyiyuanxinxiVO selectVO(Wrapper<DiscussyiyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyiyuanxinxiView> selectListView(Wrapper<DiscussyiyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyiyuanxinxiView selectView(Wrapper<DiscussyiyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
