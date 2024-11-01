package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DefaultuserDao;
import com.entity.DefaultuserEntity;
import com.service.DefaultuserService;
import com.entity.vo.DefaultuserVO;
import com.entity.view.DefaultuserView;

@Service("defaultuserService")
public class DefaultuserServiceImpl extends ServiceImpl<DefaultuserDao, DefaultuserEntity> implements DefaultuserService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DefaultuserEntity> page = this.selectPage(
                new Query<DefaultuserEntity>(params).getPage(),
                new EntityWrapper<DefaultuserEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DefaultuserEntity> wrapper) {
		  Page<DefaultuserView> page =new Query<DefaultuserView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DefaultuserVO> selectListVO(Wrapper<DefaultuserEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DefaultuserVO selectVO(Wrapper<DefaultuserEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DefaultuserView> selectListView(Wrapper<DefaultuserEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DefaultuserView selectView(Wrapper<DefaultuserEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
