package com.practice.ioc;

import java.util.Arrays;
import java.util.Scanner;

public class Mobile {
    static char[] s = new char[51];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            Arrays.fill(s, 'b');
            System.out.println(s);
            for(int i = 0; i < n; ++i){
                int x = in.nextInt();
                s[x] ^= 1;
                System.out.println(s);
            }
        }
    }
}
