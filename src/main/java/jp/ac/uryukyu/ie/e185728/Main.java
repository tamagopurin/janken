package jp.ac.uryukyu.ie.e185728;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        enemy opponent = new enemy("太郎", 38, "男性");
        opponent.printData();

        System.out.println("これからじゃんけんを始めます。");
        System.out.println("ぐー、ちょき、ぱーのいずれかを入力してください。");
        String input = sc.nextLine();
        int throwHand;
        switch(input){
            case "ぐー":
                throwHand = 0;
                break;
            case "ちょき":
                throwHand = 1;
                break;
            case "ぱー":
                throwHand = 2;
                break;
            default:
                throwHand = -1;
        }
    }
}
