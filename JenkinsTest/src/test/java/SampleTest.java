import org.testng.annotations.Test;

public class SampleTest {
    @Test
    public void test1(){
   Calculator cal = new Calculator();
   int result = cal.addition(10,20);
        System.out.println("result is: "+result);
    }

}
