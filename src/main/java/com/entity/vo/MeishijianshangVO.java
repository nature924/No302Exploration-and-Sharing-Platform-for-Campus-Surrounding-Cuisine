package com.entity.vo;

import com.entity.MeishijianshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 美食鉴赏
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-12 20:57:00
 */
public class MeishijianshangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 美食名称
	 */
	
	private String meishimingcheng;
		
	/**
	 * 美食类别
	 */
	
	private String meishileibie;
		
	/**
	 * 美食介绍
	 */
	
	private String meishijieshao;
		
	/**
	 * 商铺所在地
	 */
	
	private String shangpusuozaidi;
		
	/**
	 * 推荐指数
	 */
	
	private String tuijianzhishu;
		
	/**
	 * 美食照片
	 */
	
	private String meishizhaopian;
		
	/**
	 * 商品价格
	 */
	
	private String shangpinjiage;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：美食名称
	 */
	 
	public void setMeishimingcheng(String meishimingcheng) {
		this.meishimingcheng = meishimingcheng;
	}
	
	/**
	 * 获取：美食名称
	 */
	public String getMeishimingcheng() {
		return meishimingcheng;
	}
				
	
	/**
	 * 设置：美食类别
	 */
	 
	public void setMeishileibie(String meishileibie) {
		this.meishileibie = meishileibie;
	}
	
	/**
	 * 获取：美食类别
	 */
	public String getMeishileibie() {
		return meishileibie;
	}
				
	
	/**
	 * 设置：美食介绍
	 */
	 
	public void setMeishijieshao(String meishijieshao) {
		this.meishijieshao = meishijieshao;
	}
	
	/**
	 * 获取：美食介绍
	 */
	public String getMeishijieshao() {
		return meishijieshao;
	}
				
	
	/**
	 * 设置：商铺所在地
	 */
	 
	public void setShangpusuozaidi(String shangpusuozaidi) {
		this.shangpusuozaidi = shangpusuozaidi;
	}
	
	/**
	 * 获取：商铺所在地
	 */
	public String getShangpusuozaidi() {
		return shangpusuozaidi;
	}
				
	
	/**
	 * 设置：推荐指数
	 */
	 
	public void setTuijianzhishu(String tuijianzhishu) {
		this.tuijianzhishu = tuijianzhishu;
	}
	
	/**
	 * 获取：推荐指数
	 */
	public String getTuijianzhishu() {
		return tuijianzhishu;
	}
				
	
	/**
	 * 设置：美食照片
	 */
	 
	public void setMeishizhaopian(String meishizhaopian) {
		this.meishizhaopian = meishizhaopian;
	}
	
	/**
	 * 获取：美食照片
	 */
	public String getMeishizhaopian() {
		return meishizhaopian;
	}
				
	
	/**
	 * 设置：商品价格
	 */
	 
	public void setShangpinjiage(String shangpinjiage) {
		this.shangpinjiage = shangpinjiage;
	}
	
	/**
	 * 获取：商品价格
	 */
	public String getShangpinjiage() {
		return shangpinjiage;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
