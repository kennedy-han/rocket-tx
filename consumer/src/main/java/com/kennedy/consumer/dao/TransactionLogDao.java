package com.kennedy.consumer.dao;

import com.kennedy.consumer.entity.TransactionLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TransactionLogDao {
    int deleteByPrimaryKey(String id);

    int insert(TransactionLog record);

    int insertSelective(TransactionLog record);

    TransactionLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TransactionLog record);

    int updateByPrimaryKey(TransactionLog record);

    int selectCount(String id);
}