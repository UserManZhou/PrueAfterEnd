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
@RequestMapping("findNovel")
public class NovelController {

    @Autowired(required = true)
    private NovelMapper novelMapper;


    @GetMapping("Love")
    @ResponseBody
    public List<Novel> findNovel(){
        return NovelUtil.getNovelList(1,novelMapper);
    }

    @GetMapping("Oriental")
    @ResponseBody
    public List<Novel> findNovelOriental(){
        return NovelUtil.getNovelList(2,novelMapper);
    }

    @GetMapping("Reincarnation")
    @ResponseBody
    public List<Novel> findNovelReincarnation(){
        return NovelUtil.getNovelList(3, novelMapper);
    }

    @GetMapping("Ancient")
    @ResponseBody
    public List<Novel> findNovelAncient(){
        return NovelUtil.getNovelList(4, novelMapper);
    }

    @GetMapping("MagicSchool")
    @ResponseBody
    public List<Novel> findNovelMagicSchool(){
        return NovelUtil.getNovelList(5, novelMapper);
    }

    @GetMapping("swordsman")
    @ResponseBody
    public List<Novel> swordsman(){
        return NovelUtil.getNovelList(6, novelMapper);
    }

    @GetMapping("modern")
    @ResponseBody
    public List<Novel> modern(){
        return NovelUtil.getNovelList(7, novelMapper);
    }

    @GetMapping("newMartial")
    @ResponseBody
    public List<Novel> newMartial(){
        return NovelUtil.getNovelList(8, novelMapper);
    }

    @GetMapping("tradition")
    @ResponseBody
    public List<Novel> tradition(){
        return NovelUtil.getNovelList(9, novelMapper);
    }

    @GetMapping("queer")
    @ResponseBody
    public List<Novel> queer(){
        return NovelUtil.getNovelList(10, novelMapper);
    }

    @GetMapping("reality")
    @ResponseBody
    public List<Novel> reality(){
        return NovelUtil.getNovelList(11, novelMapper);
    }

    @GetMapping("workplace")
    @ResponseBody
    public List<Novel> workplace(){
        return NovelUtil.getNovelList(12, novelMapper);
    }

    @GetMapping("brother")
    @ResponseBody
    public List<Novel> brother(){
        return NovelUtil.getNovelList(13, novelMapper);
    }

    @GetMapping("push")
    @ResponseBody
    public List<Novel> push(){
        return NovelUtil.getNovelList(14, novelMapper);
    }

    @GetMapping("live")
    @ResponseBody
    public List<Novel> live(){
        return NovelUtil.getNovelList(15, novelMapper);
    }

    @GetMapping("youth")
    @ResponseBody
    public List<Novel> youth(){
        return NovelUtil.getNovelList(16, novelMapper);
    }

    @GetMapping("youthLife")
    @ResponseBody
    public List<Novel> youthLife(){
        return NovelUtil.getNovelList(17, novelMapper);
    }
}
