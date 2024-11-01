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


import com.dao.WodehaoyouDao;
import com.entity.WodehaoyouEntity;
import com.service.WodehaoyouService;
import com.entity.vo.WodehaoyouVO;
import com.entity.view.WodehaoyouView;

@Service("wodehaoyouService")
public class WodehaoyouServiceImpl extends ServiceImpl<WodehaoyouDao, WodehaoyouEntity> implements WodehaoyouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WodehaoyouEntity> page = this.selectPage(
                new Query<WodehaoyouEntity>(params).getPage(),
                new EntityWrapper<WodehaoyouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WodehaoyouEntity> wrapper) {
		  Page<WodehaoyouView> page =new Query<WodehaoyouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WodehaoyouVO> selectListVO(Wrapper<WodehaoyouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WodehaoyouVO selectVO(Wrapper<WodehaoyouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WodehaoyouView> selectListView(Wrapper<WodehaoyouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WodehaoyouView selectView(Wrapper<WodehaoyouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
