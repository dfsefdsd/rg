package com.gm.soa.vo.inquiry;
INSERT IN 
if(vo.getMessageId()!=null && !"".equals(vo.getMessageId())){
	sql.append(" AND img.message_id=:messageId ");
	paramMap.put("messageId", vo.getMessageId());
}
if(vo.getEntityType()!=null && !"".equals(vo.getEntityType())){
	sql.append(" AND img.entity_type=:entityType ");
	paramMap.put("entityType", vo.getEntityType());
}
if(vo.getEntityId()!=null && !"".equals(vo.getEntityId())){
	sql.append(" AND img.entity_id=:entityId ");
	paramMap.put("entityId", vo.getEntityId());
}
if(vo.getMessageType()!=null && !"".equals(vo.getMessageType())){
	sql.append(" AND img.message_type=:messageType ");
	paramMap.put("messageType", vo.getMessageType());
}
if(vo.getMessageSource()!=null && !"".equals(vo.getMessageSource())){
	sql.append(" AND img.message_source=:messageSource ");
	paramMap.put("messageSource", vo.getMessageSource());
}
if(vo.getContentId()!=null && !"".equals(vo.getContentId())){
	sql.append(" AND img.content_id=:contentId ");
	paramMap.put("contentId", vo.getContentId());
}
if(vo.getOrgType()!=null && !"".equals(vo.getOrgType())){
	sql.append(" AND img.org_type=:orgType ");
	paramMap.put("orgType", vo.getOrgType());
}
if(vo.getCompId()!=null && !"".equals(vo.getCompId())){
	sql.append(" AND img.comp_id=:compId ");
	paramMap.put("compId", vo.getCompId());
}
if(vo.getContactId()!=null && !"".equals(vo.getContactId())){
	sql.append(" AND img.contact_id=:contactId ");
	paramMap.put("contactId", vo.getContactId());
}
if(vo.getOppOrgType()!=null && !"".equals(vo.getOppOrgType())){
	sql.append(" AND img.opp_org_type=:oppOrgType ");
	paramMap.put("oppOrgType", vo.getOppOrgType());
}
if(vo.getOppCompId()!=null && !"".equals(vo.getOppCompId())){
	sql.append(" AND img.opp_comp_id=:oppCompId ");
	paramMap.put("oppCompId", vo.getOppCompId());
}
if(vo.getOppContactId()!=null && !"".equals(vo.getOppContactId())){
	sql.append(" AND img.opp_contact_id=:oppContactId ");
	paramMap.put("oppContactId", vo.getOppContactId());
}
if(vo.getLabel()!=null && !"".equals(vo.getLabel())){
	sql.append(" AND img.label=:label ");
	paramMap.put("label", vo.getLabel());
}
if(vo.getPreviousLabel()!=null && !"".equals(vo.getPreviousLabel())){
	sql.append(" AND img.previous_label=:previousLabel ");
	paramMap.put("previousLabel", vo.getPreviousLabel());
}
if(vo.getRead()!=null && !"".equals(vo.getRead())){
	sql.append(" AND img.read=:read ");
	paramMap.put("read", vo.getRead());
}
if(vo.getDegree()!=null && !"".equals(vo.getDegree())){
	sql.append(" AND img.degree=:degree ");
	paramMap.put("degree", vo.getDegree());
}
if(vo.getSubject()!=null && !"".equals(vo.getSubject())){
	sql.append(" AND img.subject=:subject ");
	paramMap.put("subject", vo.getSubject());
}
if(vo.getAttachment()!=null && !"".equals(vo.getAttachment())){
	sql.append(" AND img.attachment=:attachment ");
	paramMap.put("attachment", vo.getAttachment());
}
if(vo.getSendCountryId()!=null && !"".equals(vo.getSendCountryId())){
	sql.append(" AND img.send_country_id=:sendCountryId ");
	paramMap.put("sendCountryId", vo.getSendCountryId());
}
if(vo.getSendIp()!=null && !"".equals(vo.getSendIp())){
	sql.append(" AND img.send_ip=:sendIp ");
	paramMap.put("sendIp", vo.getSendIp());
}
if(vo.getSendCc()!=null && !"".equals(vo.getSendCc())){
	sql.append(" AND img.send_cc=:sendCc ");
	paramMap.put("sendCc", vo.getSendCc());
}
if(vo.getDeadLine()!=null && !"".equals(vo.getDeadLine())){
	sql.append(" AND img.dead_line=:deadLine ");
	paramMap.put("deadLine", vo.getDeadLine());
}
if(vo.getCreateBy()!=null && !"".equals(vo.getCreateBy())){
	sql.append(" AND img.create_by=:createBy ");
	paramMap.put("createBy", vo.getCreateBy());
}
if(vo.getCreateTime()!=null && !"".equals(vo.getCreateTime())){
	sql.append(" AND img.create_time=:createTime ");
	paramMap.put("createTime", vo.getCreateTime());
}
if(vo.getLastUpdateBy()!=null && !"".equals(vo.getLastUpdateBy())){
	sql.append(" AND img.last_update_by=:lastUpdateBy ");
	paramMap.put("lastUpdateBy", vo.getLastUpdateBy());
}
if(vo.getLastUpdateTime()!=null && !"".equals(vo.getLastUpdateTime())){
	sql.append(" AND img.last_update_time=:lastUpdateTime ");
	paramMap.put("lastUpdateTime", vo.getLastUpdateTime());
}





























message_id,
entity_type,
entity_id,
message_type,
message_source,
content_id,
org_type,
comp_id,
contact_id,
opp_org_type,
opp_comp_id,
opp_contact_id,
label,
previous_label,
read,
degree,
subject,
attachment,
send_country_id,
send_ip,
send_cc,
dead_line,
create_by,
create_time,
last_update_by,
last_update_time,

:messageId,
:entityType,
:entityId,
:messageType,
:messageSource,
:contentId,
:orgType,
:compId,
:contactId,
:oppOrgType,
:oppCompId,
:oppContactId,
:label,
:previousLabel,
:read,
:degree,
:subject,
:attachment,
:sendCountryId,
:sendIp,
:sendCc,
:deadLine,
:createBy,
:createTime,
:lastUpdateBy,
:lastUpdateTime,
