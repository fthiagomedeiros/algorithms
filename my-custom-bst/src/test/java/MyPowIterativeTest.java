import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyPowIterativeTest {

    @Test
    void myPow() {
        MyPowIterative m = new MyPowIterative();
        double result = m.myPow(2, 1);
        assertEquals(2.0, result);
    }

    @Test
    void myPow23() {
        MyPowIterative m = new MyPowIterative();
        double result = m.myPow(2, 3);
        assertEquals(8.0, result);
    }

    @Test
    void myPow210() {
        MyPowIterative m = new MyPowIterative();
        double result = m.myPow(2, 10);
        assertEquals(1024.0, result);
    }

    @Test
    void myPowSmallNumber() {
        MyPowIterative m = new MyPowIterative();
        double result = m.myPow(0.44528, 0);
        assertEquals(1, result);
    }


    @Test
    void myPow2negative2() {
        MyPowIterative m = new MyPowIterative();
        double result = m.myPow(2, -2);
        assertEquals(0.25, result);
    }

    @Test
    void myPow2negativeSmallNumberExponentBigger() {
        MyPowIterative m = new MyPowIterative();
        double result = m.myPow(0.00001, 2147483647);
        assertEquals(0, result);
    }

    @Test
    void bigNumber() {
        MyPowIterative m = new MyPowIterative();
        double result = m.myPow(2, -2147483648);
        assertEquals(0, result);
    }

    @Test
    void bigNumber10000000001() {
        MyPowChatGPT m = new MyPowChatGPT();
        double result = m.myPow(1.0000000000001, -2147483648);
        assertEquals(0.99979, result);
    }
}