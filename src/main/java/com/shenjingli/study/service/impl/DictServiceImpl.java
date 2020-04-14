package com.shenjingli.study.service.impl;

import com.shenjingli.study.entity.DictEntity;
import com.shenjingli.study.mapper.DictMapper;
import com.shenjingli.study.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictServiceImpl implements DictService {
    @Autowired
    private DictMapper dictMapper;

    @Override
    public List<DictEntity> getList() {
        return dictMapper.getList();
    }
}
