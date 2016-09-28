package song.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import song.bean.bean.BeanA;

/**
 * TODO
 *
 * @author song@liu@ele.me
 * @date 2016-09-28 15:43
 */
public class Appliction {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        BeanA ba = (BeanA)context.getBean("instance");
    }
}
