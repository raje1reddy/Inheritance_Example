package com.padmaja.flowcontrol;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgrammerTest {

    Employee employee = new Employee();

    @Test
    public void writeCode() {
     //  employee.accessBaseClassMembers();
    }

    @Test
    public void accessBaseClassMembers() {
        employee.reachOffice();
        employee.startProjectWork();
    }
}