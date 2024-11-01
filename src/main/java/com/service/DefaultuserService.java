package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DefaultuserEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DefaultuserVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DefaultuserView;


/**
 * 注册用户
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:57:00
 */
public interface DefaultuserService extends IService<DefaultuserEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DefaultuserVO> selectListVO(Wrapper<DefaultuserEntity> wrapper);
   	
   	DefaultuserVO selectVO(@Param("ew") Wrapper<DefaultuserEntity> wrapper);
   	
   	List<DefaultuserView> selectListView(Wrapper<DefaultuserEntity> wrapper);
   	
   	DefaultuserView selectView(@Param("ew") Wrapper<DefaultuserEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DefaultuserEntity> wrapper);
   	
}

