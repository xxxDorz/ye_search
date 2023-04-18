package com.ye.yes.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ye.yes.common.BaseResponse;
import com.ye.yes.common.ErrorCode;
import com.ye.yes.common.ResultUtils;
import com.ye.yes.exception.BusinessException;
import com.ye.yes.exception.ThrowUtils;
import com.ye.yes.manager.SearchFacade;
import com.ye.yes.model.dto.post.PostQueryRequest;
import com.ye.yes.model.dto.search.SearchRequest;
import com.ye.yes.model.dto.user.UserQueryRequest;
import com.ye.yes.model.entity.Picture;
import com.ye.yes.model.enums.SearchTypeEnum;
import com.ye.yes.model.vo.PostVO;
import com.ye.yes.model.vo.SearchVO;
import com.ye.yes.model.vo.UserVO;
import com.ye.yes.service.PictureService;
import com.ye.yes.service.PostService;
import com.ye.yes.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * 图片接口
 *
 */
@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {

    @Resource
    private SearchFacade searchFacade;

    @PostMapping("/all")
    public BaseResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest, HttpServletRequest request) {
        return ResultUtils.success(searchFacade.searchAll(searchRequest, request));
    }


}
