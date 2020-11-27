/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camsley.mavenjenkins.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camsl
 */
public class TriangleIT {
    
    public TriangleIT() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of triType method, of class Triangle.
     */
    @org.junit.Test
    public void testTriType() {
        System.out.println("triType");
        int i = 5;
        int j = 5;
        int k = -3;
        Triangle instance = new Triangle();
        int expResult = 3;
        int result = instance.triType(i, j, k);
        assertEquals(expResult, result);
        
        
    }
    
}
