package com.example.demo01.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo01.entity.TbUser;
import com.example.demo01.mapper.TbUserMapper;
import com.example.demo01.service.TbUserService;
import org.springframework.stereotype.Service;

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

    @Override
    public int insert(TbUser user) {
        return baseMapper.insert(user);
    }

    @Override
    public int updateMonitorPointByAccount(TbUser tbUser) {
        TbUser tbUser1 = baseMapper.selectOne(new LambdaQueryWrapper<TbUser>()
                .eq(TbUser::getAccount, tbUser.getAccount()));
        if (tbUser1.getPassword().equals(tbUser.getPassword())) {
           return 1;
        }
        return 0;
    }
}
