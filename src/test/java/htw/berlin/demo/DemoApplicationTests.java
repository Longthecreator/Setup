package htw.berlin.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void checkGreetings() {
		DemoApplication d1 = new DemoApplication();
		d1.greetings();
		assertEquals("Hello world!", d1.greetings());
	}

}
