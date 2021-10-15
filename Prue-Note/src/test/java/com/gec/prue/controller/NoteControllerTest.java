package com.gec.prue.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gec.prue.entity.Note;
import com.gec.prue.mapper.NoteMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class NoteControllerTest {

    @Autowired(required = true)
    private NoteMapper noteMapper;

    @Test
    public void test(){
        List<Note> notes = noteMapper.selectList(null);
        System.out.println("notes = " + notes);
    }
}