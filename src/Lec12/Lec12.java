package Lec12;

public class Lec12 {
    public static void main(String [] args) {
        System.out.println("Jai Maa Jagad Amba");
    }
}

// https://www.geeksforgeeks.org/problems/modular-exponentiation-for-large-numbers5537/1
/*
class Solution {
    long f(long X , long N , long M) {
        if(N == 1)
            return X;

        if(N == 2)
           return (X * X) % M;

        if((N & 1) != 0) {
            long C = f(X , N / 2 , M);

            return (X * ((C * C)%M))%M;
        } else {
            long C = f(X , N / 2 , M);

            return (C * C) % M;
        }
    }

    public int powMod(int x, int n, int M) {
        // code here
        return (int)f((long)x , (long)n , (long)M);
    }
}
*/