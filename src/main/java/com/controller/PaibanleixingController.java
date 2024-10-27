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

import com.entity.PaibanleixingEntity;
import com.entity.view.PaibanleixingView;

import com.service.PaibanleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 排班类型
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-08 16:41:19
 */
@RestController
@RequestMapping("/paibanleixing")
public class PaibanleixingController {
    @Autowired
    private PaibanleixingService paibanleixingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PaibanleixingEntity paibanleixing,
		HttpServletRequest request){
        EntityWrapper<PaibanleixingEntity> ew = new EntityWrapper<PaibanleixingEntity>();
		PageUtils page = paibanleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, paibanleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PaibanleixingEntity paibanleixing, 
		HttpServletRequest request){
        EntityWrapper<PaibanleixingEntity> ew = new EntityWrapper<PaibanleixingEntity>();
		PageUtils page = paibanleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, paibanleixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PaibanleixingEntity paibanleixing){
       	EntityWrapper<PaibanleixingEntity> ew = new EntityWrapper<PaibanleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( paibanleixing, "paibanleixing")); 
        return R.ok().put("data", paibanleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PaibanleixingEntity paibanleixing){
        EntityWrapper< PaibanleixingEntity> ew = new EntityWrapper< PaibanleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( paibanleixing, "paibanleixing")); 
		PaibanleixingView paibanleixingView =  paibanleixingService.selectView(ew);
		return R.ok("查询排班类型成功").put("data", paibanleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PaibanleixingEntity paibanleixing = paibanleixingService.selectById(id);
        return R.ok().put("data", paibanleixing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PaibanleixingEntity paibanleixing = paibanleixingService.selectById(id);
        return R.ok().put("data", paibanleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PaibanleixingEntity paibanleixing, HttpServletRequest request){
    	paibanleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(paibanleixing);
        paibanleixingService.insert(paibanleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PaibanleixingEntity paibanleixing, HttpServletRequest request){
    	paibanleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(paibanleixing);
        paibanleixingService.insert(paibanleixing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PaibanleixingEntity paibanleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(paibanleixing);
        paibanleixingService.updateById(paibanleixing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        paibanleixingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<PaibanleixingEntity> wrapper = new EntityWrapper<PaibanleixingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = paibanleixingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
