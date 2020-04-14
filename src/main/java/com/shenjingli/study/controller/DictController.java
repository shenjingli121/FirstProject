package com.shenjingli.study.controller;

import com.shenjingli.study.entity.DictEntity;
import com.shenjingli.study.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("web/shenjingli/study/")
public class DictController {
    @Autowired
    private DictService dictService;

    @GetMapping("getList")
    public List<DictEntity> getList() {
        return dictService.getList();
    }
}
