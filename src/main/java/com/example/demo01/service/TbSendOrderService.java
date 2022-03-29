package com.example.demo01.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo01.entity.TbSendOrder;

public interface TbSendOrderService extends IService<TbSendOrder> {

        int update(TbSendOrder tbSendOrder);
}
