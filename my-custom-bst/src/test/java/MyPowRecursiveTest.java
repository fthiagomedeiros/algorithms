import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyPowRecursiveTest {

    @Test
    void myPow() {
        MyPowRecursive m = new MyPowRecursive();
        double result = m.myPow(2, 1);
        assertEquals(2.0, result);
    }

    @Test
    void myPow23() {
        MyPowRecursive m = new MyPowRecursive();
        double result = m.myPow(2, 3);
        assertEquals(8.0, result);
    }

    @Test
    void myPow210() {
        MyPowRecursive m = new MyPowRecursive();
        double result = m.myPow(2, 10);
        assertEquals(1024.0, result);
    }

    @Test
    void myPowSmallNumber() {
        MyPowRecursive m = new MyPowRecursive();
        double result = m.myPow(0.44528, 0);
        assertEquals(1, result);
    }


    @Test
    void myPow2negative2() {
        MyPowRecursive m = new MyPowRecursive();
        double result = m.myPow(2, -2);
        assertEquals(0.25, result);
    }

    @Test
    void myPow2negativeSmallNumberExponentBigger() {
        MyPowRecursive m = new MyPowRecursive();
        double result = m.myPow(0.00001, 2147483647);
        assertEquals(0.25, result);
    }
}