package IntTests;

import org.testng.annotations.Test;

public class MethodInt {
    int age;
   int weight;
   public MethodInt(int age , int weight){
       this.age = age;
       this.weight = weight;

   }

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
    public double multiply(int x, int y){
       return x*y;
    }
}