package com.zeecity.hospital;

import java.util.Scanner;

public class Records {
    private String name = "Ann";
    private int age = 10;
    public int number;
    private String medicalCondition = "No medical record";
    private String color = "black";
    private int heartRate = 90;
    private String status = "Needs to be fed";
    private String skinCondition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSkinCondition() {
        return skinCondition;
    }

    public void setSkinCondition(String skinCondition) {
        this.skinCondition = skinCondition;
    }

    Scanner scanner = new Scanner(System.in);
    private void organs(){
        System.out.println("Choose an organ:");
        System.out.println("    1. left Eye");
        System.out.println("    2. Right Eye");
        System.out.println("    3. Heart");
        System.out.println("    4. Stomach");
        System.out.println("    5. Skin");
        System.out.println("    6. Quit");

        number = scanner.nextInt();

        if (number == 1){
            leftEye(medicalCondition, color);
        } else if (number == 2) {
            rightEye(medicalCondition, color);
        }else if(number == 3){
            heart(medicalCondition, heartRate);
        } else if (number == 4) {
            stomach(medicalCondition, status);
        } else if (number == 5) {
            skin(this.skinCondition);
        } else if (number == 6) {
            System.exit(0);
        }else{
            organs();
        }
    }

    public void getOrgans(){
        organs();
    }


    private void closeEye(){
        organs();
    };
    private void leftEye(String medicalCondtion, String Color){
        this.medicalCondition = medicalCondtion;
        this.color = color;
        System.out.println(this.medicalCondition);
        System.out.println(this.color);
        System.out.println("    1. Close the eye");
        System.out.println("    2. Leave left eye");
        System.out.println("    3. Quit");
        number = scanner.nextInt();
        if(number == 1){
            System.out.println("Left eye closed");
            organs();
        }
    }

    private void rightEye(String medicalCondition, String color){
        this.medicalCondition = medicalCondition;
        this.color = color;
        System.out.println(this.medicalCondition);
        System.out.println(this.color);
        System.out.println("    1. Close the eye");
        System.out.println("    2. Leave Right eye");
        System.out.println("    3. Quit");
        number = scanner.nextInt();
        if(number == 1) {
            System.out.println("Right eye closed");
            organs();
        } else if (number == 2) {
            organs();
        } else if (number == 3) {
            System.exit(0);
        }else{
            System.exit(0);
        }
    }

    private void heart(String medicalCondition, int heartRate){
        this.medicalCondition = medicalCondition;
        this.heartRate = heartRate;
        System.out.println(this.medicalCondition);
        System.out.println(this.heartRate);
        System.out.println("    1. Change the heart rate");
        System.out.println("    2. Leave heart");
        System.out.println("    3. Quit");
        number = scanner.nextInt();
        if(number == 1){
            int beat = scanner.nextInt();
            this.heartRate = beat;
            setHeartRate(beat);
            System.out.println("heart rate is" + getHeartRate());
            organs();
        }else if (number == 2) {
            organs();
        } else if (number == 3) {
            System.exit(0);
        }else{
            System.exit(0);
        }
    }

    public void stomach(String medicalCondition, String status){
        this.medicalCondition = medicalCondition;
        this.status = status;
        System.out.println("    1. Digest");
        System.out.println("    2. Leave stomach");
        System.out.println("    3. Quit");
        number = scanner.nextInt();
        if(number == 1){
            System.out.println("Digestion started...");
            System.out.println("Completed");
            organs();
        } else if (number == 2) {
            organs();
        } else if (number == 3) {
            System.exit(0);
        }else{
            System.exit(0);
        }
    }
    public void skin(String skinCondition){
        this.skinCondition = skinCondition;
        System.out.println(this.skinCondition);
        organs();
    }
}
