package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WodehaoyouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WodehaoyouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WodehaoyouView;


/**
 * 我的好友
 *
 * @author 
 * @email 
 * @date 2021-03-12 20:57:00
 */
public interface WodehaoyouService extends IService<WodehaoyouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodehaoyouVO> selectListVO(Wrapper<WodehaoyouEntity> wrapper);
   	
   	WodehaoyouVO selectVO(@Param("ew") Wrapper<WodehaoyouEntity> wrapper);
   	
   	List<WodehaoyouView> selectListView(Wrapper<WodehaoyouEntity> wrapper);
   	
   	WodehaoyouView selectView(@Param("ew") Wrapper<WodehaoyouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodehaoyouEntity> wrapper);
   	
}

