package jp.ac.uryukyu.ie.e185728;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        enemy opponent = new enemy("太郎", 38, "男性");
        opponent.printData();
        System.out.println("これからじゃんけんを始めます。");

        while(true) {
            System.out.println("ぐー、ちょき、ぱーのいずれかを入力してください。");
            String input = sc.nextLine();
            int throwHand;
            switch (input) {
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

            int a = opponent.random();
            int ooo = judge.result(throwHand, a);
            if (ooo == 0) {
                continue;
            }

            System.out.println("まだじゃんけんを続けますか？");
            System.out.println("続けるなら 0 , 終了するなら 1 と入力してください。");
            int whichFinish = sc.nextInt();
            if(whichFinish == 1){
                break; // プログラムを終了する
            }
        }
        System.out.println("プログラムを終了します。");
    }
}
