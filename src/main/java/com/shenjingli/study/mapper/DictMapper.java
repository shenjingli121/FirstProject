package com.shenjingli.study.mapper;

import com.shenjingli.study.entity.DictEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DictMapper {
    @Select("select * from sys_dict")
    List<DictEntity> getList();
}
