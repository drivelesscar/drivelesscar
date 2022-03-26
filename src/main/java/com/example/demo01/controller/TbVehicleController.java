package com.example.demo01.controller;

import com.example.demo01.entity.TbVehicle;
import com.example.demo01.service.TbVehicleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *     前端控制器
 * </p>
 *
 * @author admin
 *
 */

@RestController
@Api(tags="无人车管理")
@RequestMapping("/api/tbVehicle")
public class TbVehicleController {

    @Autowired
    private TbVehicleService tbVehicleService;

    @ApiOperation("查询所有无人车信息列表")
    @GetMapping("/list")
    public List<TbVehicle> list(){
        return this.tbVehicleService.list();
    }

    @ApiOperation("更新无人车信息")
    @PutMapping("/update")
    public boolean update(@RequestBody TbVehicle tbVehicle){
        return this.tbVehicleService.updateById(tbVehicle);
    }

    @ApiOperation("删除无人车信息")
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return this.tbVehicleService.removeById(id);
    }

    @ApiOperation("查询某辆无人车的信息")
    @GetMapping("/find/{id}")
    public TbVehicle find(@PathVariable("id") Integer id){
        return this.tbVehicleService.getById(id);
    }

    @ApiOperation("新增无人车")
    @PostMapping("/add")
    public boolean add(@RequestBody TbVehicle tbVehicle){
        return this.tbVehicleService.save(tbVehicle);
    }
}
