package com.example.demo01.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo01.entity.TbUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2022-03-22
 */
public interface TbUserService extends IService<TbUser> {
    TbUser loginIn(String account, String password);
}
