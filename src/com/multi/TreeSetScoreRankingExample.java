package com.multi;

import java.util.TreeSet;

public class TreeSetScoreRankingExample {

    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(85);
        scores.add(70);
        scores.add(95);
        scores.add(60);
        scores.add(100);
        scores.add(85); // 중복 점수

        System.out.println("점수 목록");
        System.out.println(scores);

        System.out.println();

        System.out.println("최저 점수: " + scores.first());
        System.out.println("최고 점수: " + scores.last());

        int target = 85;

        System.out.println();
        System.out.println("기준 점수: " + target);
        System.out.println(target + "보다 바로 낮은 점수: " + scores.lower(target));
        System.out.println(target + "보다 바로 높은 점수: " + scores.higher(target));
        System.out.println(target + " 이하에서 가장 가까운 점수: " + scores.floor(target));
        System.out.println(target + " 이상에서 가장 가까운 점수: " + scores.ceiling(target));

        System.out.println();

        System.out.println("80점 이상 점수 목록");
        System.out.println(scores.tailSet(80));

        System.out.println("90점 미만 점수 목록");
        System.out.println(scores.headSet(90));

        System.out.println("70점 이상 100점 미만 점수 목록");
        System.out.println(scores.subSet(70, 100));
    }
}