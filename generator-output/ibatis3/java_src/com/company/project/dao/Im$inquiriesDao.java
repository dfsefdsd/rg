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


import org.springframework.stereotype.Repository;


@Repository
public class Im$inquiriesDao extends BaseIbatis3Dao<Im$inquiries,java.lang.Long>{
	
	@Override
	public String getIbatisMapperNamesapce() {
		return "Im$inquiries";
	}
	
	public void saveOrUpdate(Im$inquiries entity) {
		if(entity.getInquiryId() == null) 
			save(entity);
		else 
			update(entity);
	}
	
	public Page findPage(Im$inquiriesQuery query) {
		return pageQuery("Im$inquiries.findPage",query);
	}
	

}
