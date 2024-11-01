package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeishijianshangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeishijianshangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeishijianshangView;


/**
 * 美食鉴赏评论表
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:57:00
 */
public interface DiscussmeishijianshangService extends IService<DiscussmeishijianshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeishijianshangVO> selectListVO(Wrapper<DiscussmeishijianshangEntity> wrapper);
   	
   	DiscussmeishijianshangVO selectVO(@Param("ew") Wrapper<DiscussmeishijianshangEntity> wrapper);
   	
   	List<DiscussmeishijianshangView> selectListView(Wrapper<DiscussmeishijianshangEntity> wrapper);
   	
   	DiscussmeishijianshangView selectView(@Param("ew") Wrapper<DiscussmeishijianshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeishijianshangEntity> wrapper);
   	
}

