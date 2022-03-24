package com.example.demo01;

import com.example.demo01.entity.TbOrder;
import com.example.demo01.mapper.TbOrderMapper;
import com.example.demo01.service.TbOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo01ApplicationTests {
    @Autowired
    private TbOrderService tbOrderService;
    @Test
    public void findAll() {
        List<TbOrder> tbOrders=tbOrderService.list();
        System.out.println(tbOrders);
//测试链接
    }

}
