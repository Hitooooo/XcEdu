package com.hito.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * TODO
 *
 * @author HitoM
 * @date 2019/9/30 1:00
 **/
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
    CmsPage findByPageName(String pageName);
}
