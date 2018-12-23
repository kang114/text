import java.lang.reflect.Field;

public class reflect_dome1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
      //new一个类对象
        People p = new People();
//       通过类对象 获取字节码对象
        Class cls= p.getClass();

//        Field[] dfs = cls.getDeclaredFields();
//        for (Field df : dfs) {
//            System.out.println(df);
//        }
            //通过类字节码对象获取 类的成员变量
        Field money = cls.getDeclaredField("money");
        //暴力反射
        money.setAccessible(true);
        //通过报暴力反射给 类对象 赋值
        money.set(p,699.0);
        //通过报暴力反射获取 类对象 的值
        Object o = money.get(p);
        System.out.println(o);

    }


}
