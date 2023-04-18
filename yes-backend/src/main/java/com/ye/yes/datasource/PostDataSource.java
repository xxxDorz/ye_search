package com.ye.yes.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ye.yes.model.dto.post.PostQueryRequest;
import com.ye.yes.model.entity.Post;
import com.ye.yes.model.vo.PostVO;
import com.ye.yes.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 帖子服务实现
 *
 */
@Service
@Slf4j
public class PostDataSource implements DataSource<PostVO> {

    @Resource
    private PostService postService;

    @Override
    public Page<PostVO> doSearch(String searchText, long pageNum, long pageSize) {
        PostQueryRequest postQueryRequest = new PostQueryRequest();
        postQueryRequest.setSearchText(searchText);
        postQueryRequest.setCurrent(pageNum);
        postQueryRequest.setPageSize(pageSize);
        ServletRequestAttributes servletRequestAttributes =  (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        Page<PostVO> postVOPage = postService.listPostVOByPage(postQueryRequest, request);
        return postVOPage;
    }
}




