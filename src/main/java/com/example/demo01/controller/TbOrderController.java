package com.example.demo01.controller;


import com.example.demo01.entity.TbOrder;
import com.example.demo01.service.TbOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2022-03-22
 */
@RestController
@RequestMapping("//tbOrder")
public class TbOrderController {

    @Autowired
    private TbOrderService tbOrderService;

    @GetMapping("/list")
    public List<TbOrder> list(){
        return this.tbOrderService.list();
    }

}

