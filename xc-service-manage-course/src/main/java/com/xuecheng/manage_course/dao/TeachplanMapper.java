package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import org.apache.ibatis.annotations.Mapper;

/**
 * 课程计划
 *
 * @author HitoM
 * @date 2020/1/14 22:57
 **/
@Mapper
public interface TeachplanMapper {
    TeachplanNode selectList(String courseId);
}
