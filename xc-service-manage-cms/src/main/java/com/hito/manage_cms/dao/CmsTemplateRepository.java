package com.hito.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * TODO
 *
 * @author HitoM
 * @date 2019/10/24 0:03
 **/
public interface CmsTemplateRepository extends MongoRepository<CmsTemplate, String> {
}
