/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tespostdd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wart
 */
public class TesPosTDDTest {
    
    public TesPosTDDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class TesPosTDD.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TesPosTDD.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void TestNot(){
       NotaApr notaApr = new NotaApr();
         int actual = 65;
       assertEquals(notaApr.Aprobar(43), actual);
    }
}
