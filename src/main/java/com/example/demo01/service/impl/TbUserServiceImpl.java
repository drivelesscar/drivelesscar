package com.example.demo01.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo01.entity.TbUser;
import com.example.demo01.mapper.TbUserMapper;
import com.example.demo01.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2022-03-22
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser loginIn(String account, String password) {
        return TbUserMapper.getInfo(account, password);

    }

    @Override
    public int insert(TbUser user) {
        return insert(user);
    }
}
