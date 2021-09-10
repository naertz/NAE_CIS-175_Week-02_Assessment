/**
 * @author NAE (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Sep 9, 2021
 */

package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(AllShapeTests.class);
        
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        
        System.out.println(result.wasSuccessful());
    }
}
