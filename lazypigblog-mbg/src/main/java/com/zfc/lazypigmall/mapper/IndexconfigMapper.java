package com.zfc.lazypigmall.mapper;

import com.zfc.lazypigmall.model.Indexconfig;
import com.zfc.lazypigmall.model.IndexconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndexconfigMapper {
    long countByExample(IndexconfigExample example);

    int deleteByExample(IndexconfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Indexconfig record);

    int insertSelective(Indexconfig record);

    List<Indexconfig> selectByExample(IndexconfigExample example);

    Indexconfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Indexconfig record, @Param("example") IndexconfigExample example);

    int updateByExample(@Param("record") Indexconfig record, @Param("example") IndexconfigExample example);

    int updateByPrimaryKeySelective(Indexconfig record);

    int updateByPrimaryKey(Indexconfig record);
}