package com.example.demo01.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo01.entity.TbUser;
import com.example.demo01.mapper.TbUserMapper;
import com.example.demo01.service.TbUserService;
import org.springframework.beans.BeanUtils;
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
//    @Override
//    public String login(String username, String password) {
//        TbUser user = baseMapper.selectOne(new LambdaQueryWrapper<TbUser>()
//                .eq(TbUser::getAccount, username));
//        if (user.getPassword().equals(password)) {
//           TbUser tbUser = new TbUser();
//           tbUser.setAccount(username);
//           tbUser.setPassword(password);
//            return username+"登陆成功";
//        }
//        else {
//            return "密码错误";
//        }
//    }

    @Override
    public int insert(TbUser user) {
        return insert(user);
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
//    @Resource
//    private TbUserMapper tbUserMapper;
//
//    @Override
//    public TbUser loginIn(String account, String password) {
//        return TbUserMapper.getInfo(account, password);
//
//    }
}
