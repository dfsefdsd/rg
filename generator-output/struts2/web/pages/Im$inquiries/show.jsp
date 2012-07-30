<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title><%=Im$inquiries.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<s:form action="/pages/Im$inquiries/list.do" method="get" theme="simple">
		<input type="button" value="返回列表" onclick="window.location='${ctx}/pages/Im$inquiries/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<s:hidden name="inquiryId" id="inquiryId" value="%{model.inquiryId}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_CONTENT_ID%></td>	
				<td><s:property value="%{model.contentId}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_EXT_BUYER_ID%></td>	
				<td><s:property value="%{model.extBuyerId}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_EXT_CONTACT_ID%></td>	
				<td><s:property value="%{model.extContactId}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_COMP_ID%></td>	
				<td><s:property value="%{model.compId}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_CONTACT_ID%></td>	
				<td><s:property value="%{model.contactId}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_ORG_TYPE%></td>	
				<td><s:property value="%{model.orgType}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_INQUIRY_TYPE%></td>	
				<td><s:property value="%{model.inquiryType}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_INQUIRY_TIME%></td>	
				<td><s:property value="%{model.inquiryTimeString}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_LAST_THREAD_TIME%></td>	
				<td><s:property value="%{model.lastThreadTimeString}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_RECIPIENT_TOTAL%></td>	
				<td><s:property value="%{model.recipientTotal}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_DELETED%></td>	
				<td><s:property value="%{model.deleted}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_DEADLINE%></td>	
				<td><s:property value="%{model.deadline}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_CC%></td>	
				<td><s:property value="%{model.cc}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_SEND_COPY%></td>	
				<td><s:property value="%{model.sendCopy}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_EXPECT_QTY_VOL%></td>	
				<td><s:property value="%{model.expectQtyVol}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_REQUESTS%></td>	
				<td><s:property value="%{model.requests}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_CREATE_BY%></td>	
				<td><s:property value="%{model.createBy}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_CREATE_TIME%></td>	
				<td><s:property value="%{model.createTimeString}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_LAST_UPDATE_BY%></td>	
				<td><s:property value="%{model.lastUpdateBy}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_LAST_UPDATE_TIME%></td>	
				<td><s:property value="%{model.lastUpdateTimeString}" /></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_IS_HELD%></td>	
				<td><s:property value="%{model.isHeld}" /></td>
			</tr>
		</table>
	</s:form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%@ include file="base.jsp" %>