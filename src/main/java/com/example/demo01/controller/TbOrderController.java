package com.example.demo01.controller;


import com.example.demo01.entity.TbOrder;
import com.example.demo01.service.TbOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 *
 */
@RestController
@Api(tags = "配送订单管理")
@RequestMapping("/api/tbOrder")
public class TbOrderController {

    @Autowired
    private TbOrderService tbOrderService;

    @ApiOperation("查询全部配送订单列表")
    @GetMapping("/list")
    public List<TbOrder> list(){
        return this.tbOrderService.list();
    }

    @ApiOperation("更新配送订单")
    @PutMapping("/update")
    public boolean update(@RequestBody TbOrder tbOrder){
        return this.tbOrderService.updateById(tbOrder);
    }

    @ApiOperation("删除配送订单")
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return this.tbOrderService.removeById(id);
    }

    @ApiOperation("查询某个配送订单")
    @GetMapping("/find/{id}")
    public TbOrder find(@PathVariable("id") Integer id){
        return this.tbOrderService.getById(id);
    }

    @ApiOperation("新增配送订单")
    @PostMapping("/add")
    public boolean add(@RequestBody TbOrder tbOrder){
        return this.tbOrderService.save(tbOrder);
    }
}

