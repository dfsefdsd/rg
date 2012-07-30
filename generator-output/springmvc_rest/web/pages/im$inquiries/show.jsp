<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title><%=Im$inquiries.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form:form modelAttribute="im$inquiries"  >
		<input type="button" value="返回列表" onclick="window.location='${ctx}/im$inquiries'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="inquiryId" name="inquiryId" value="${im$inquiries.inquiryId}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_CONTENT_ID%></td>	
				<td><c:out value='${im$inquiries.contentId}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_EXT_BUYER_ID%></td>	
				<td><c:out value='${im$inquiries.extBuyerId}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_EXT_CONTACT_ID%></td>	
				<td><c:out value='${im$inquiries.extContactId}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_COMP_ID%></td>	
				<td><c:out value='${im$inquiries.compId}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_CONTACT_ID%></td>	
				<td><c:out value='${im$inquiries.contactId}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_ORG_TYPE%></td>	
				<td><c:out value='${im$inquiries.orgType}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_INQUIRY_TYPE%></td>	
				<td><c:out value='${im$inquiries.inquiryType}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_INQUIRY_TIME%></td>	
				<td><c:out value='${im$inquiries.inquiryTimeString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_LAST_THREAD_TIME%></td>	
				<td><c:out value='${im$inquiries.lastThreadTimeString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_RECIPIENT_TOTAL%></td>	
				<td><c:out value='${im$inquiries.recipientTotal}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_DELETED%></td>	
				<td><c:out value='${im$inquiries.deleted}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_DEADLINE%></td>	
				<td><c:out value='${im$inquiries.deadline}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_CC%></td>	
				<td><c:out value='${im$inquiries.cc}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_SEND_COPY%></td>	
				<td><c:out value='${im$inquiries.sendCopy}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_EXPECT_QTY_VOL%></td>	
				<td><c:out value='${im$inquiries.expectQtyVol}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_REQUESTS%></td>	
				<td><c:out value='${im$inquiries.requests}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_CREATE_BY%></td>	
				<td><c:out value='${im$inquiries.createBy}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_CREATE_TIME%></td>	
				<td><c:out value='${im$inquiries.createTimeString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_LAST_UPDATE_BY%></td>	
				<td><c:out value='${im$inquiries.lastUpdateBy}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_LAST_UPDATE_TIME%></td>	
				<td><c:out value='${im$inquiries.lastUpdateTimeString}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Im$inquiries.ALIAS_IS_HELD%></td>	
				<td><c:out value='${im$inquiries.isHeld}'/></td>
			</tr>
		</table>
	</form:form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%@ include file="base.jsp" %>