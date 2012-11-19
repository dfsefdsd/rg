package com.gm.soa.remote.${soaCorePackage};

<#assign className= table.className>    
<#assign classNameFirstLower= table.classNameFirstLower>  

import com.gm.soa.vo.buyinglead.PaginationCondition;
import com.gm.soa.common.vo.PaginationVO;
import com.gm.soa.common.SoaException;
import com.gm.soa.vo.${soaCorePackage}.${className}VO;

public interface ${className}ServiceRemote {
   
    /**
     * 根据id查询记录
     */
    public ${className}VO get${className}ById(long id,Long currentCompId,Long currentContactId,Long currentUserId)throws SoaException;
    
    /**
     * 查询记录
     */
    public PaginationVO<${className}VO> getPagination${className}ByParam(<#list table.queryColumns as column>${column.javaType} ${column.columnNameLower},</#list>PaginationCondition pc,Long currentCompId,Long currentContactId,Long currentUserId)throws SoaException;
    /**
     * 查询总数
     */
    public int getTotal${className}ByParam(<#list table.queryColumns as column>${column.javaType} ${column.columnNameLower},</#list>Long currentCompId,Long currentContactId,Long currentUserId)throws SoaException;
    
}