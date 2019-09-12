package com.sharding.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;

/**
 * 
 * 数据库实体<br>
 * 版权: Copyright (c) 2011-2019<br>
 * 
 * @author: 孙常军<br>
 * @date: 2019年9月10日<br>
 */
public class TripMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 消息ID */
	private String mid;

	/** 消息时间戳 */
	private Long mtime;

	/** 消息类型 */
	private String mtype;

	/** 行程类型 */
	private String ttype;

	/** 关注类型 */
	private Integer utype;

	/** 行程key */
	private String tkey;

	/** 消息标题 */
	private String title;

	/** 消息文本 */
	private String content;

	/** 消息来源 */
	private String src;

	/** 消息优先级 */
	private Integer sort;

	/** 消息状态 */
	private Integer status;

	/** 新数据 */
	private Map<String, Object> data;

	/** 原数据 */
	private Map<String, Object> olddata;

	/** 扩展数据 */
	private Map<String, Object> extdata;

	/** 创建时间 */
	private Date createtime;

	/** 更新时间 */
	private Date updatetime;

	/**
	 * 是否有效
	 * 
	 * @return
	 */
	public boolean isValid() {
		return StringUtils.isNotBlank(getMtype()) && StringUtils.isNotBlank(getSrc()) && StringUtils.isNotBlank(getTtype()) && StringUtils.isNotBlank(getTkey());
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public Long getMtime() {
		return mtime;
	}

	public void setMtime(Long mtime) {
		this.mtime = mtime;
	}

	public String getMtype() {
		return mtype;
	}

	public void setMtype(String mtype) {
		this.mtype = mtype;
	}

	public Integer getUtype() {
		return utype;
	}

	public void setUtype(Integer utype) {
		this.utype = utype;
	}

	public String getTtype() {
		return ttype;
	}

	public void setTtype(String ttype) {
		this.ttype = ttype;
	}

	public String getTkey() {
		return tkey;
	}

	public void setTkey(String tkey) {
		this.tkey = tkey;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	public void setDataStr(String data) {
		this.data = JSON.parseObject(data, Map.class);
	}

	public Map<String, Object> getOlddata() {
		return olddata;
	}

	public void setOlddata(Map<String, Object> olddata) {
		this.olddata = olddata;
	}

	public void setOlddataStr(String olddata) {
		this.olddata = JSON.parseObject(olddata, Map.class);
	}

	public Map<String, Object> getExtdata() {
		return extdata;
	}

	public void setExtdata(Map<String, Object> extdata) {
		this.extdata = extdata;
	}

	public void setExtdataStr(String extdata) {
		this.extdata = JSON.parseObject(extdata, Map.class);
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Override
	public String toString() {
		return "TripMessage [mid=" + mid + ", mtime=" + mtime + ", mtype=" + mtype + ", ttype=" + ttype + ", utype=" + utype + ", tkey=" + tkey + ", title=" + title + ", content="
				+ content + ", src=" + src + ", sort=" + sort + ", status=" + status + ", createtime=" + createtime + ", updatetime=" + updatetime + "]";
	}

}