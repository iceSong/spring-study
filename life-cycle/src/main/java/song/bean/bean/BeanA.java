package song.bean.bean;

/**
 * TODO
 *
 * @author song@liu@ele.me
 * @date 2016-09-28 15:39
 */
public class BeanA {
    static{
        System.out.println("BeanA静态代码块");
    }

    {
        System.out.println("BeanA普通代码块，只在new的时候执行");
    }

    public void init(){
        System.out.println("BeanA这是init方法");
    }

    public BeanA(){
        System.out.println("BeanA这是构造方法");
    }

    public static void stati(){
        System.out.print("BeanA这是static方法");
    }
}
