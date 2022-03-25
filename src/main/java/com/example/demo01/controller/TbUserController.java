package com.example.demo01.controller;

import com.example.demo01.entity.TbUser;
import com.example.demo01.service.TbUserService;
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
@RequestMapping("/tbUser")
public class TbUserController {

    @Autowired
    private TbUserService tbUserService;

    @GetMapping("/list")
    public List<TbUser> list(){
        return this.tbUserService.list();
    }

    @PutMapping("/update")
    public boolean update(@RequestBody TbUser tbUser){
        return this.tbUserService.updateById(tbUser);
    }

    @DeleteMapping("/delete/{account}")
    public boolean delete(@PathVariable("account") String account){
        return this.tbUserService.removeById(account);
    }

    @GetMapping("/find/{account}")
    public TbUser find(@PathVariable("account") String account){
        return this.tbUserService.getById(account);
    }

    @PostMapping("/add")
    public boolean add(@RequestBody TbUser tbUser){
        return this.tbUserService.save(tbUser);
    }
}
