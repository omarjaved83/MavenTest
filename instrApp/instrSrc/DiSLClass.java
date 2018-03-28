import ch.usi.dag.disl.annotation.After;
import ch.usi.dag.disl.annotation.AfterReturning;
import ch.usi.dag.disl.annotation.Before;
import ch.usi.dag.disl.marker.BodyMarker;

public class DiSLClass {

	@Before(marker = BodyMarker.class, scope = "test.java.TestApp1.testPrintHelloWorld")
	public static void beforemain() {
		System.out.println("Instrumentation: Before method testPrintHelloWorld");
	}

}
