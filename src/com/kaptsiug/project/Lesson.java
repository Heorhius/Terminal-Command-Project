package com.kaptsiug.project;

import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.List;

public class Lesson {

    public static void main(String[] args) {
        List<String> firstList = new ArrayList<>();
        firstList.add("First");

        List<String> secondList = new ArrayList<>();
        secondList.add("Task");

        List<String> unionList = ListUtils.union(firstList, secondList);

        for (String word : unionList) {
            System.out.printf("%s ", word);
        }

    }

}
