package com.hito.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * TODO
 *
 * @author HitoM
 * @date 2019/10/21 23:12
 **/
public interface CmsConfigRepository extends MongoRepository<CmsConfig, String> {

}
