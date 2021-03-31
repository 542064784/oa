package com.damon.oa.controller;

import com.damon.oa.model.Adjustsalary;
import com.damon.oa.service.AdjustsalaryService;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 
 *
 * @author Damon Chen
 * @email 542064784@qq.com
 * @date 2021-03-31 11:37:01
 */
@RestController
@RequestMapping("oa/adjustsalary")
public class AdjustsalaryController {
    @Autowired
    private AdjustsalaryService adjustsalaryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = adjustsalaryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		Adjustsalary adjustsalary = adjustsalaryService.getById(id);

        return R.ok().put("adjustsalary", adjustsalary);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody Adjustsalary adjustsalary){
		adjustsalaryService.save(adjustsalary);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody Adjustsalary adjustsalary){
		adjustsalaryService.updateById(adjustsalary);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		adjustsalaryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
