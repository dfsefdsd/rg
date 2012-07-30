<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<s:hidden id="inquiryId" name="inquiryId" />

<!-- ONGL access static field: @package.class@field or @vs@field -->
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_CONTENT_ID}" key="contentId" value="%{model.contentId}" cssClass="required validate-integer " required="true" />
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_EXT_BUYER_ID}" key="extBuyerId" value="%{model.extBuyerId}" cssClass="validate-integer " required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_EXT_CONTACT_ID}" key="extContactId" value="%{model.extContactId}" cssClass="validate-integer " required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_COMP_ID}" key="compId" value="%{model.compId}" cssClass="validate-integer " required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_CONTACT_ID}" key="contactId" value="%{model.contactId}" cssClass="validate-integer " required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_ORG_TYPE}" key="orgType" value="%{model.orgType}" cssClass="required " required="true" />
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_INQUIRY_TYPE}" key="inquiryType" value="%{model.inquiryType}" cssClass="required " required="true" />
	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_INQUIRY_TIME%>:
		</td>	
		<td>
		<input value="${model.inquiryTimeString}" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_INQUIRY_TIME%>'})" id="inquiryTimeString" name="inquiryTimeString"  maxlength="0" class="required " />
		</td>
	</tr>
	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_LAST_THREAD_TIME%>:
		</td>	
		<td>
		<input value="${model.lastThreadTimeString}" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_LAST_THREAD_TIME%>'})" id="lastThreadTimeString" name="lastThreadTimeString"  maxlength="0" class="required " />
		</td>
	</tr>
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_RECIPIENT_TOTAL}" key="recipientTotal" value="%{model.recipientTotal}" cssClass="required validate-integer max-value-2147483647" required="true" />
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_DELETED}" key="deleted" value="%{model.deleted}" cssClass="required " required="true" />
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_DEADLINE}" key="deadline" value="%{model.deadline}" cssClass="required validate-integer max-value-2147483647" required="true" />
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_CC}" key="cc" value="%{model.cc}" cssClass="" required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_SEND_COPY}" key="sendCopy" value="%{model.sendCopy}" cssClass="required " required="true" />
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_EXPECT_QTY_VOL}" key="expectQtyVol" value="%{model.expectQtyVol}" cssClass="" required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_REQUESTS}" key="requests" value="%{model.requests}" cssClass="" required="false" />
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_CREATE_BY}" key="createBy" value="%{model.createBy}" cssClass="required validate-integer " required="true" />
	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_CREATE_TIME%>:
		</td>	
		<td>
		<input value="${model.createTimeString}" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_CREATE_TIME%>'})" id="createTimeString" name="createTimeString"  maxlength="0" class="required " />
		</td>
	</tr>
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_LAST_UPDATE_BY}" key="lastUpdateBy" value="%{model.lastUpdateBy}" cssClass="required validate-integer " required="true" />
	
	
	<tr>	
		<td class="tdLabel">
			<span class="required">*</span><%=Im$inquiries.ALIAS_LAST_UPDATE_TIME%>:
		</td>	
		<td>
		<input value="${model.lastUpdateTimeString}" onclick="WdatePicker({dateFmt:'<%=Im$inquiries.FORMAT_LAST_UPDATE_TIME%>'})" id="lastUpdateTimeString" name="lastUpdateTimeString"  maxlength="0" class="required " />
		</td>
	</tr>
	
	
	<s:textfield label="%{@com.company.project.model.Im$inquiries@ALIAS_IS_HELD}" key="isHeld" value="%{model.isHeld}" cssClass="required " required="true" />
	
