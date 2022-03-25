package com.example.demo01.controller;


import com.example.demo01.entity.TbOrder;
import com.example.demo01.service.TbOrderService;
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
@RequestMapping("/tbOrder")
public class TbOrderController {

    @Autowired
    private TbOrderService tbOrderService;

    @GetMapping("/list")
    public List<TbOrder> list(){
        return this.tbOrderService.list();
    }

    @PutMapping("/update")
    public boolean update(@RequestBody TbOrder tbOrder){
        return this.tbOrderService.updateById(tbOrder);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return this.tbOrderService.removeById(id);
    }

    @GetMapping("/find/{id}")
    public TbOrder find(@PathVariable("id") Integer id){
        return this.tbOrderService.getById(id);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody TbOrder tbOrder){
        return this.tbOrderService.save(tbOrder);
    }
}

