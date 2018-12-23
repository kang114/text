import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflect {
    public static void main(String[] args) throws Exception {
//        1.获取反射类加载器   获取配置文件加载对象
       /* ClassLoader cld  = Reflect.class.getClassLoader();
        InputStream is = cld.getResourceAsStream("pro.properties");*/

        InputStream is = Reflect.class.getClassLoader().getResourceAsStream("pro.properties");
        Properties pp = new Properties();
        pp.load(is);


        //2.获取配置文件信息
        String className = pp.getProperty("className");
        String classMothed = pp.getProperty("classMothed");

        //3.加载类进内存
       // Class.forName("com.it.People");

        Class cs = Class.forName(className);
        //4.创建 类对象
        Object obj = cs.newInstance();

        //5.获取 类方法
        Method method = cs.getMethod(classMothed);

        System.out.println(method.getName());
        //6.调用方法
        method.invoke(obj);
    }

}
