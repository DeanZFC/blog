package com.zfc.lazypigmall.mapper;

import com.zfc.lazypigmall.model.Shoppingcartitem;
import com.zfc.lazypigmall.model.ShoppingcartitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingcartitemMapper {
    long countByExample(ShoppingcartitemExample example);

    int deleteByExample(ShoppingcartitemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Shoppingcartitem record);

    int insertSelective(Shoppingcartitem record);

    List<Shoppingcartitem> selectByExample(ShoppingcartitemExample example);

    Shoppingcartitem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Shoppingcartitem record, @Param("example") ShoppingcartitemExample example);

    int updateByExample(@Param("record") Shoppingcartitem record, @Param("example") ShoppingcartitemExample example);

    int updateByPrimaryKeySelective(Shoppingcartitem record);

    int updateByPrimaryKey(Shoppingcartitem record);
}