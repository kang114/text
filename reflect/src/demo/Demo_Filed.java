package demo;


import java.lang.reflect.Field;

public class Demo_Filed {
    public static void main(String[] args) throws NoSuchFieldException {
        //获取类字节码文件对象
        Class fa = Filed_a.class;
        //获取成员变量
        Field name1 = fa.getDeclaredField("name");
        //获取 注解 的对象
        Filed an = name1.getAnnotation(Filed.class);
        //获取 注解 值
        String name = an.value();

        //
        Filed_a f=new Filed_a();
           f.setName(name);
        System.out.println(f.getName());

    }
}
