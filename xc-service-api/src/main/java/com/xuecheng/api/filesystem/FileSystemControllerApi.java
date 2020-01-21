package com.xuecheng.api.filesystem;

import com.xuecheng.framework.domain.filesystem.response.UploadFileResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.multipart.MultipartFile;

/**
 * TODO
 *
 * @author HitoM
 * @date 2020/1/19 23:22
 **/
@Api(value = "文件管理接口", description = "文件管理接口，提供文件的增、删、改、查")
public interface FileSystemControllerApi {

    //上传文件
    @ApiOperation("上传文件接口")
    UploadFileResult upload(MultipartFile multipartFile,
                            String filetag,
                            String businesskey,
                            String metadata);

}

