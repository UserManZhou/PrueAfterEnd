package com.gec.prue.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gec.prue.entity.Novel;
import com.gec.prue.mapper.NovelMapper;
import com.gec.prue.util.NovelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class NovelController {

    @Autowired(required = true)
    private NovelMapper novelMapper;


    @GetMapping("findNovelLove")
    @ResponseBody
    public List<Novel> findNovel(){
        return NovelUtil.getNovelList(1,novelMapper);
    }

    @GetMapping("findNovelOriental")
    @ResponseBody
    public List<Novel> findNovelOriental(){
        return NovelUtil.getNovelList(2,novelMapper);
    }

    @GetMapping("findNovelReincarnation")
    @ResponseBody
    public List<Novel> findNovelReincarnation(){
        return NovelUtil.getNovelList(3, novelMapper);
    }

    @GetMapping("findNovelAncient")
    @ResponseBody
    public List<Novel> findNovelAncient(){
        return NovelUtil.getNovelList(4, novelMapper);
    }

    @GetMapping("findNovelMagicSchool")
    @ResponseBody
    public List<Novel> findNovelMagicSchool(){
        return NovelUtil.getNovelList(5, novelMapper);
    }
}
