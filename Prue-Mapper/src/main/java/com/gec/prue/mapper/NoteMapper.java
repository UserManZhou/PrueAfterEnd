package com.gec.prue.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gec.prue.entity.Note;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2021-10-10
 */
@Mapper
@Repository
public interface NoteMapper extends BaseMapper<Note> {

}
