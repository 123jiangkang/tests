package com.xuecheng.framework.domain.cms.request;

import lombok.Data;

/**
 * @Version 1.0
 * @Author kang.jiang
 * @Created 2020年03月20  12:17:07
 * @Description <p>
 * @Modification <p>
 * Date Author Version Description
 * <p>
 * 2020年03月20  kang.jiang 1.0 create file
 */
@Data
public class QueryPageRequest {
    //站点id
    private String siteId;
    //页面ID
    private String pageId;
    //页面名称
    private String pageName;
    //别名
    private String pageAliase;
    //模版id
    private String templateId;
}
