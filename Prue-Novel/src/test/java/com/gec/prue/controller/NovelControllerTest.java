package com.gec.prue.controller;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gec.prue.NovelApp;
import com.gec.prue.entity.Novel;
import com.gec.prue.mapper.NovelMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest()
@RunWith(SpringJUnit4ClassRunner.class)
public class NovelControllerTest {

    @Autowired(required = true)
    private NovelMapper novelMapper;

    @Test
    public void test(){
       /* List<Novel> novels = novelMapper.selectList(null);
        for (Novel novel : novels) {
            System.out.println("novel = " + novel);
        }*/
        HashMap map = new HashMap();
        map.put("novelId", 2);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.allEq(map);
        List<Novel> list = novelMapper.selectList(queryWrapper);
        for (Novel novel : list) {
            System.out.println("novel = " + novel);
        }
    }

}