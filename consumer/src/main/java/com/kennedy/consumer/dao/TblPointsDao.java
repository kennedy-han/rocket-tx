package com.kennedy.consumer.dao;

import com.kennedy.consumer.entity.TblPoints;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TblPointsDao {
    int deleteByPrimaryKey(Long id);

    int insert(TblPoints record);

    int insertSelective(TblPoints record);

    TblPoints selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TblPoints record);

    int updateByPrimaryKey(TblPoints record);
}