package com.dao;

import com.entity.MeishijianshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeishijianshangVO;
import com.entity.view.MeishijianshangView;


/**
 * 美食鉴赏
 * 
 * @author 
 * @email 
 * @date 2021-03-12 20:57:00
 */
public interface MeishijianshangDao extends BaseMapper<MeishijianshangEntity> {
	
	List<MeishijianshangVO> selectListVO(@Param("ew") Wrapper<MeishijianshangEntity> wrapper);
	
	MeishijianshangVO selectVO(@Param("ew") Wrapper<MeishijianshangEntity> wrapper);
	
	List<MeishijianshangView> selectListView(@Param("ew") Wrapper<MeishijianshangEntity> wrapper);

	List<MeishijianshangView> selectListView(Pagination page,@Param("ew") Wrapper<MeishijianshangEntity> wrapper);
	
	MeishijianshangView selectView(@Param("ew") Wrapper<MeishijianshangEntity> wrapper);
	
}
