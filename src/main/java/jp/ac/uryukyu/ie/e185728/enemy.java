package jp.ac.uryukyu.ie.e185728;

import java.util.Random;

public class enemy {
    private String name;
    private int age;
    private String gender;

    enemy(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int random(){
        int randomHand;
        Random random = new Random();
        randomHand  = random.nextInt(3);
        return randomHand;
    }
    public void printData(){
        System.out.println("初めまして,"+this.age+"歳"+this.gender+" "+this.name+"です。");
    }
}
