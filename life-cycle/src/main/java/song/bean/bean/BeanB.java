package song.bean.bean;

/**
 * TODO
 *
 * @author song@liu@ele.me
 * @date 2016-09-28 15:57
 */
public class BeanB extends BeanA{

    static{
        System.out.println("BeanB静态代码块");
    }

    {
        System.out.println("BeanB普通代码块");
    }

    public void init (){
        System.out.println("BeanB类init-method");
        super.init();
    }
}
