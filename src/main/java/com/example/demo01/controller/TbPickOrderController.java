package com.example.demo01.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo01.entity.TbPickOrder;
import com.example.demo01.entity.TbUser;
import com.example.demo01.service.TbPickOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
//
@RestController
@Api(tags = "取件配送订单管理")
@RequestMapping("/api/tbPickOrder")
public class TbPickOrderController {

    @Autowired
    private TbPickOrderService tbPickOrderService;

    @ApiOperation("查询全部配送订单列表")
    @GetMapping("/list")
    public List<TbPickOrder> list(){
        return this.tbPickOrderService.list();
    }

    @ApiOperation("更新配送订单")
    @PutMapping("/update")
    public boolean update(@RequestBody TbPickOrder tbOrder){
        return this.tbPickOrderService.updateById(tbOrder);
    }

    @ApiOperation("删除配送订单")
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return this.tbPickOrderService.removeById(id);
    }

    @ApiOperation("查询某个配送订单")
    @GetMapping("/find/{id}")
    public TbPickOrder find(@PathVariable("id") Integer id){
        return this.tbPickOrderService.getById(id);
    }


    @ApiOperation("查询某个用户的全部订单")
    @GetMapping("/search")
    public TbPickOrder searchByAccount(@RequestParam @ApiParam(value = "用户名", required = true) String userAccount) {
        TbPickOrder tbPickOrder = tbPickOrderService.getOne(new QueryWrapper<TbPickOrder>()
                .eq("user_account", userAccount));
        return tbPickOrder;
    }

    @ApiOperation("新增配送订单")
    @PostMapping("/add")
    public boolean add(@RequestBody TbPickOrder tbOrder){
        return this.tbPickOrderService.save(tbOrder);
    }
}

