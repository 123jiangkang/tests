package com.xuecheng.api.config.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;

/**
 * @Version 1.0
 * @Author kang.jiang
 * @Created 2020年03月20  12:15:46
 * @Description <p>
 * @Modification <p>
 * Date Author Version Description
 * <p>
 * 2020年03月20  kang.jiang 1.0 create file
 */

@Api(value="aaaaaaa",description="User的相关信息接口")
public interface CmsPageControllerApi {

    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest) ;
}
