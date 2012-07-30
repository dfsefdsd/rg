/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2012
 */

package com.company.project.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.*;

import javacommon.base.*;
import javacommon.util.*;

import cn.org.rapid_framework.util.*;
import cn.org.rapid_framework.web.util.*;
import cn.org.rapid_framework.page.*;
import cn.org.rapid_framework.page.impl.*;

import com.company.project.model.*;
import com.company.project.dao.*;
import com.company.project.service.*;
import com.company.project.vo.query.*;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


@Entity
@Table(name = "IM$INQUIRIES")
public class Im$inquiries extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "Im$inquiries";
	public static final String ALIAS_INQUIRY_ID = "inquiryId";
	public static final String ALIAS_CONTENT_ID = "contentId";
	public static final String ALIAS_EXT_BUYER_ID = "extBuyerId";
	public static final String ALIAS_EXT_CONTACT_ID = "extContactId";
	public static final String ALIAS_COMP_ID = "compId";
	public static final String ALIAS_CONTACT_ID = "contactId";
	public static final String ALIAS_ORG_TYPE = "orgType";
	public static final String ALIAS_INQUIRY_TYPE = "inquiryType";
	public static final String ALIAS_INQUIRY_TIME = "inquiryTime";
	public static final String ALIAS_LAST_THREAD_TIME = "lastThreadTime";
	public static final String ALIAS_RECIPIENT_TOTAL = "recipientTotal";
	public static final String ALIAS_DELETED = "deleted";
	public static final String ALIAS_DEADLINE = "deadline";
	public static final String ALIAS_CC = "cc";
	public static final String ALIAS_SEND_COPY = "sendCopy";
	public static final String ALIAS_EXPECT_QTY_VOL = "expectQtyVol";
	public static final String ALIAS_REQUESTS = "requests";
	public static final String ALIAS_CREATE_BY = "createBy";
	public static final String ALIAS_CREATE_TIME = "createTime";
	public static final String ALIAS_LAST_UPDATE_BY = "lastUpdateBy";
	public static final String ALIAS_LAST_UPDATE_TIME = "lastUpdateTime";
	public static final String ALIAS_IS_HELD = "isHeld";
	
	//date formats
	public static final String FORMAT_INQUIRY_TIME = DATE_FORMAT;
	public static final String FORMAT_LAST_THREAD_TIME = DATE_FORMAT;
	public static final String FORMAT_CREATE_TIME = DATE_FORMAT;
	public static final String FORMAT_LAST_UPDATE_TIME = DATE_FORMAT;
	

	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
	
	private java.lang.Long inquiryId;
	@NotNull 
	private java.lang.Long contentId;
	
	private java.lang.Long extBuyerId;
	
	private java.lang.Long extContactId;
	
	private java.lang.Long compId;
	
	private java.lang.Long contactId;
	@NotNull 
	private java.lang.Boolean orgType;
	@NotBlank @Length(max=2)
	private java.lang.String inquiryType;
	@NotNull 
	private java.util.Date inquiryTime;
	@NotNull 
	private java.util.Date lastThreadTime;
	@NotNull @Max(32767)
	private Integer recipientTotal;
	@NotBlank @Length(max=1)
	private java.lang.String deleted;
	@NotNull @Max(127)
	private Integer deadline;
	@Length(max=50)
	private java.lang.String cc;
	@NotBlank @Length(max=1)
	private java.lang.String sendCopy;
	@Length(max=20)
	private java.lang.String expectQtyVol;
	@Length(max=20)
	private java.lang.String requests;
	@NotNull 
	private java.lang.Long createBy;
	@NotNull 
	private java.util.Date createTime;
	@NotNull 
	private java.lang.Long lastUpdateBy;
	@NotNull 
	private java.util.Date lastUpdateTime;
	@NotBlank @Length(max=1)
	private java.lang.String isHeld;
	//columns END


	public Im$inquiries(){
	}

	public Im$inquiries(
		java.lang.Long inquiryId
	){
		this.inquiryId = inquiryId;
	}

	

	public void setInquiryId(java.lang.Long value) {
		this.inquiryId = value;
	}
	
	@Id @GeneratedValue(generator="custom-id")
	@GenericGenerator(name="custom-id", strategy = "increment")
	@Column(name = "INQUIRY_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 14)
	public java.lang.Long getInquiryId() {
		return this.inquiryId;
	}
	
	@Column(name = "CONTENT_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 14)
	public java.lang.Long getContentId() {
		return this.contentId;
	}
	
	public void setContentId(java.lang.Long value) {
		this.contentId = value;
	}
	
	@Column(name = "EXT_BUYER_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
	public java.lang.Long getExtBuyerId() {
		return this.extBuyerId;
	}
	
	public void setExtBuyerId(java.lang.Long value) {
		this.extBuyerId = value;
	}
	
	@Column(name = "EXT_CONTACT_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
	public java.lang.Long getExtContactId() {
		return this.extContactId;
	}
	
	public void setExtContactId(java.lang.Long value) {
		this.extContactId = value;
	}
	
	@Column(name = "COMP_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
	public java.lang.Long getCompId() {
		return this.compId;
	}
	
	public void setCompId(java.lang.Long value) {
		this.compId = value;
	}
	
	@Column(name = "CONTACT_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
	public java.lang.Long getContactId() {
		return this.contactId;
	}
	
	public void setContactId(java.lang.Long value) {
		this.contactId = value;
	}
	
	@Column(name = "ORG_TYPE", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
	public java.lang.Boolean getOrgType() {
		return this.orgType;
	}
	
	public void setOrgType(java.lang.Boolean value) {
		this.orgType = value;
	}
	
	@Column(name = "INQUIRY_TYPE", unique = false, nullable = false, insertable = true, updatable = true, length = 2)
	public java.lang.String getInquiryType() {
		return this.inquiryType;
	}
	
	public void setInquiryType(java.lang.String value) {
		this.inquiryType = value;
	}
	
	@Transient
	public String getInquiryTimeString() {
		return DateConvertUtils.format(getInquiryTime(), FORMAT_INQUIRY_TIME);
	}
	public void setInquiryTimeString(String value) {
		setInquiryTime(DateConvertUtils.parse(value, FORMAT_INQUIRY_TIME,java.util.Date.class));
	}
	
	@Column(name = "INQUIRY_TIME", unique = false, nullable = false, insertable = true, updatable = true, length = 7)
	public java.util.Date getInquiryTime() {
		return this.inquiryTime;
	}
	
	public void setInquiryTime(java.util.Date value) {
		this.inquiryTime = value;
	}
	
	@Transient
	public String getLastThreadTimeString() {
		return DateConvertUtils.format(getLastThreadTime(), FORMAT_LAST_THREAD_TIME);
	}
	public void setLastThreadTimeString(String value) {
		setLastThreadTime(DateConvertUtils.parse(value, FORMAT_LAST_THREAD_TIME,java.util.Date.class));
	}
	
	@Column(name = "LAST_THREAD_TIME", unique = false, nullable = false, insertable = true, updatable = true, length = 7)
	public java.util.Date getLastThreadTime() {
		return this.lastThreadTime;
	}
	
	public void setLastThreadTime(java.util.Date value) {
		this.lastThreadTime = value;
	}
	
	@Column(name = "RECIPIENT_TOTAL", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
	public Integer getRecipientTotal() {
		return this.recipientTotal;
	}
	
	public void setRecipientTotal(Integer value) {
		this.recipientTotal = value;
	}
	
	@Column(name = "DELETED", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
	public java.lang.String getDeleted() {
		return this.deleted;
	}
	
	public void setDeleted(java.lang.String value) {
		this.deleted = value;
	}
	
	@Column(name = "DEADLINE", unique = false, nullable = false, insertable = true, updatable = true, length = 2)
	public Integer getDeadline() {
		return this.deadline;
	}
	
	public void setDeadline(Integer value) {
		this.deadline = value;
	}
	
	@Column(name = "CC", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
	public java.lang.String getCc() {
		return this.cc;
	}
	
	public void setCc(java.lang.String value) {
		this.cc = value;
	}
	
	@Column(name = "SEND_COPY", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
	public java.lang.String getSendCopy() {
		return this.sendCopy;
	}
	
	public void setSendCopy(java.lang.String value) {
		this.sendCopy = value;
	}
	
	@Column(name = "EXPECT_QTY_VOL", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
	public java.lang.String getExpectQtyVol() {
		return this.expectQtyVol;
	}
	
	public void setExpectQtyVol(java.lang.String value) {
		this.expectQtyVol = value;
	}
	
	@Column(name = "REQUESTS", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
	public java.lang.String getRequests() {
		return this.requests;
	}
	
	public void setRequests(java.lang.String value) {
		this.requests = value;
	}
	
	@Column(name = "CREATE_BY", unique = false, nullable = false, insertable = true, updatable = true, length = 10)
	public java.lang.Long getCreateBy() {
		return this.createBy;
	}
	
	public void setCreateBy(java.lang.Long value) {
		this.createBy = value;
	}
	
	@Transient
	public String getCreateTimeString() {
		return DateConvertUtils.format(getCreateTime(), FORMAT_CREATE_TIME);
	}
	public void setCreateTimeString(String value) {
		setCreateTime(DateConvertUtils.parse(value, FORMAT_CREATE_TIME,java.util.Date.class));
	}
	
	@Column(name = "CREATE_TIME", unique = false, nullable = false, insertable = true, updatable = true, length = 7)
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	
	@Column(name = "LAST_UPDATE_BY", unique = false, nullable = false, insertable = true, updatable = true, length = 10)
	public java.lang.Long getLastUpdateBy() {
		return this.lastUpdateBy;
	}
	
	public void setLastUpdateBy(java.lang.Long value) {
		this.lastUpdateBy = value;
	}
	
	@Transient
	public String getLastUpdateTimeString() {
		return DateConvertUtils.format(getLastUpdateTime(), FORMAT_LAST_UPDATE_TIME);
	}
	public void setLastUpdateTimeString(String value) {
		setLastUpdateTime(DateConvertUtils.parse(value, FORMAT_LAST_UPDATE_TIME,java.util.Date.class));
	}
	
	@Column(name = "LAST_UPDATE_TIME", unique = false, nullable = false, insertable = true, updatable = true, length = 7)
	public java.util.Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}
	
	public void setLastUpdateTime(java.util.Date value) {
		this.lastUpdateTime = value;
	}
	
	@Column(name = "IS_HELD", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
	public java.lang.String getIsHeld() {
		return this.isHeld;
	}
	
	public void setIsHeld(java.lang.String value) {
		this.isHeld = value;
	}
	

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("InquiryId",getInquiryId())
			.append("ContentId",getContentId())
			.append("ExtBuyerId",getExtBuyerId())
			.append("ExtContactId",getExtContactId())
			.append("CompId",getCompId())
			.append("ContactId",getContactId())
			.append("OrgType",getOrgType())
			.append("InquiryType",getInquiryType())
			.append("InquiryTime",getInquiryTime())
			.append("LastThreadTime",getLastThreadTime())
			.append("RecipientTotal",getRecipientTotal())
			.append("Deleted",getDeleted())
			.append("Deadline",getDeadline())
			.append("Cc",getCc())
			.append("SendCopy",getSendCopy())
			.append("ExpectQtyVol",getExpectQtyVol())
			.append("Requests",getRequests())
			.append("CreateBy",getCreateBy())
			.append("CreateTime",getCreateTime())
			.append("LastUpdateBy",getLastUpdateBy())
			.append("LastUpdateTime",getLastUpdateTime())
			.append("IsHeld",getIsHeld())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getInquiryId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Im$inquiries == false) return false;
		if(this == obj) return true;
		Im$inquiries other = (Im$inquiries)obj;
		return new EqualsBuilder()
			.append(getInquiryId(),other.getInquiryId())
			.isEquals();
	}
}

