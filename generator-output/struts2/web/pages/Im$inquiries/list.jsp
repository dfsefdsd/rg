<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title><%=Im$inquiries.TABLE_ALIAS%> 维护</title>
	
	<link href="<c:url value="/widgets/simpletable/simpletable.css"/>" type="text/css" rel="stylesheet">
	<script type="text/javascript" src="<c:url value="/widgets/simpletable/simpletable.js"/>"></script>
	
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm',${page.thisPageNumber},${page.pageSize},'${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="/pages/Im$inquiries/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel"><%=Im$inquiries.ALIAS_CONTENT_ID%></td>		
					<td>
						<input value="${query.contentId}" id="contentId" name="contentId" maxlength="14"  class="validate-integer "/>
					</td>
					<td class="tdLabel"><%=Im$inquiries.ALIAS_EXT_BUYER_ID%></td>		
					<td>
						<input value="${query.extBuyerId}" id="extBuyerId" name="extBuyerId" maxlength="10"  class="validate-integer "/>
					</td>
					<td class="tdLabel"><%=Im$inquiries.ALIAS_EXT_CONTACT_ID%></td>		
					<td>
						<input value="${query.extContactId}" id="extContactId" name="extContactId" maxlength="10"  class="validate-integer "/>
					</td>
					<td class="tdLabel"><%=Im$inquiries.ALIAS_COMP_ID%></td>		
					<td>
						<input value="${query.compId}" id="compId" name="compId" maxlength="10"  class="validate-integer "/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel"><%=Im$inquiries.ALIAS_CONTACT_ID%></td>		
					<td>
						<input value="${query.contactId}" id="contactId" name="contactId" maxlength="10"  class="validate-integer "/>
					</td>
					<td class="tdLabel"><%=Im$inquiries.ALIAS_ORG_TYPE%></td>		
					<td>
						<input value="${query.orgType}" id="orgType" name="orgType" maxlength="1"  class=""/>
					</td>
					<td class="tdLabel"><%=Im$inquiries.ALIAS_INQUIRY_TYPE%></td>		
					<td>
						<input value="${query.inquiryType}" id="inquiryType" name="inquiryType" maxlength="2"  class=""/>
					</td>
					<td class="tdLabel"><%=Im$inquiries.ALIAS_INQUIRY_TIME%></td>		
					<td>
						<input value="<fmt:formatDate value='${query.inquiryTimeBegin}' pattern='<%=Im$inquiries.FORMAT_INQUIRY_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_INQUIRY_TIME%>'})" id="inquiryTimeBegin" name="inquiryTimeBegin"   />
						<input value="<fmt:formatDate value='${query.inquiryTimeEnd}' pattern='<%=Im$inquiries.FORMAT_INQUIRY_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_INQUIRY_TIME%>'})" id="inquiryTimeEnd" name="inquiryTimeEnd"   />
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel"><%=Im$inquiries.ALIAS_LAST_THREAD_TIME%></td>		
					<td>
						<input value="<fmt:formatDate value='${query.lastThreadTimeBegin}' pattern='<%=Im$inquiries.FORMAT_LAST_THREAD_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_LAST_THREAD_TIME%>'})" id="lastThreadTimeBegin" name="lastThreadTimeBegin"   />
						<input value="<fmt:formatDate value='${query.lastThreadTimeEnd}' pattern='<%=Im$inquiries.FORMAT_LAST_THREAD_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_LAST_THREAD_TIME%>'})" id="lastThreadTimeEnd" name="lastThreadTimeEnd"   />
					</td>
					<td class="tdLabel"><%=Im$inquiries.ALIAS_RECIPIENT_TOTAL%></td>		
					<td>
						<input value="${query.recipientTotal}" id="recipientTotal" name="recipientTotal" maxlength="4"  class="validate-integer max-value-2147483647"/>
					</td>
					<td class="tdLabel"><%=Im$inquiries.ALIAS_DELETED%></td>		
					<td>
						<input value="${query.deleted}" id="deleted" name="deleted" maxlength="1"  class=""/>
					</td>
					<td class="tdLabel"><%=Im$inquiries.ALIAS_DEADLINE%></td>		
					<td>
						<input value="${query.deadline}" id="deadline" name="deadline" maxlength="2"  class="validate-integer max-value-2147483647"/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel"><%=Im$inquiries.ALIAS_CC%></td>		
					<td>
						<input value="${query.cc}" id="cc" name="cc" maxlength="50"  class=""/>
					</td>
					<td class="tdLabel"><%=Im$inquiries.ALIAS_SEND_COPY%></td>		
					<td>
						<input value="${query.sendCopy}" id="sendCopy" name="sendCopy" maxlength="1"  class=""/>
					</td>
					<td class="tdLabel"><%=Im$inquiries.ALIAS_EXPECT_QTY_VOL%></td>		
					<td>
						<input value="${query.expectQtyVol}" id="expectQtyVol" name="expectQtyVol" maxlength="20"  class=""/>
					</td>
					<td class="tdLabel"><%=Im$inquiries.ALIAS_REQUESTS%></td>		
					<td>
						<input value="${query.requests}" id="requests" name="requests" maxlength="20"  class=""/>
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel"><%=Im$inquiries.ALIAS_CREATE_BY%></td>		
					<td>
						<input value="${query.createBy}" id="createBy" name="createBy" maxlength="10"  class="validate-integer "/>
					</td>
					<td class="tdLabel"><%=Im$inquiries.ALIAS_CREATE_TIME%></td>		
					<td>
						<input value="<fmt:formatDate value='${query.createTimeBegin}' pattern='<%=Im$inquiries.FORMAT_CREATE_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_CREATE_TIME%>'})" id="createTimeBegin" name="createTimeBegin"   />
						<input value="<fmt:formatDate value='${query.createTimeEnd}' pattern='<%=Im$inquiries.FORMAT_CREATE_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_CREATE_TIME%>'})" id="createTimeEnd" name="createTimeEnd"   />
					</td>
					<td class="tdLabel"><%=Im$inquiries.ALIAS_LAST_UPDATE_BY%></td>		
					<td>
						<input value="${query.lastUpdateBy}" id="lastUpdateBy" name="lastUpdateBy" maxlength="10"  class="validate-integer "/>
					</td>
					<td class="tdLabel"><%=Im$inquiries.ALIAS_LAST_UPDATE_TIME%></td>		
					<td>
						<input value="<fmt:formatDate value='${query.lastUpdateTimeBegin}' pattern='<%=Im$inquiries.FORMAT_LAST_UPDATE_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_LAST_UPDATE_TIME%>'})" id="lastUpdateTimeBegin" name="lastUpdateTimeBegin"   />
						<input value="<fmt:formatDate value='${query.lastUpdateTimeEnd}' pattern='<%=Im$inquiries.FORMAT_LAST_UPDATE_TIME%>'/>" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_LAST_UPDATE_TIME%>'})" id="lastUpdateTimeEnd" name="lastUpdateTimeEnd"   />
					</td>
				</tr>	
				<tr>	
					<td class="tdLabel"><%=Im$inquiries.ALIAS_IS_HELD%></td>		
					<td>
						<input value="${query.isHeld}" id="isHeld" name="isHeld" maxlength="1"  class=""/>
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}/pages/Im$inquiries/list.do'"/>
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}/pages/Im$inquiries/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}/pages/Im$inquiries/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
		<simpletable:pageToolbar page="${page}">
		显示在这里是为了提示你如何自定义表头,可修改模板删除此行
		</simpletable:pageToolbar>
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="CONTENT_ID" ><%=Im$inquiries.ALIAS_CONTENT_ID%></th>
				<th sortColumn="EXT_BUYER_ID" ><%=Im$inquiries.ALIAS_EXT_BUYER_ID%></th>
				<th sortColumn="EXT_CONTACT_ID" ><%=Im$inquiries.ALIAS_EXT_CONTACT_ID%></th>
				<th sortColumn="COMP_ID" ><%=Im$inquiries.ALIAS_COMP_ID%></th>
				<th sortColumn="CONTACT_ID" ><%=Im$inquiries.ALIAS_CONTACT_ID%></th>
				<th sortColumn="ORG_TYPE" ><%=Im$inquiries.ALIAS_ORG_TYPE%></th>
				<th sortColumn="INQUIRY_TYPE" ><%=Im$inquiries.ALIAS_INQUIRY_TYPE%></th>
				<th sortColumn="INQUIRY_TIME" ><%=Im$inquiries.ALIAS_INQUIRY_TIME%></th>
				<th sortColumn="LAST_THREAD_TIME" ><%=Im$inquiries.ALIAS_LAST_THREAD_TIME%></th>
				<th sortColumn="RECIPIENT_TOTAL" ><%=Im$inquiries.ALIAS_RECIPIENT_TOTAL%></th>
				<th sortColumn="DELETED" ><%=Im$inquiries.ALIAS_DELETED%></th>
				<th sortColumn="DEADLINE" ><%=Im$inquiries.ALIAS_DEADLINE%></th>
				<th sortColumn="CC" ><%=Im$inquiries.ALIAS_CC%></th>
				<th sortColumn="SEND_COPY" ><%=Im$inquiries.ALIAS_SEND_COPY%></th>
				<th sortColumn="EXPECT_QTY_VOL" ><%=Im$inquiries.ALIAS_EXPECT_QTY_VOL%></th>
				<th sortColumn="REQUESTS" ><%=Im$inquiries.ALIAS_REQUESTS%></th>
				<th sortColumn="CREATE_BY" ><%=Im$inquiries.ALIAS_CREATE_BY%></th>
				<th sortColumn="CREATE_TIME" ><%=Im$inquiries.ALIAS_CREATE_TIME%></th>
				<th sortColumn="LAST_UPDATE_BY" ><%=Im$inquiries.ALIAS_LAST_UPDATE_BY%></th>
				<th sortColumn="LAST_UPDATE_TIME" ><%=Im$inquiries.ALIAS_LAST_UPDATE_TIME%></th>
				<th sortColumn="IS_HELD" ><%=Im$inquiries.ALIAS_IS_HELD%></th>
	
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="inquiryId=${item.inquiryId}&"></td>
				
				<td><c:out value='${item.contentId}'/>&nbsp;</td>
				<td><c:out value='${item.extBuyerId}'/>&nbsp;</td>
				<td><c:out value='${item.extContactId}'/>&nbsp;</td>
				<td><c:out value='${item.compId}'/>&nbsp;</td>
				<td><c:out value='${item.contactId}'/>&nbsp;</td>
				<td><c:out value='${item.orgType}'/>&nbsp;</td>
				<td><c:out value='${item.inquiryType}'/>&nbsp;</td>
				<td><c:out value='${item.inquiryTimeString}'/>&nbsp;</td>
				<td><c:out value='${item.lastThreadTimeString}'/>&nbsp;</td>
				<td><c:out value='${item.recipientTotal}'/>&nbsp;</td>
				<td><c:out value='${item.deleted}'/>&nbsp;</td>
				<td><c:out value='${item.deadline}'/>&nbsp;</td>
				<td><c:out value='${item.cc}'/>&nbsp;</td>
				<td><c:out value='${item.sendCopy}'/>&nbsp;</td>
				<td><c:out value='${item.expectQtyVol}'/>&nbsp;</td>
				<td><c:out value='${item.requests}'/>&nbsp;</td>
				<td><c:out value='${item.createBy}'/>&nbsp;</td>
				<td><c:out value='${item.createTimeString}'/>&nbsp;</td>
				<td><c:out value='${item.lastUpdateBy}'/>&nbsp;</td>
				<td><c:out value='${item.lastUpdateTimeString}'/>&nbsp;</td>
				<td><c:out value='${item.isHeld}'/>&nbsp;</td>
				<td>
					<a href="${ctx}/pages/Im$inquiries/show.do?inquiryId=${item.inquiryId}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}/pages/Im$inquiries/edit.do?inquiryId=${item.inquiryId}&">修改</a>
				</td>
			  </tr>
			  
		  	  </c:forEach>
		  </tbody>
		</table>
	
		<simpletable:pageToolbar page="${page}">
		显示在这里是为了提示你如何自定义表头,可修改模板删除此行
		</simpletable:pageToolbar>
	</div>
	</form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%@ include file="base.jsp" %>

