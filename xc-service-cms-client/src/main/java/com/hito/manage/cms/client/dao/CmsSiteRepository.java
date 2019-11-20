package com.hito.manage.cms.client.dao;

import com.xuecheng.framework.domain.cms.CmsSite;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * TODO
 *
 * @author HitoM
 * @date 2019/11/20 22:43
 **/
public interface CmsSiteRepository extends MongoRepository<CmsSite,String> {
}
