package junit.sample;

import static org.junit.Assume.*;

import org.junit.jupiter.api.Test;

public class OsTest {

	@Test
	public void winTest() {
		assumeTrue(System.getProperty("os.name").contains("Windows"));
		System.out.println("このテストはWindows環境で実行されます");
	}

	@Test
	public void macTest() {
		assumeTrue(System.getProperty("os.name").contains("Mac"));
		System.out.println("このテストはMac OS環境で実行されます");
	}

	@Test
	public void linuxTest() {
		assumeTrue(System.getProperty("os.name").contains("Linax"));
		System.out.println("このテストはLinux環境で実行されます");
	}
}
