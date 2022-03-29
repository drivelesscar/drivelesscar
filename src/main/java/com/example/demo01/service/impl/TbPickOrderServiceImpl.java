package com.example.demo01.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo01.entity.TbPickOrder;
import com.example.demo01.mapper.TbPickOrderMapper;
import com.example.demo01.service.TbPickOrderService;
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
public class TbPickOrderServiceImpl extends ServiceImpl<TbPickOrderMapper, TbPickOrder> implements TbPickOrderService {

    @Override
    public int update(TbPickOrder tbPickOrder) {
        return 0;
    }
}
