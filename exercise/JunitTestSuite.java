package exercise;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import exercise.ex2.CircleTest;

import exercise.ex3.EmployeeTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   CircleTest.class,
   EmployeeTest.class
})

public class JunitTestSuite {   
}  