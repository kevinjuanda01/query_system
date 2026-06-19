package com.example.query.mapper;

import com.example.query.entity.Query;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface QueryMapper {
    List<Query> findAll();

    void insert(Query query);
}
