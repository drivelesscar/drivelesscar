package com.example.demo01.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo01.entity.TbOrder;
import com.example.demo01.mapper.TbOrderMapper;
import com.example.demo01.service.TbOrderService;
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
public class TbOrderServiceImpl extends ServiceImpl<TbOrderMapper, TbOrder> implements TbOrderService {

    @Override
    public int update(TbOrder tbOrder) {
        return 0;
    }
}
