package com.gec.prue.controller;

import com.gec.prue.entity.Note;
import com.gec.prue.mapper.NoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
public class NoteController {

    @Autowired(required = true)
    private NoteMapper noteMapper;

    @GetMapping("findNote")
    @ResponseBody
    public List<Note> findNote(){
        return noteMapper.selectList(null);
    }

    @PostMapping("saveNote")
    public boolean saveNote(Note note){
        note.setCreatetime(new Date(System.currentTimeMillis()));
        int insert = noteMapper.insert(note);
        return insert != 0 ? true:false;
    }
}
