package com.example.demo01.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author admin
 * @since 2022-03-22
 */
@Data
@ApiModel(value="TbVehicle对象", description="无人车信息表")
@EqualsAndHashCode(callSuper = false)
public class TbVehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 车辆编号
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "车辆编号")
    private Integer id;

    /**
     * 车辆状态
     */
    @ApiModelProperty(value = "车辆状态")
    private String status;

    /**
     * 车辆位置
     */
    @ApiModelProperty(value = "车辆位置")
    private String station;

    /**
     * 无人车1号仓位状态
     */
    @ApiModelProperty(value = "无人车1号仓位状态")
    private String storestatus1;

    /**
     * 无人车2号仓位状态
     */
    @ApiModelProperty(value = "无人车2号仓位状态")
    private String storestatus2;

    /**
     * 无人车3号仓位状态
     */
    @ApiModelProperty(value = "无人车3号仓位状态")
    private String storestatus3;

    /**
     * 无人车4号仓位状态
     */
    @ApiModelProperty(value = "无人车4号仓位状态")
    private String storestatus4;
}