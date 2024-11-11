package common;

import org.dissanahmed.good.JavaAlwaysGood;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicLong;

import static org.junit.Assert.assertTrue;

public class TestAlwaysGood {



    public static AtomicLong atomicLong;
    @BeforeClass
    public static void setUpBeforeClass() {
        atomicLong = new AtomicLong(0);
    }


    @Test
    public void alwaysGoodTest() {
        long testValue = atomicLong.get();
        JavaAlwaysGood alwaysGood = new JavaAlwaysGood();
        assertTrue(alwaysGood.alwaysGood(testValue));
    }
}
