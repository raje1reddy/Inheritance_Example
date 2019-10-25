package com.padmaja.flowcontrol;
import java.lang.String;

public class Employee {

    protected String name;
    protected String address;
    protected String phoneNumber;
    protected float experience;

    public void reachOffice(){
        System.out.println("reachedoffice- Gurgoan,India");
    }

    public void startProjectWork(){
        System.out.println("procure hardware");
        System.out.println("install software");

    }

    class Manager extends Employee {
        protected int teamSize;
        public void reportProjectStatus(){}
    }

    class  Programmer extends Employee{
        private String[] programmingLanguages;
        public void writeCode(){}
        public void accessBaseClassMembers(){
            name = "Programmer";
        }
    }

}