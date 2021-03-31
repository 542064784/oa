package com.damon.oa.mapper;

import com.damon.oa.model.MailSendLog;
import java.util.List;

public interface MailSendLogMapper {
    int insert(MailSendLog record);

    List<MailSendLog> selectAll();
}