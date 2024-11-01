package com.entity.view;

import com.entity.WodehaoyouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 我的好友
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:57:00
 */
@TableName("wodehaoyou")
public class WodehaoyouView  extends WodehaoyouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WodehaoyouView(){
	}
 
 	public WodehaoyouView(WodehaoyouEntity wodehaoyouEntity){
 	try {
			BeanUtils.copyProperties(this, wodehaoyouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
