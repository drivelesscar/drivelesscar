package com.example.demo01.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@EqualsAndHashCode(callSuper = false)
public class TbVehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 车辆编号
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 车辆状态
     */
    private String status;

    /**
     * 车辆位置
     */
    private String station;

    /**
     * 无人车各仓位状态
     */
    private String store_status;
}