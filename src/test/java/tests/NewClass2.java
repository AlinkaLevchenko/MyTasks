package tests;

import org.testng.annotations.Test;

public class NewClass2 {
    @Test
    public void doIt(){
    NewProject1 NewProject1 = new NewProject1();
    System.out.println(NewProject1.age);
    System.out.println(NewProject1.summ(5, 5));
    }
}
