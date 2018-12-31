package com.example.tutiya.mybatis.mapper;

import com.example.tutiya.mybatis.entity.generated.Test;
import com.example.tutiya.mybatis.entity.generated.TestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ListMapper {

    long countAll();
}