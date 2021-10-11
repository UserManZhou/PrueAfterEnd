package com.gec.prue.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2021-10-03
 */
@Data
public class Note implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;

    @TableField("Summary")
    private String summary;

    @TableField("context")
    private String context;

    @TableField("createtime")
    private Date createtime;
}
