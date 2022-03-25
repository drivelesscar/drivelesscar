package com.example.demo01.controller;

import com.example.demo01.entity.TbVehicle;
import com.example.demo01.service.TbVehicleService;
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
@RequestMapping("/tbVehicle")
public class TbVehicleController {

    @Autowired
    private TbVehicleService tbVehicleService;

    @GetMapping("/list")
    public List<TbVehicle> list(){
        return this.tbVehicleService.list();
    }

    @PutMapping("/update")
    public boolean update(@RequestBody TbVehicle tbVehicle){
        return this.tbVehicleService.updateById(tbVehicle);
    }

    @DeleteMapping("/delete/{account}")
    public boolean delete(@PathVariable("account") String account){
        return this.tbVehicleService.removeById(account);
    }

    @GetMapping("/find/{id}")
    public TbVehicle find(@PathVariable("id") String id){
        return this.tbVehicleService.getById(id);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody TbVehicle tbVehicle){
        return this.tbVehicleService.save(tbVehicle);
    }
}
