package hello;

/**
 * TODO
 *
 * @author song@liu@ele.me
 * @version 0.01
 * @date 2016-07-15 16:42
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
