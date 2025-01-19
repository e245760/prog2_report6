package jp.ac.uryukyu.ie.e245760;

import java.util.Scanner;

/**
 * じゃんけんゲームを実行するためのメインクラス。
 */
public class JankenMain {
    public static void main(String[] args) {
        JankenSolver solver = new JankenSolver();
        Scanner scanner = new Scanner(System.in);

        System.out.println("じゃんけんゲーム！グー(0), チョキ(1), パー(2)の番号を入力してください。");

        while (true) {
            System.out.print("\nあなたの手: ");
            int playerHand = scanner.nextInt();
            if (playerHand < 0 || playerHand > 2) {
                System.out.println("無効な入力です。0, 1, 2のいずれかを入力してください。");
                continue;
            }

            int computerHand = solver.generateComputerHand();
            System.out.println("コンピュータの手: " + solver.handToString(computerHand));

            String result = solver.determineWinner(playerHand, computerHand);
            System.out.println("結果: " + result);

            System.out.print("続けますか？ (y/n): ");
            char cont = scanner.next().charAt(0);
            if (cont == 'n' || cont == 'N') {
                break;
            }
        }

        scanner.close();
    }
}
