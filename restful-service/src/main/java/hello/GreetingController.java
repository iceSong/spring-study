package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.atomic.AtomicLong;

/**
 * This code uses Spring 4’s new @RestController annotation,
 * which marks the class as a controller where every method
 * returns a domain object instead of a view. It’s shorthand
 * for @Controller and @ResponseBody rolled together.
 *
 * @author song@liu@ele.me
 * @version 0.01
 * @date 2016-07-15 16:44
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private String sql = "select * from t_user where name=? and password=? limit 1";

    /**
     * requestMapping默认接受所有http请求, 使用method=GET来限制
     *
     * @param name
     * @return
     */
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "pwd") String pwd) {
        //PreparedStatement statement = DbFactory.prepareStatement(sql);
        Statement statement = DbFactory.getStatement();
        try {
            String s = "select * from t_user where name='%s' and password='%s' limit 1";
            //statement.setString(1, name);
            //statement.setString(2, pwd);
            System.out.println(String.format(s, name, pwd));
            //ResultSet rs = statement.executeQuery();
            ResultSet rs = statement.executeQuery(String.format(s, name, pwd));


            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
