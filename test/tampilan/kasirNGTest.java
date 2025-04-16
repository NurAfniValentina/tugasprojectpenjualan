/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package tampilan;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Nur Afni Valentina
 */
public class kasirNGTest {
    
    public kasirNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of aktif method, of class kasir.
     */
    @Test
    public void testAktif() {
        System.out.println("aktif");
        kasir instance = new kasir();
        instance.aktif();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kosong method, of class kasir.
     */
    @Test
    public void testKosong() {
        System.out.println("kosong");
        kasir instance = new kasir();
        instance.kosong();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of datatable method, of class kasir.
     */
    @Test
    public void testDatatable() {
        System.out.println("datatable");
        kasir instance = new kasir();
        instance.datatable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class kasir.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        kasir.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
