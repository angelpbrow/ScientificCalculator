package com.zipcodewilmington.scientificcalculator;
import junit.framework.TestCase;
import org.junit.Test;

 public class MainApplicationTest extends TestCase {

   Creating test to check basic operations
   @Test
   public void basicTest(){
        MainApplication operation = new MainApplication();
        int ActualResult = MainApplication.main();
        assertEquals("8","8");

    }
}
