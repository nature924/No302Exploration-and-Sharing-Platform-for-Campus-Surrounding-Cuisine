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


import com.dao.DiscussmeishijianshangDao;
import com.entity.DiscussmeishijianshangEntity;
import com.service.DiscussmeishijianshangService;
import com.entity.vo.DiscussmeishijianshangVO;
import com.entity.view.DiscussmeishijianshangView;

@Service("discussmeishijianshangService")
public class DiscussmeishijianshangServiceImpl extends ServiceImpl<DiscussmeishijianshangDao, DiscussmeishijianshangEntity> implements DiscussmeishijianshangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeishijianshangEntity> page = this.selectPage(
                new Query<DiscussmeishijianshangEntity>(params).getPage(),
                new EntityWrapper<DiscussmeishijianshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeishijianshangEntity> wrapper) {
		  Page<DiscussmeishijianshangView> page =new Query<DiscussmeishijianshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmeishijianshangVO> selectListVO(Wrapper<DiscussmeishijianshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeishijianshangVO selectVO(Wrapper<DiscussmeishijianshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeishijianshangView> selectListView(Wrapper<DiscussmeishijianshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeishijianshangView selectView(Wrapper<DiscussmeishijianshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
