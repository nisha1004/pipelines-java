import com.microsoft.demo.Demo;
import org.junit.Test;

public class MyTest {
    @Test
    public void test_method_1() throws InterruptedException {
        Demo d = new Demo();
        d.LaunchBrowser();
        d.NavigateToApplication();
        d.EnterData();
        d.CloseDriver();
    }

    @Test
    public void test_method_2() {
    }
}
