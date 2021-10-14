package greedy;

import java.util.Scanner;

import static greedy.거스름돈.Solution.solution;

public class 거스름돈 {

    private static Scanner scanner;

    /**
     * Problem
     *
     * 당신은 음식점의 계산을 도와주는 점원이다. 카운터에는 거스름돈으로 사용할 500원, 100원, 50원, 10원짜리
     * 동전이 무한히 존재한다고 가정한다. 손님에게 거슬러 줘야 할 돈이 N원일 때 거슬러줘야 할 동전의 최소 개수를 구하라.
     * 단, 거슬러 줘야 할 돈 N은 항상 10의 배수이다.
     */

    /**
     * Solve
     * 그리디 알고리즘의 가장 대표적인 문제.
     * 간단한 아이디어만 떠올리면 풀 수 있다.
     * 그것은 바로 '가장 큰 화페 단위부터' 돈을 거슬러 주는 것이다.
     * N원을 거슬러 줄때, 500원으로 줄 수 있는 만큼 일단 거슬러 주고,
     * 그 다음에 100원으로 거슬러 주면 된다.
     */

    public static void main(String[] args) {

        int wholeCount;

        scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int inputAmount = Integer.parseInt(input);

        wholeCount = solution(inputAmount);

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
