package jp.ac.uryukyu.ie.e185728;

public class judge {

    /**
     * 勝敗を決めるメソッド
     * @param one my hand
     * @param two opponent hand
     * @return
     */
    public static int result(int one, int two){
        int judgeGame = 0;
        if(one == two){
            System.out.println("引き分けです。");
            judgeGame = 0;
        }else if((one-two==-1) || (one-two==2)){
            System.out.println("プレイヤーの勝利です。");
            judgeGame = 1;
        }else if((one-two==1) || (one-two==-2)){
            System.out.println("プレイヤーの負けです。");
            judgeGame = 1;
        }
        return judgeGame;
    }
}
