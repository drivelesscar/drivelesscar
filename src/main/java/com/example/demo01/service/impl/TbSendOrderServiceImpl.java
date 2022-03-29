package com.example.demo01.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo01.entity.TbSendOrder;
import com.example.demo01.mapper.TbSendOrderMapper;
import com.example.demo01.service.TbSendOrderService;
import org.springframework.stereotype.Service;

@Service
public class TbSendOrderServiceImpl extends ServiceImpl<TbSendOrderMapper, TbSendOrder> implements TbSendOrderService {

    @Override
    public int update(TbSendOrder tbSendOrder) {
        return 0;
    }
}
