package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YihuxinxiEntity;
import com.entity.view.YihuxinxiView;

import com.service.YihuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 医护信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
@RestController
@RequestMapping("/yihuxinxi")
public class YihuxinxiController {
    @Autowired
    private YihuxinxiService yihuxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YihuxinxiEntity yihuxinxi,
		HttpServletRequest request){
        EntityWrapper<YihuxinxiEntity> ew = new EntityWrapper<YihuxinxiEntity>();
		PageUtils page = yihuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yihuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YihuxinxiEntity yihuxinxi, 
		HttpServletRequest request){
        EntityWrapper<YihuxinxiEntity> ew = new EntityWrapper<YihuxinxiEntity>();
		PageUtils page = yihuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yihuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YihuxinxiEntity yihuxinxi){
       	EntityWrapper<YihuxinxiEntity> ew = new EntityWrapper<YihuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yihuxinxi, "yihuxinxi")); 
        return R.ok().put("data", yihuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YihuxinxiEntity yihuxinxi){
        EntityWrapper< YihuxinxiEntity> ew = new EntityWrapper< YihuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yihuxinxi, "yihuxinxi")); 
		YihuxinxiView yihuxinxiView =  yihuxinxiService.selectView(ew);
		return R.ok("查询医护信息成功").put("data", yihuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YihuxinxiEntity yihuxinxi = yihuxinxiService.selectById(id);
        return R.ok().put("data", yihuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YihuxinxiEntity yihuxinxi = yihuxinxiService.selectById(id);
        return R.ok().put("data", yihuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YihuxinxiEntity yihuxinxi, HttpServletRequest request){
    	yihuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yihuxinxi);
        yihuxinxiService.insert(yihuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YihuxinxiEntity yihuxinxi, HttpServletRequest request){
    	yihuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yihuxinxi);
        yihuxinxiService.insert(yihuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YihuxinxiEntity yihuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yihuxinxi);
        yihuxinxiService.updateById(yihuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yihuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YihuxinxiEntity> wrapper = new EntityWrapper<YihuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yihuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
