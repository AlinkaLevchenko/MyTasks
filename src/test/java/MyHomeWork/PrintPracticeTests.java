package MyHomeWork;

import IntTests.MethodInt;
import org.testng.annotations.Test;

public class PrintPracticeTests {
    @Test
    public void printToConsole(){
    MethodInt NewProject1 = new MethodInt(30,70);
//    System.out.println(NewProject1);
    System.out.println(NewProject1.summ(9, 5));
        System.out.println(NewProject1.multiply(7,9));
        NewProject1.run();

    }
}
