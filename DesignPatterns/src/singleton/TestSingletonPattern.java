package singleton;

import static org.junit.Assert.*;

import org.junit.*;
import main.SingletonClass;;

public class TestSingletonPattern {

	@Test
    public void TestSingletonInitialization() {
		// Check if these two are the same
		assertSame(SingletonClass.getInstance(), SingletonClass.getInstance());
    }
}