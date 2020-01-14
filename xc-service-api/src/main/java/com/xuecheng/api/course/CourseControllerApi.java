package com.xuecheng.api.course;

import com.xuecheng.framework.domain.course.Teachplan;
import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 课程Controller中需要实现的接口
 *
 * @author HitoM
 * @date 2020/1/14 22:52
 **/
@Api(value = "课程管理接口", description = "课程的增删改查")
public interface CourseControllerApi {
    @ApiOperation("课程计划查询")
    TeachplanNode findTeachplanList(String courseId);

    @ApiOperation("新增课程")
    ResponseResult addTeachPlan(Teachplan teachplan);
}
