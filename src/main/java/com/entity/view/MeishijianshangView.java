package com.entity.view;

import com.entity.MeishijianshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美食鉴赏
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 20:57:00
 */
@TableName("meishijianshang")
public class MeishijianshangView  extends MeishijianshangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeishijianshangView(){
	}
 
 	public MeishijianshangView(MeishijianshangEntity meishijianshangEntity){
 	try {
			BeanUtils.copyProperties(this, meishijianshangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
