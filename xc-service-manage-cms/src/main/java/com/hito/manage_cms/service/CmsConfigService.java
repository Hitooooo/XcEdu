package com.hito.manage_cms.service;

import com.hito.manage_cms.dao.CmsConfigRepository;
import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * TODO
 *
 * @author HitoM
 * @date 2019/10/21 23:13
 **/
@Service
public class CmsConfigService {
    @Autowired
    private CmsConfigRepository cmsConfigRepository;

    public CmsConfig getConfigById(String id){
        Optional<CmsConfig> cmsConfig = cmsConfigRepository.findById(id);
        return cmsConfig.orElse(null);
    }
}
