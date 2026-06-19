package com.example.query.service;

import com.example.query.entity.Query;
import com.example.query.form.QueryForm;
import com.example.query.mapper.QueryMapper;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;
import java.util.List;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class QueryService {
    private final QueryMapper queryMapper;
    
    public QueryService(QueryMapper queryMapper) {
        this.queryMapper = queryMapper;
    }

    // Timestamp convertFrom(LocalDateTime dateString) {
    //     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    //     LocalDateTime localDateTime = LocalDateTime.parse(dateString, formatter);

    //     return Timestamp.valueOf(localDateTime);
    // }


    public List<Query> findAll() {
        return queryMapper.findAll();
    }

    public void insert(QueryForm queryForm) {
        Query query = new Query();
        
        query.setAuthor(queryForm.getAuthor());
        query.setPhoneNumber(queryForm.getPhoneNumber());
        query.setQueryBody(queryForm.getQueryBody());
        query.setStatus(queryForm.getStatus());
        query.setDate(queryForm.getDate());

        queryMapper.insert(query);
    }
}
