package com.damon.oa.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damon.oa.util.PageUtils;
import com.damon.oa.util.Query;

import com.damon.oa.mapper.MailSendLogMapper;
import com.damon.oa.model.MailSendLog;
import com.damon.oa.service.MailSendLogService;


@Service("mailSendLogService")
public class MailSendLogServiceImpl extends ServiceImpl<MailSendLogMapper, MailSendLog> implements MailSendLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MailSendLog> page = this.page(
                new Query<MailSendLog>().getPage(params),
                new QueryWrapper<MailSendLog>()
        );

        return new PageUtils(page);
    }

}