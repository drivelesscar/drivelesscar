package com.example.demo01;

//import com.example.demo01.entity.TbOrder;
//import com.example.demo01.service.TbOrderService;
import com.example.demo01.entity.TbPickOrder;
import com.example.demo01.entity.TbSendOrder;
import com.example.demo01.service.TbPickOrderService;
import com.example.demo01.service.TbSendOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo01ApplicationTests {

    @Autowired
    private TbPickOrderService tbPickOrderService;


    //查询所有数据
//    @Test
//    public void findAll() {
//        List<TbPickOrder> tbPickOrders=tbPickOrderService.list();
//        System.out.println(tbPickOrders);
//    }

    @Autowired
    private TbSendOrderService tbSendOrderService;

    //查询所有数据
    @Test
    public void findAll() {
        List<TbSendOrder> tbSendOrders=tbSendOrderService.list();
        System.out.println(tbSendOrders);
    }
//
//    //删除第二条数据
//    @Test
//    public void testLogicDelete(){
//        boolean result = tbOrderService.removeById(1l);
//        System.out.println(result);
//    }
//
//    //测试逻辑删除后的查询
//    @Test
//    public void testLogicDeleteSelect(){
//        List<TbOrder> tbOrders = tbOrderService.list();
//        tbOrders.forEach(System.out::println);
//    }
//
//    //修改
//    @Test
//    public void testUpdate(){
//        TbOrder tbOrder = new TbOrder();
//        tbOrder.setId(1);
//        tbOrder.setOrderId("02");
//        int count = tbOrderService.count();
//        System.out.println(count);
//    }
//
//    //添加
//    @Test
//    public void testAdd(){
//        TbOrder tbOrder = new TbOrder();
//        tbOrder.setOrderId("03");
//        tbOrder.setId(3);
//        tbOrder.setDestination("bb");
//        int insert = tbOrderService.update(tbOrder);
//        System.out.println(insert);
//    }



}
