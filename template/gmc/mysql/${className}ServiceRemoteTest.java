package finance.datainit.service;

<#assign className= table.className>    
<#assign classNameFirstLower= table.classNameFirstLower>   
import junit.framework.Assert;
import org.junit.Test;
import com.gm.soa.common.util.SoaBaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import finance.datainit.dao.BaseTest;


public class ${className}ServiceRemoteTest extends SoaBaseTest { 
    @Autowired
    private ${className}ServiceRemote ${classNameFirstLower}Service;
    /**
     * 新增记录
     */
	@Test
    public void testInit${className}()throws Exception{
 	
    	Long result=${classNameFirstLower}Service.batchAdd${className}(List<${classNameFirstLower}VO>);
    }

}