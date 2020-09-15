/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.id.proyectoaprovarreprovar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Garcia
 */
public class ClsOperacionesMatTest {
    
    public ClsOperacionesMatTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    /**
     * Test of getDato1 method, of class ClsOperacionesMat.
     */
    @org.junit.jupiter.api.Test
    public void testGetDato1() {
        System.out.println("getDato1");
        ClsOperacionesMat instance = new ClsOperacionesMat();
        Double expResult = null;
        Double result = instance.getDato1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDato1 method, of class ClsOperacionesMat.
     */
    @org.junit.jupiter.api.Test
    public void testSetDato1() {
        System.out.println("setDato1");
        Double Dato1 = null;
        ClsOperacionesMat instance = new ClsOperacionesMat();
        instance.setDato1(Dato1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDato2 method, of class ClsOperacionesMat.
     */
    @org.junit.jupiter.api.Test
    public void testGetDato2() {
        System.out.println("getDato2");
        ClsOperacionesMat instance = new ClsOperacionesMat();
        Double expResult = null;
        Double result = instance.getDato2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDato2 method, of class ClsOperacionesMat.
     */
    @org.junit.jupiter.api.Test
    public void testSetDato2() {
        System.out.println("setDato2");
        Double Dato2 = null;
        ClsOperacionesMat instance = new ClsOperacionesMat();
        instance.setDato2(Dato2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of suma method, of class ClsOperacionesMat.
     */
    @org.junit.jupiter.api.Test
    public void testSuma() {
        System.out.println("suma");
        Double Dato1 = null;
        Double Dato2 = null;
        ClsOperacionesMat instance = new ClsOperacionesMat();
        Double expResult = null;
        Double result = instance.suma(Dato1, Dato2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
