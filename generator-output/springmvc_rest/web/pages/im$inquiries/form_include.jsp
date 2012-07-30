<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="inquiryId" name="inquiryId" value="${im$inquiries.inquiryId}"/>

	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_CONTENT_ID%>:
		</td>		
		<td>
		<form:input path="contentId" id="contentId" cssClass="required validate-integer " maxlength="14" />
		<font color='red'><form:errors path="contentId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Im$inquiries.ALIAS_EXT_BUYER_ID%>:
		</td>		
		<td>
		<form:input path="extBuyerId" id="extBuyerId" cssClass="validate-integer " maxlength="10" />
		<font color='red'><form:errors path="extBuyerId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Im$inquiries.ALIAS_EXT_CONTACT_ID%>:
		</td>		
		<td>
		<form:input path="extContactId" id="extContactId" cssClass="validate-integer " maxlength="10" />
		<font color='red'><form:errors path="extContactId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Im$inquiries.ALIAS_COMP_ID%>:
		</td>		
		<td>
		<form:input path="compId" id="compId" cssClass="validate-integer " maxlength="10" />
		<font color='red'><form:errors path="compId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Im$inquiries.ALIAS_CONTACT_ID%>:
		</td>		
		<td>
		<form:input path="contactId" id="contactId" cssClass="validate-integer " maxlength="10" />
		<font color='red'><form:errors path="contactId"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_ORG_TYPE%>:
		</td>		
		<td>
		<form:input path="orgType" id="orgType" cssClass="required " maxlength="1" />
		<font color='red'><form:errors path="orgType"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_INQUIRY_TYPE%>:
		</td>		
		<td>
		<form:input path="inquiryType" id="inquiryType" cssClass="required " maxlength="2" />
		<font color='red'><form:errors path="inquiryType"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_INQUIRY_TIME%>:
		</td>		
		<td>
		<input value="${im$inquiries.inquiryTimeString}" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_INQUIRY_TIME%>'})" id="inquiryTimeString" name="inquiryTimeString"  maxlength="0" class="required " />
		<font color='red'><form:errors path="inquiryTime"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_LAST_THREAD_TIME%>:
		</td>		
		<td>
		<input value="${im$inquiries.lastThreadTimeString}" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_LAST_THREAD_TIME%>'})" id="lastThreadTimeString" name="lastThreadTimeString"  maxlength="0" class="required " />
		<font color='red'><form:errors path="lastThreadTime"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_RECIPIENT_TOTAL%>:
		</td>		
		<td>
		<form:input path="recipientTotal" id="recipientTotal" cssClass="required validate-integer max-value-2147483647" maxlength="4" />
		<font color='red'><form:errors path="recipientTotal"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_DELETED%>:
		</td>		
		<td>
		<form:input path="deleted" id="deleted" cssClass="required " maxlength="1" />
		<font color='red'><form:errors path="deleted"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_DEADLINE%>:
		</td>		
		<td>
		<form:input path="deadline" id="deadline" cssClass="required validate-integer max-value-2147483647" maxlength="2" />
		<font color='red'><form:errors path="deadline"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Im$inquiries.ALIAS_CC%>:
		</td>		
		<td>
		<form:input path="cc" id="cc" cssClass="" maxlength="50" />
		<font color='red'><form:errors path="cc"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_SEND_COPY%>:
		</td>		
		<td>
		<form:input path="sendCopy" id="sendCopy" cssClass="required " maxlength="1" />
		<font color='red'><form:errors path="sendCopy"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Im$inquiries.ALIAS_EXPECT_QTY_VOL%>:
		</td>		
		<td>
		<form:input path="expectQtyVol" id="expectQtyVol" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="expectQtyVol"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Im$inquiries.ALIAS_REQUESTS%>:
		</td>		
		<td>
		<form:input path="requests" id="requests" cssClass="" maxlength="20" />
		<font color='red'><form:errors path="requests"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_CREATE_BY%>:
		</td>		
		<td>
		<form:input path="createBy" id="createBy" cssClass="required validate-integer " maxlength="10" />
		<font color='red'><form:errors path="createBy"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_CREATE_TIME%>:
		</td>		
		<td>
		<input value="${im$inquiries.createTimeString}" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_CREATE_TIME%>'})" id="createTimeString" name="createTimeString"  maxlength="0" class="required " />
		<font color='red'><form:errors path="createTime"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_LAST_UPDATE_BY%>:
		</td>		
		<td>
		<form:input path="lastUpdateBy" id="lastUpdateBy" cssClass="required validate-integer " maxlength="10" />
		<font color='red'><form:errors path="lastUpdateBy"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_LAST_UPDATE_TIME%>:
		</td>		
		<td>
		<input value="${im$inquiries.lastUpdateTimeString}" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_LAST_UPDATE_TIME%>'})" id="lastUpdateTimeString" name="lastUpdateTimeString"  maxlength="0" class="required " />
		<font color='red'><form:errors path="lastUpdateTime"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_IS_HELD%>:
		</td>		
		<td>
		<form:input path="isHeld" id="isHeld" cssClass="required " maxlength="1" />
		<font color='red'><form:errors path="isHeld"/></font>
		</td>
	</tr>	
	
		