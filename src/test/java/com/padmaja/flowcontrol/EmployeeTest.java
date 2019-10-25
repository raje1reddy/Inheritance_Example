package com.padmaja.flowcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class EmployeeTest {

        private Employee employee;
        @BeforeClass
        public static void setUpClass()
        {
            System.out.println("set up class");
            // ForLoopExample forLoopExample = new ForLoopExample();
        }
        @Before
        public void setUp(){
            employee = new Employee();
        }

        @After
        public void tearDown(){
            System.out.println("tear down");
            employee = null;
        }
        @Test
        public void inheritanceExample() {
             employee.startProjectWork();
             employee.reachOffice();

            //System.out.println(result);
            //int expectedresult = 6;
            //assertEquals(expectedresult,result);
        }
       /* @Test
        public void WhileLoopExample2num9() {
            Employee employee = new Employee();
            int result = employee.whileLoopExample2(9,true);
            System.out.println(result);
            int expectedresult = 9;
            assertEquals(expectedresult,result);
        }

    @Test
    public void whileLoopExample_num99_true() {
        int result = employee.tablesExample(99,true);
        System.out.println(result);
        int expectedresult = 99;
        assertEquals(expectedresult,result);
    }


    @Test
    public void WhileLoopExample4_num0_false() {
        Employee employee = new Employee();
        int result = employee.whileLoopExample2(0,false);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }
    @Test
    public void whileLoopExample5_num999_true() {
        int result = employee.tablesExample(999,true);
        System.out.println(result);
        int expectedresult = 999;
        assertEquals(expectedresult,result);
    }

    @Test
    public void whileLoopExample5_num9999_true() {
        int result = employee.whileLoopExample2(9999,true);
        System.out.println(result);
        int expectedresult = 9999;
        assertEquals(expectedresult,result);
    }
    @Test
    public void whileLoopExample6_num0_false() {
        int result = employee.tablesExample(0,false);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }

    @Test
    public void whileLoopExample7_numnegative_true() {
        int result = employee.tablesExample(-9,true);
        System.out.println(result);
        int expectedresult = -9;
        assertEquals(expectedresult,result);
    }

    @Test
    public void whileLoopExample8_numinvalid_false() {
        int result = employee.tablesExample(-99999999,false);
        System.out.println(result);
        int expectedresult = -100000006;
        assertEquals(expectedresult,result);
    }

    @Test
    public void whileLoopExample6_num00_false() {
        int result = employee.whileLoopExample2(0,true);
        System.out.println(result);
        int expectedresult = 0;
        assertEquals(expectedresult,result);
    }
    @Test
    public void whileLoopExample8_numinvalid1_false() {
        int result = employee.whileLoopExample2(-99999999,false);
        System.out.println(result);
        int expectedresult = -100000006;
        assertEquals(expectedresult,result);
    }


    @Test
    public void whileLoopExample7_numnegative1_true() {
        int result = employee.whileLoopExample2(-9,false);
        System.out.println(result);
        int expectedresult = -15;
        assertEquals(expectedresult,result);
    }
*/
}



