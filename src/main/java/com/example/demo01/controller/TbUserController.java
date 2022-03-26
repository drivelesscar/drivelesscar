package com.example.demo01.controller;

import com.example.demo01.entity.TbUser;
import com.example.demo01.service.TbUserService;
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
@Api(tags = "用户管理")
@RequestMapping("/api/tbUser")
public class TbUserController {

    @Autowired
    private TbUserService tbUserService;

    @ApiOperation("查询全部用户列表")
    @GetMapping("/list")
    public List<TbUser> list(){
        return this.tbUserService.list();
    }

    @ApiOperation("用户信息更新")
    @PutMapping("/update")
    public boolean update(@RequestBody TbUser tbUser){
        return this.tbUserService.updateById(tbUser);
    }

    @ApiOperation("删除用户信息")
    @DeleteMapping("/delete/{account}")
    public boolean delete(@PathVariable("account") String account){
        return this.tbUserService.removeById(account);
    }

    @ApiOperation("查询某个用户的信息")
    @GetMapping("/find/{account}")
    public TbUser find(@PathVariable("account") String account){
        return this.tbUserService.getById(account);
    }

    @ApiOperation("新增用户")
    @PostMapping("/add")
    public boolean add(@RequestBody TbUser tbUser){
        return this.tbUserService.save(tbUser);
    }
}
