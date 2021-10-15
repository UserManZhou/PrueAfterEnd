package com.gec.prue.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gec.prue.entity.Novel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface NovelMapper extends BaseMapper<Novel> {
}
