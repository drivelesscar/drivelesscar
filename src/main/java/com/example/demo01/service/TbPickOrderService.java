package com.example.demo01.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo01.entity.TbPickOrder;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2022-03-22
 */
public interface TbPickOrderService extends IService<TbPickOrder> {

    int update(TbPickOrder tbPickOrder);

}
