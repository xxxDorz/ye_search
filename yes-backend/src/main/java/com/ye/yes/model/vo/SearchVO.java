package com.ye.yes.model.vo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ye.yes.model.entity.Picture;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 聚合搜索
 * vo: 需要返回前端的内容
 */
@Data
public class SearchVO implements Serializable {

    private List<UserVO> userList;

    private List<PostVO> postList;

    private List<Picture> pictureList;

    private List<?> dataList;

    private static final long serialVersionUID = 1L;

}
