package com.damon.oa.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.damon.oa.model.Empsalary;
import com.damon.oa.service.EmpsalaryService;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.R;



/**
 * 
 *
 * @author Damon Chen
 * @email 542064784@qq.com
 * @date 2021-03-31 11:37:01
 */
@RestController
@RequestMapping("oa/empsalary")
public class EmpsalaryController {
    @Autowired
    private EmpsalaryService empsalaryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = empsalaryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		Empsalary empsalary = empsalaryService.getById(id);

        return R.ok().put("empsalary", empsalary);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody Empsalary empsalary){
		empsalaryService.save(empsalary);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody Empsalary empsalary){
		empsalaryService.updateById(empsalary);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		empsalaryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
