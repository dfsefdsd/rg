/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2012
 */

package com.company.project.dao;

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


import static cn.org.rapid_framework.util.ObjectUtils.*;
import org.springframework.stereotype.Repository;

@Repository
public class Im$inquiriesDao extends BaseHibernateDao<Im$inquiries,java.lang.Long>{

	public Class getEntityClass() {
		return Im$inquiries.class;
	}
	
	public Page findPage(Im$inquiriesQuery query) {
        //XsqlBuilder syntax,please see http://code.google.com/p/rapid-xsqlbuilder
        // [column]为字符串拼接, {column}为使用占位符. [column]为使用字符串拼接,如username='[username]',偷懒时可以使用字符串拼接 
        // [column] 为PageRequest的属性
		String sql = "select t from Im$inquiries t where 1=1 "
			  	+ "/~ and t.contentId = {contentId} ~/"
			  	+ "/~ and t.extBuyerId = {extBuyerId} ~/"
			  	+ "/~ and t.extContactId = {extContactId} ~/"
			  	+ "/~ and t.compId = {compId} ~/"
			  	+ "/~ and t.contactId = {contactId} ~/"
			  	+ "/~ and t.orgType = {orgType} ~/"
			  	+ "/~ and t.inquiryType = {inquiryType} ~/"
				+ "/~ and t.inquiryTime >= {inquiryTimeBegin} ~/"
				+ "/~ and t.inquiryTime <= {inquiryTimeEnd} ~/"
				+ "/~ and t.lastThreadTime >= {lastThreadTimeBegin} ~/"
				+ "/~ and t.lastThreadTime <= {lastThreadTimeEnd} ~/"
			  	+ "/~ and t.recipientTotal = {recipientTotal} ~/"
			  	+ "/~ and t.deleted = {deleted} ~/"
			  	+ "/~ and t.deadline = {deadline} ~/"
			  	+ "/~ and t.cc = {cc} ~/"
			  	+ "/~ and t.sendCopy = {sendCopy} ~/"
			  	+ "/~ and t.expectQtyVol = {expectQtyVol} ~/"
			  	+ "/~ and t.requests = {requests} ~/"
			  	+ "/~ and t.createBy = {createBy} ~/"
				+ "/~ and t.createTime >= {createTimeBegin} ~/"
				+ "/~ and t.createTime <= {createTimeEnd} ~/"
			  	+ "/~ and t.lastUpdateBy = {lastUpdateBy} ~/"
				+ "/~ and t.lastUpdateTime >= {lastUpdateTimeBegin} ~/"
				+ "/~ and t.lastUpdateTime <= {lastUpdateTimeEnd} ~/"
			  	+ "/~ and t.isHeld = {isHeld} ~/"
				+ "/~ order by [sortColumns] ~/";

        //生成sql2的原因是为了不喜欢使用xsqlbuilder的同学，请修改生成器模板，删除本段的生成
        StringBuilder sql2 = new StringBuilder("select t from Im$inquiries t where 1=1 ");
        if(isNotEmpty(query.getInquiryId())) {
            sql2.append(" and  t.inquiryId = :inquiryId ");
        }
        if(isNotEmpty(query.getContentId())) {
            sql2.append(" and  t.contentId = :contentId ");
        }
        if(isNotEmpty(query.getExtBuyerId())) {
            sql2.append(" and  t.extBuyerId = :extBuyerId ");
        }
        if(isNotEmpty(query.getExtContactId())) {
            sql2.append(" and  t.extContactId = :extContactId ");
        }
        if(isNotEmpty(query.getCompId())) {
            sql2.append(" and  t.compId = :compId ");
        }
        if(isNotEmpty(query.getContactId())) {
            sql2.append(" and  t.contactId = :contactId ");
        }
        if(isNotEmpty(query.getOrgType())) {
            sql2.append(" and  t.orgType = :orgType ");
        }
        if(isNotEmpty(query.getInquiryType())) {
            sql2.append(" and  t.inquiryType = :inquiryType ");
        }
        if(isNotEmpty(query.getInquiryTimeBegin())) {
            sql2.append(" and  t.inquiryTime >= :inquiryTimeBegin ");
        }
        if(isNotEmpty(query.getInquiryTimeEnd())) {
            sql2.append(" and  t.inquiryTime <= :inquiryTimeEnd ");
        }
        if(isNotEmpty(query.getLastThreadTimeBegin())) {
            sql2.append(" and  t.lastThreadTime >= :lastThreadTimeBegin ");
        }
        if(isNotEmpty(query.getLastThreadTimeEnd())) {
            sql2.append(" and  t.lastThreadTime <= :lastThreadTimeEnd ");
        }
        if(isNotEmpty(query.getRecipientTotal())) {
            sql2.append(" and  t.recipientTotal = :recipientTotal ");
        }
        if(isNotEmpty(query.getDeleted())) {
            sql2.append(" and  t.deleted = :deleted ");
        }
        if(isNotEmpty(query.getDeadline())) {
            sql2.append(" and  t.deadline = :deadline ");
        }
        if(isNotEmpty(query.getCc())) {
            sql2.append(" and  t.cc = :cc ");
        }
        if(isNotEmpty(query.getSendCopy())) {
            sql2.append(" and  t.sendCopy = :sendCopy ");
        }
        if(isNotEmpty(query.getExpectQtyVol())) {
            sql2.append(" and  t.expectQtyVol = :expectQtyVol ");
        }
        if(isNotEmpty(query.getRequests())) {
            sql2.append(" and  t.requests = :requests ");
        }
        if(isNotEmpty(query.getCreateBy())) {
            sql2.append(" and  t.createBy = :createBy ");
        }
        if(isNotEmpty(query.getCreateTimeBegin())) {
            sql2.append(" and  t.createTime >= :createTimeBegin ");
        }
        if(isNotEmpty(query.getCreateTimeEnd())) {
            sql2.append(" and  t.createTime <= :createTimeEnd ");
        }
        if(isNotEmpty(query.getLastUpdateBy())) {
            sql2.append(" and  t.lastUpdateBy = :lastUpdateBy ");
        }
        if(isNotEmpty(query.getLastUpdateTimeBegin())) {
            sql2.append(" and  t.lastUpdateTime >= :lastUpdateTimeBegin ");
        }
        if(isNotEmpty(query.getLastUpdateTimeEnd())) {
            sql2.append(" and  t.lastUpdateTime <= :lastUpdateTimeEnd ");
        }
        if(isNotEmpty(query.getIsHeld())) {
            sql2.append(" and  t.isHeld = :isHeld ");
        }
        if(isNotEmpty(query.getSortColumns())) {
            sql2.append(" order by :sortColumns ");
        }	
        
		return pageQuery(sql,query);
	}
	

}
