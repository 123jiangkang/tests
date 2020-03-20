package com.xuecheng.manage_cms.web.controller;

import com.xuecheng.api.config.cms.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Version 1.0
 * @Author kang.jiang
 * @Created 2020年03月20  12:14:31
 * @Description <p>
 * @Modification <p>
 * Date Author Version Description
 * <p>
 * 2020年03月20  kang.jiang 1.0 create file
 */
@RestController
@RequestMapping("cms")
public class CmsPageController implements CmsPageControllerApi {
    @Override
    @GetMapping("/list/{page}/{size}")
    public QueryResponseResult findList(@PathVariable("page") int page, @PathVariable("size") int size, QueryPageRequest queryPageRequest) {
        QueryResult queryResult = new QueryResult();
        queryResult.setTotal(2);
        List list = new ArrayList();
        CmsPage cmsPage = new CmsPage();
        cmsPage.setPageName("测试页面");
        list.add(cmsPage);
        queryResult.setList(list);
        QueryResponseResult queryResponseResult = new
                QueryResponseResult(CommonCode.SUCCESS, queryResult);
        return queryResponseResult;
    }
}
