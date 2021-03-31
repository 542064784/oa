package com.damon.oa.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.damon.oa.model.Employeetrain;
import com.damon.oa.service.EmployeetrainService;
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
@RequestMapping("oa/employeetrain")
public class EmployeetrainController {
    @Autowired
    private EmployeetrainService employeetrainService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = employeetrainService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		Employeetrain employeetrain = employeetrainService.getById(id);

        return R.ok().put("employeetrain", employeetrain);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody Employeetrain employeetrain){
		employeetrainService.save(employeetrain);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody Employeetrain employeetrain){
		employeetrainService.updateById(employeetrain);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		employeetrainService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
