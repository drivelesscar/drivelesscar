package com.example.demo01.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author admin
 * @since 2022-03-22
 */
@Data
@ApiModel(value="TbUser对象", description="用户信息表")
@EqualsAndHashCode(callSuper = false)
public class TbUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    @TableId(type = IdType.ASSIGN_UUID)
    @ApiModelProperty(value = "用户名")
    private String account;

    /**
     * 登陆密码
     */
    @ApiModelProperty(value = "登陆密码")
    private String password;

    /**
     * 用户权限
     */
    @ApiModelProperty(value = "用户权限")
    private String type;

    /**
     * 用户联系方式
     */
    @ApiModelProperty(value = "用户联系方式")
    private String tel;
}


