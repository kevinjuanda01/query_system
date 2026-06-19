package com.example.query.form;

import java.time.LocalDateTime;

// import java.sql.Timestamp;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class QueryForm {
    @NotBlank
    private String author;

    @NotBlank
    @Size(max = 15)
    private String phone_number;

    @NotBlank
    @Size(max = 200)
    private String query_body;

    @NotBlank
    private String status;

    private LocalDateTime date;

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
