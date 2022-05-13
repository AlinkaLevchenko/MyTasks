package tests;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;

public class NewProject1 {
    int age = 35;
    Integer age1 = new Integer(45);

    @Test
    public void doIt() {
        int result = summ(50, 60);
        System.out.println(result + 5);
    }

    public void run() {
        System.out.println("running");
    }

    public int summ(int FirstWariable, int SecondWariable){
        return FirstWariable +SecondWariable;
    }
}