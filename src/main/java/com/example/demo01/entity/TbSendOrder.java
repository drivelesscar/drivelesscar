package com.example.demo01.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;
@Data
@ApiModel(value="TbSendOrder对象", description="寄件订单表")
@EqualsAndHashCode(callSuper = false)
public class TbSendOrder {

        private static final long serialVersionUID=1L;

        /**
         * 订单记录编号
         */
        @TableId(value = "id", type = IdType.AUTO)
        private Integer id;

        /**
         * 用户名
         */
        @ApiModelProperty(value = "用户名")
        private String userAccount;

        /**
         * 用户联系方式
         */
        @ApiModelProperty(value = "用户联系方式")
        private String userTel;

        /**
         * 快递取件码
         */
        @ApiModelProperty(value = "快递寄件码")
        private String cargoId;

        /**
         * 配送目的地
         */
        @ApiModelProperty(value = "取件地址")
        private String destination;

        /**
         * 预计配送时间
         */
        @ApiModelProperty(value = "预计到达时间")
        private LocalDateTime eta;

        /**
         * 订单提交时间
         */
        @ApiModelProperty(value = "订单提交时间")
        private LocalDateTime orderTime;

        /**
         * 订单编号
         */
        @ApiModelProperty(value = "订单编号")
        private String orderId;

        /**
         * 订单状态(N未完成，Y已完成）
         */
        @ApiModelProperty(value = "订单状态")
        private String orderStatus;

        /**
         * 无人车编号
         */
        @ApiModelProperty(value = "无人车编号")
        private Integer vehicleId;

        /**
         * 快递在车上地仓位号
         */
        @ApiModelProperty(value = "快递在车上仓位号")
        private Integer storeId;

    }
