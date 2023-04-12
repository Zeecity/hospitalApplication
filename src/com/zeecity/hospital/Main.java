package com.zeecity.hospital;

public class Main {

    public static void main(String[] args) {
        Records records = new Records();

        records.setName("Anna");
        records.setAge(13);
        records.setColor("Hazel");
        records.setSkinCondition("Rashes");
        records.setMedicalCondition("Healthy");
        System.out.println(records.getName());
        System.out.println(records.getAge());
        records.getOrgans();
    }
}
