package Testrunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.TestOperation;
 
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestOperation.class);
 
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}