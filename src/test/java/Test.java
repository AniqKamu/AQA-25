import org.apache.commons.lang3.StringUtils;

public class Test {

    @org.testng.annotations.Test
    public void testTest() {
        String text = "Привет всем кто живет на луне!";

        String short10 = StringUtils.abbreviate(text, 10);
        String short20 = StringUtils.abbreviate(text, 20);

        System.out.println(short10);
        System.out.println(short20);
    }
}
