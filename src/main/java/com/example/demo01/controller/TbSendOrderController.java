package com.example.demo01.controller;

import com.example.demo01.entity.TbSendOrder;
import com.example.demo01.service.TbSendOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "寄件订单管理")
@RequestMapping("/api/tbSendOrder")
public class TbSendOrderController {
    @Autowired
    private TbSendOrderService tbSendOrderService;

    @ApiOperation("查询全部寄件订单列表")
    @GetMapping("/list")
    public List<TbSendOrder> list(){
        return this.tbSendOrderService.list();
    }

    @ApiOperation("更新寄件订单")
    @PutMapping("/update")
    public boolean update(@RequestBody TbSendOrder tbSendOrder){
        return this.tbSendOrderService.updateById(tbSendOrder);
    }

    @ApiOperation("删除寄件订单")
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return this.tbSendOrderService.removeById(id);
    }

    @ApiOperation("查询某个寄件订单")
    @GetMapping("/find/{id}")
    public TbSendOrder find(@PathVariable("id") Integer id){
        return this.tbSendOrderService.getById(id);
    }

    @ApiOperation("新增寄件订单")
    @PostMapping("/add")
    public boolean add(@RequestBody TbSendOrder tbSendOrder){
        return this.tbSendOrderService.save(tbSendOrder);
    }
}
