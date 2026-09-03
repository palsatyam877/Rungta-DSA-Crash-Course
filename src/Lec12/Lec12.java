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

/*
class Solution {


    public int powMod(int x, int n, int m) {
        // code here

        long X = (long)x;
        long N = (long)n;
        long M = (long)m;

        long [] binPow = new long [32];
        binPow[0] = X%M;

        for(int bit = 1; bit <= 31; ++bit)
            binPow[bit] = (binPow[bit - 1] * binPow[bit - 1]) % M;

        long Ans = 1;

        for(int bit = 0; bit <= 31; ++bit)
           if((N & ((long)1 << bit)) != 0) {
               Ans *= binPow[bit];
               Ans %= M;
           }

        return (int)Ans;
    }
}
*/