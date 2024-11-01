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


import com.dao.MeishijianshangDao;
import com.entity.MeishijianshangEntity;
import com.service.MeishijianshangService;
import com.entity.vo.MeishijianshangVO;
import com.entity.view.MeishijianshangView;

@Service("meishijianshangService")
public class MeishijianshangServiceImpl extends ServiceImpl<MeishijianshangDao, MeishijianshangEntity> implements MeishijianshangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeishijianshangEntity> page = this.selectPage(
                new Query<MeishijianshangEntity>(params).getPage(),
                new EntityWrapper<MeishijianshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeishijianshangEntity> wrapper) {
		  Page<MeishijianshangView> page =new Query<MeishijianshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeishijianshangVO> selectListVO(Wrapper<MeishijianshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeishijianshangVO selectVO(Wrapper<MeishijianshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeishijianshangView> selectListView(Wrapper<MeishijianshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeishijianshangView selectView(Wrapper<MeishijianshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
