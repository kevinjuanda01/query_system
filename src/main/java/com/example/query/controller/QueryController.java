package com.example.query.controller;

import com.example.query.form.QueryForm;
import com.example.query.service.QueryService;

import jakarta.validation.Valid;
import java.sql.Timestamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QueryController {
    private final QueryService queryService;

    public QueryController(QueryService queryService) {
        this.queryService = queryService;
    }
    
    // 問合せ一覧画面
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("queries", queryService.findAll());
        return "index";
    }

    // 登録画面
    @GetMapping("/new")
    public String newQuery(Model model) {
        QueryForm form = new QueryForm();
        form.setDate(Timestamp.valueOf(java.time.LocalDateTime.now()).toLocalDateTime());
        model.addAttribute("queryForm", form);
        return "new";
    }

    @PostMapping("/new")
    public String create(@Valid @ModelAttribute QueryForm queryForm, BindingResult result) {
        if (result.hasErrors()) {
            return "new";
        }
        queryService.insert(queryForm);
        return "redirect:/";
    }
}
