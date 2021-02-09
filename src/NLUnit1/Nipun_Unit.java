package NLUnit1;

import java.util.LinkedList;
import java.util.List;

import org.apache.logging.log4j.*;

import Nipun_unitDemo1.TestSimple;

public class Nipun_Unit {
  private static List<String> checks;
  private static int checksMade = 0;
  private static int passedChecks = 0;
  private static int failedChecks = 0;

  private static void addToReport(String txt) {
    if (checks == null) {
      checks = new LinkedList<String>();
    }
    checks.add(String.format("%04d: %s", checksMade++, txt));
  }
  
  public static void checkEquals(double value1, double value2) {
    if (value1 == value2) {
      addToReport(String.format("  %.2f == %.2f", value1, value2));
      passedChecks++;
    } else {
      addToReport(String.format("* %.2f == %.2f", value1, value2));
      failedChecks++;
    }
  }
  
  public static void checkDivisibleInts(double value1, double value2) {
	int val1 = (int) value1;
	int val2 = (int) value2;
	try {
		if (val1 % val2 == 0) {
	      addToReport(String.format("  %d / %d is equal to 0", val1, val2));
	      passedChecks++;
	    } else {
	      addToReport(String.format("* %d / %d is equal to 0", val1, val2));
	      failedChecks++;
	    }
	} catch (ArithmeticException e) {
		System.out.println("Cannot divide by zero\n");
	}
  }

  public static void checkNotEquals(double value1, double value2) {
    if (value1 != value2) {
      addToReport(String.format("  %.2f != %.2f", value1, value2));
      passedChecks++;
    } else {
      addToReport(String.format("* %.2f != %.2f", value1, value2));
      failedChecks++;
    }
  }

  public static void report() {
	  Logger logger = LogManager.getLogger(Nipun_Unit.class);
	  logger.info(passedChecks + " checks passed");
	  logger.warn(failedChecks + " checks falied");
	  
	  System.out.println();
    System.out.printf("%d checks passed\n", passedChecks);
    System.out.printf("%d checks failed\n", failedChecks);
    System.out.println();
    
    for (String check : checks) {
    	logger.info(check);
    }
  }
}
