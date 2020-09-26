/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class doctorTest {
    
    public doctorTest() {
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
     * Test of new_doctor method, of class doctor.
     */
    @Test
    public void testNew_doctor() {
        System.out.println("new_doctor");
        doctor instance = new doctor();
        instance.new_doctor();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doctor_info method, of class doctor.
     */
    @Test
    public void testDoctor_info() {
        System.out.println("doctor_info");
        doctor instance = new doctor();
        instance.doctor_info();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
