package jp.ac.uryukyu.ie.e185728;

import java.util.Random;

public class enemy {

    private String name;
    private int age;
    private String gender;

    /**
     * 初期設定
     * @param name 名前
     * @param age 年齢
     * @param gender 性別
     */
    enemy(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * 対戦相手の手
     * @return 0,1,2(ぐー、ちょき、ぱー)
     */
    public int random(){
        int randomHand;
        Random random = new Random();
        randomHand  = random.nextInt(3);
        return randomHand;
    }

    /**
     * 対戦相手のプロフィールをprint
     */
    public void printData(){
        System.out.println("初めまして,"+this.age+"歳"+this.gender+"、対戦相手の"+this.name+"です。");
    }
}
