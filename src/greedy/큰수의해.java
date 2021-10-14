package greedy;

import java.util.Scanner;

import static greedy.거스름돈.Solution.solution;

public class 큰수의해 {

    private static Scanner scanner;

    /**
     * Problem
     */

    /**
     * Solve
     */

    public static void main(String[] args) {

        scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int inputAmount = Integer.parseInt(input);

        System.out.println("wholeCount = " + wholeCount);

    }

    static class Solution {
        public static int solution(int amount) {

            int answer = 0;

            int count500;
            int count100;
            int count50;
            int count10;

            count500 = amount / 500;
            amount -= count500 * 500;

            count100 = amount / 100;
            amount -= count100 * 100;

            count50 = amount / 50;
            amount -= count50 * 50;

            count10 = amount / 10;

            answer = count10 + count500 + count100 + count50;

            return answer;
        }
    }
}
