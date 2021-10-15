package com.gec.prue.util;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gec.prue.entity.Novel;
import com.gec.prue.mapper.NovelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
public class NovelUtil {

    public static List<Novel> getNovelList(int novelId,NovelMapper novelMapper){
        Map map = new HashMap<>();
        map.put("novelId", novelId);
        QueryWrapper queryWrapper  = new QueryWrapper();
        queryWrapper.allEq(map);
        return novelMapper.selectList(queryWrapper);
    }

}
