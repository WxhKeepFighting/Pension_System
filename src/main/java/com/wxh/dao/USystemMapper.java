package com.wxh.dao;

import com.wxh.model.USystem;
import com.wxh.model.USystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface USystemMapper {
    long countByExample(USystemExample example);

    int deleteByExample(USystemExample example);

    int deleteByPrimaryKey(String sId);

    int insert(USystem record);

    int insertSelective(USystem record);

    List<USystem> selectByExample(USystemExample example);

    USystem selectByPrimaryKey(String sId);

    int updateByExampleSelective(@Param("record") USystem record, @Param("example") USystemExample example);

    int updateByExample(@Param("record") USystem record, @Param("example") USystemExample example);

    int updateByPrimaryKeySelective(USystem record);

    int updateByPrimaryKey(USystem record);
}