package springboot.demo.constant;

import java.util.ArrayList;
import java.util.List;

public class DataSourceConstant {
    public static final int TX_METHOD_TIMEOUT = 5;
    public static final String AOP_POINTCUT_EXPRESSION = "execution (* springboot.demo..service.*Service.*(..))";
    public static final List<String> REQUIRED_TX_METHOD_PERFIX = new ArrayList<String>();
    public static final List<String> SUPPORTS_TX_METHOD_PERFIX = new ArrayList<String>();
    
    static{
        REQUIRED_TX_METHOD_PERFIX.add("add*");
        REQUIRED_TX_METHOD_PERFIX.add("insert*");
        REQUIRED_TX_METHOD_PERFIX.add("save*");
        REQUIRED_TX_METHOD_PERFIX.add("update*");
        REQUIRED_TX_METHOD_PERFIX.add("modify*");
        REQUIRED_TX_METHOD_PERFIX.add("edit*");
        REQUIRED_TX_METHOD_PERFIX.add("delete*");
        REQUIRED_TX_METHOD_PERFIX.add("remove*");
        
        SUPPORTS_TX_METHOD_PERFIX.add("get*");
        SUPPORTS_TX_METHOD_PERFIX.add("find*");
        SUPPORTS_TX_METHOD_PERFIX.add("load*");
        SUPPORTS_TX_METHOD_PERFIX.add("search*");
        SUPPORTS_TX_METHOD_PERFIX.add("query*");
        SUPPORTS_TX_METHOD_PERFIX.add("*");
    }
}
