package com.dao;

import com.entity.DiscussmeishijianshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeishijianshangVO;
import com.entity.view.DiscussmeishijianshangView;


/**
 * 美食鉴赏评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:57:00
 */
public interface DiscussmeishijianshangDao extends BaseMapper<DiscussmeishijianshangEntity> {
	
	List<DiscussmeishijianshangVO> selectListVO(@Param("ew") Wrapper<DiscussmeishijianshangEntity> wrapper);
	
	DiscussmeishijianshangVO selectVO(@Param("ew") Wrapper<DiscussmeishijianshangEntity> wrapper);
	
	List<DiscussmeishijianshangView> selectListView(@Param("ew") Wrapper<DiscussmeishijianshangEntity> wrapper);

	List<DiscussmeishijianshangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeishijianshangEntity> wrapper);
	
	DiscussmeishijianshangView selectView(@Param("ew") Wrapper<DiscussmeishijianshangEntity> wrapper);
	
}
