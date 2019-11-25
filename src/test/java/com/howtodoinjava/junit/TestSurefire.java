/**
 * 
 */
package com.howtodoinjava.junit;

import org.testng.annotations.Test;

/**
 * @author prosannam
 *
 */
public class TestSurefire {

	@Test
    public void testcaseFirst()
    {
        System.out.println("First testcase executed");
    }
 
    @Test
    public void testcaseSecond()
    {
        System.out.println("Second testcase executed");
    }
 
    @Test
    public void testcaseThird()
    {
        System.out.println("Third testcase executed");
    }
 
    @Test
    public void otherTestcase()
    {
        System.out.println("Another testcase executed");
    }
}
