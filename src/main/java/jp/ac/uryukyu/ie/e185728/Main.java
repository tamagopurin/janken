package jp.ac.uryukyu.ie.e185728;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("これからじゃんけんを始めます。");
        enemy opponent = new enemy("太郎", 38, "男性"); // 相手のプロフィール
        opponent.printData();

        while(true) {
            System.out.println("ぐー、ちょき、ぱーのいずれかを入力してください。");
            String input = sc.nextLine();
            int throwHand; // 自分の出す手
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

            int opponentHand = opponent.random(); // 相手の出す手
            int result = judge.result(throwHand, opponentHand);
            // 引き分けの場合
            if (result == 0) {
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
