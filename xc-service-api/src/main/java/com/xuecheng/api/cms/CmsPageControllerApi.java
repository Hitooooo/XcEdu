package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;

/**
 *
 * @author HitoM
 * @date 2019/9/30 0:43
 **/
@Api(value="cms页面管理接口",description = "cms页面管理接口，提供页面的增、删、改、查")
public interface CmsPageControllerApi  {
     QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
