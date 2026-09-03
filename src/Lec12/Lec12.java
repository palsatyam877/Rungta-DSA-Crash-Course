package Lec12;

public class Lec12 {
    public static void main(String [] args) {
        System.out.println("Jai Maa Jagad Amba");

        char x = 'x';
        x++;

        x %= 26;

        System.out.println(x);

        x++;
        x %= 26;

        System.out.println(x);

        x++;

        System.out.println(x);
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

// https://leetcode.com/problems/power-of-two/submissions/2129225712/?envType=problem-list-v2&envId=recursion

/*
class Solution {
    boolean f(int N) {
        if(N == 1)
           return true;
        return (N % 2 == 0) && f(N / 2);
    }

    public boolean isPowerOfTwo(int n) {
        if(n == 0)
            return false;
        return f(n);
    }
}
*/

/*
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;

        while(n > 1) {
            if((n & 1) != 0)
                return false;
            else
               n = n / 2;
        }

        return true;
    }
}

*/

/*
class Solution {
public:
    bool isPowerOfTwo(int n) {
        if(n <= 0)
            return false;

        return __builtin_popcount(n) == 1;
    }
};
*/

// https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/description/?envType=problem-list-v2&envId=recursion

/*
class Solution {
    public char kthCharacter(int K) {
        StringBuffer S = new StringBuffer();
        S.append('a');

        int N = 1;

        while(S.length() < K) {
            int sz = S.length();

            for(int i = 0; i < sz; ++i) {
                char X = S.charAt(i);

                if(X == 'z')
                    X = 'a';
                else
                   ++X;

                S.append(X);
            }
        }

        return S.charAt(K - 1);
    }
}
*/