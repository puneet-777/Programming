package com.puneet.ProgrammingPractice;
public class Main {

    public static int findEqlPoint(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int openCnt = 0, closeCnt = 0;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == '(')
                    openCnt++;
            }
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == ')') 
                    closeCnt++;
            }
            if (openCnt == closeCnt) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s ="(())))(";
        System.out.println(findEqlPoint(s)); 
    }
}