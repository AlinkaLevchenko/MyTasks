package MyHomeWork.LessonOne;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathOperation {

    public int summ(int a, int b) {
        return a + b;

    }

    public int Mult(int a, int b) {
        return a * b;
    }


    @Test
    public void chekSusumm() {
        // summ(4,5) == 9 expected 9
        Assert.assertTrue(summ(4, 5) == 9);
        // summ(6,5) == 10 expected 11
        Assert.assertTrue(summ(6, 5) == 11);
        // summ(10,5) == 15 expected 15
        Assert.assertTrue(summ(10, 5) == 15);

    }

    @Test
    public void chekMult() {
        Assert.assertTrue(Mult(2, 5) == 10);
        Assert.assertTrue(Mult(5, 5) == 25);
        Assert.assertTrue(Mult(2, 10) == 20);

    }
}

//    public int summ(int a, int b) {
//        return a + b;
//
//    }
//
//    public int Mult(int a, int b) {
//        return a * b;
//    }
//}

