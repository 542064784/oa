package com.damon.oa.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.damon.oa.model.Msgcontent;
import com.damon.oa.service.MsgcontentService;
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
@RequestMapping("oa/msgcontent")
public class MsgcontentController {
    @Autowired
    private MsgcontentService msgcontentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = msgcontentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		Msgcontent msgcontent = msgcontentService.getById(id);

        return R.ok().put("msgcontent", msgcontent);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody Msgcontent msgcontent){
		msgcontentService.save(msgcontent);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody Msgcontent msgcontent){
		msgcontentService.updateById(msgcontent);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		msgcontentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
