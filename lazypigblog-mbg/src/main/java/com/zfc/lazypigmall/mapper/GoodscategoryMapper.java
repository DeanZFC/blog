package com.zfc.lazypigmall.mapper;

import com.zfc.lazypigmall.model.Goodscategory;
import com.zfc.lazypigmall.model.GoodscategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodscategoryMapper {
    long countByExample(GoodscategoryExample example);

    int deleteByExample(GoodscategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Goodscategory record);

    int insertSelective(Goodscategory record);

    List<Goodscategory> selectByExample(GoodscategoryExample example);

    Goodscategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Goodscategory record, @Param("example") GoodscategoryExample example);

    int updateByExample(@Param("record") Goodscategory record, @Param("example") GoodscategoryExample example);

    int updateByPrimaryKeySelective(Goodscategory record);

    int updateByPrimaryKey(Goodscategory record);
}