package com.padmaja.flowcontrol;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {
    Employee employee = new Employee();
    @Test
    public void reportProjectStatus() {
        employee.startProjectWork();
        employee.reachOffice();

    }
}