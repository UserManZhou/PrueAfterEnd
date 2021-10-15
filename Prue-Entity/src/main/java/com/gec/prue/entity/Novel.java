package com.gec.prue.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Novel {

/*    @TableId
    private int id;*/

    @TableField("id")
    private int id;

    @TableField("title")
    private String title;

    @TableId("type")
    private String type;

    @TableField("state")
    private String state;

    @TableField("content")
    private String content;

    @TableField("img")
    private String img;

    @TableField("novelId")
    private int novelId;
}
