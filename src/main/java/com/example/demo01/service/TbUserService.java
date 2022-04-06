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
//    String login(String account, String password);
//    TbUser loginIn(String account, String password);

    int insert(TbUser user);

    //int updateMonitorPointByAccount(TbUser tbUser);
}
