package com.hito.cms;

import com.hito.manage_cms.ManageCmsApplication;
import com.hito.manage_cms.dao.CmsPageRepository;
import com.xuecheng.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 页面查询测试
 *
 * @author HitoM
 * @date 2019/10/7 18:47
 **/
@SpringBootTest(classes = ManageCmsApplication.class)
@RunWith(SpringRunner.class)
public class CmPageRepositoryTest {

    @Autowired
    CmsPageRepository cmsPageRepository;

    @Test
    public void testFindAll() {
        ExampleMatcher matching = ExampleMatcher.matching();
        matching.withMatcher("pageAliase", ExampleMatcher.GenericPropertyMatchers.contains());
        CmsPage condition = new CmsPage();
        condition.setSiteId("5a751fab6abb5044e0d19ea1");
        condition.setTemplateId("5a962bf8b00ffc514038fafa");
        Example<CmsPage> example = Example.of(condition, matching);
        PageRequest request = PageRequest.of(0, 10);
        Page<CmsPage> all = cmsPageRepository.findAll(example, request);
        all.forEach(System.out::println);
    }

    //分页查询
    @Test
    public void testFindPage() {
        //分页参数
        int page = 1;//从0开始
        int size = 10;
        Pageable pageable = PageRequest.of(page, size);
        Page<CmsPage> all = cmsPageRepository.findAll(pageable);
        System.out.println(all);
    }

    //根据页面名称查询
    @Test
    public void testfindByPageName() {
        CmsPage cmsPage = cmsPageRepository.findByPageName("index2.html");
        System.out.println(cmsPage);
    }
}
