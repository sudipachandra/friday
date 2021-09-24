import org.testng.annotations.Test;

public class SampleTest {
    @Test
    public void test1(){
   Calculator cal = new Calculator();
   int result = cal.addition(10,20);
        System.out.println("result of addition is : "+result);
    }
    @Test
    public void test2(){
        Calculator cal = new Calculator();
        int result = cal.divition(50,2);
        System.out.println("result of division is : "+result);
    }

}
