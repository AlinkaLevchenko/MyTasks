package IntTests;

import org.testng.annotations.Test;

public class MethodIntBoolean {
    double age = 10.5;
    String name = "Alina" + " Is here";
    boolean yop = true;
int a = 10;
int b = 12;
    @Test
    public void doIt(){
        boolean yop = true;
        System.out.println(10==12);

    }

    @Test
    public void doItTo(){
        System.out.println(age);
        age = 20.5;
        System.out.println(age);
    }
}
