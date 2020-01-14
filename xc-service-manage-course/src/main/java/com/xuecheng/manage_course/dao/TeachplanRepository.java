package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.Teachplan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * TODO
 *
 * @author HitoM
 * @date 2020/1/14 23:07
 **/
public interface TeachplanRepository extends JpaRepository<Teachplan, String> {
    List<Teachplan> findByCourseidAndParentid(String courseId, String parentId);
}
