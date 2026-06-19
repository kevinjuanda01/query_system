package com.example.query.entity;

import java.time.LocalDateTime;

public class Query {
    private Long id;
    private String author;
    private String phone_number;
    private String query_body;
    private String status;
    private LocalDateTime date;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getPhoneNumber() { return phone_number; }
    public void setPhoneNumber(String phone_number) { this.phone_number = phone_number; }

    public String getQueryBody() { return query_body; }
    public void setQueryBody(String query_body) { this.query_body = query_body; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }
}
