package com.zfc.lazypigblog.article.mapper;

import com.zfc.lazypigblog.article.model.Column;
import com.zfc.lazypigblog.article.model.ColumnExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ColumnMapper {
    long countByExample(ColumnExample example);

    int deleteByExample(ColumnExample example);

    int deleteByPrimaryKey(String id);

    int insert(Column record);

    int insertSelective(Column record);

    List<Column> selectByExample(ColumnExample example);

    Column selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Column record, @Param("example") ColumnExample example);

    int updateByExample(@Param("record") Column record, @Param("example") ColumnExample example);

    int updateByPrimaryKeySelective(Column record);

    int updateByPrimaryKey(Column record);
}