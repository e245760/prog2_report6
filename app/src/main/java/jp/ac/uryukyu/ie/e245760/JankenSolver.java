package jp.ac.uryukyu.ie.e245760;

import java.util.Random;

/**
 * じゃんけんゲームのロジックを管理するクラス。
 */
public class JankenSolver {
    private static final String[] CHOICES = {"グー", "チョキ", "パー"};
    private final Random random;

    /**
     * コンストラクタ。ランダム生成器を初期化。
     */
    public JankenSolver() {
        this.random = new Random();
    }

    /**
     * コンピュータの手を生成。
     *
     * @return コンピュータの選択（0: グー, 1: チョキ, 2: パー）
     */
    public int generateComputerHand() {
        return random.nextInt(3);
    }

    /**
     * プレイヤーの手とコンピュータの手を比較し、結果を返す。
     *
     * @param playerHand    プレイヤーの手（0: グー, 1: チョキ, 2: パー）
     * @param computerHand  コンピュータの手（0: グー, 1: チョキ, 2: パー）
     * @return 結果文字列（勝ち、負け、あいこ）
     */
    public String determineWinner(int playerHand, int computerHand) {
        if (playerHand == computerHand) {
            return "あいこ";
        } else if ((playerHand == 0 && computerHand == 1) ||
                    (playerHand == 1 && computerHand == 2) ||
                    (playerHand == 2 && computerHand == 0)) {
            return "勝ち";
        } else {
            return "負け";
        }
    }

    /**
     * 手の番号を対応する文字列に変換。
     *
     * @param hand 手の番号（0: グー, 1: チョキ, 2: パー）
     * @return 対応する手の文字列
     */
    public String handToString(int hand) {
        if (hand >= 0 && hand < CHOICES.length) {
            return CHOICES[hand];
        }
        throw new IllegalArgumentException("無効な手の値: " + hand);
    }
}