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


import com.dao.YihuDao;
import com.entity.YihuEntity;
import com.service.YihuService;
import com.entity.vo.YihuVO;
import com.entity.view.YihuView;

@Service("yihuService")
public class YihuServiceImpl extends ServiceImpl<YihuDao, YihuEntity> implements YihuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YihuEntity> page = this.selectPage(
                new Query<YihuEntity>(params).getPage(),
                new EntityWrapper<YihuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YihuEntity> wrapper) {
		  Page<YihuView> page =new Query<YihuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YihuVO> selectListVO(Wrapper<YihuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YihuVO selectVO(Wrapper<YihuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YihuView> selectListView(Wrapper<YihuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YihuView selectView(Wrapper<YihuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
