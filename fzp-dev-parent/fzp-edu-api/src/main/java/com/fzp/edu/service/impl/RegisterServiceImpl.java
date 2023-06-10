package com.fzp.edu.service.impl;

import com.fzp.edu.entity.MayiktEduUser;
import com.fzp.edu.service.RegisterService;
import org.springframework.stereotype.Service;

@Service //业务逻辑层
public class RegisterServiceImpl implements RegisterService {
    @Override
    public boolean register(MayiktEduUser mayiktEduUser) {
        /**
         * 1.根据手机号码查询在DB 是否存在
         */
        return false;
    }
}
