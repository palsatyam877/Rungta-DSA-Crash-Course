package Lec12;

public class Lec12 {
    public static void main(String [] args) {
        System.out.println("Jai Maa Jagad Amba");

//        char x = 'x';
//        x++;
//
//        x %= 26;
//
//        System.out.println(x);
//
//        x++;
//        x %= 26;
//
//        System.out.println(x);
//
//        x++;
//
//        System.out.println(x);

        int mxBitOn = -1;
        int N = 15;

        for(int bit = 0; bit <= 31; ++bit) {
            if((N & (1 << bit)) != 0)
                mxBitOn = bit;
        }

        System.out.println(1 << (mxBitOn + 1));
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

/*
class Solution {
    public StringBuffer f(int N) {
        if(N == 1) {
            StringBuffer S = new StringBuffer();
            S.append('a');

            return S;
        }

        StringBuffer soFar = f(N / 2);

        int L = soFar.length();

        for(int i = 0; i < L; ++i) {
            char C = soFar.charAt(i);

            if(C == 'z')
              C = 'a';
            else
              C++;

            soFar.append(C);
        }

        return soFar;
    }

    public char kthCharacter(int K) {
        int mxBitOn = -1;
        int N = K;

        for(int bit = 0; bit <= 31; ++bit) {
            if((N & (1 << bit)) != 0)
                mxBitOn = bit;
        }

        int Len = 1 << (mxBitOn + 1);

        return f(Len).charAt(K - 1);
    }
}
*/

// https://leetcode.com/problems/combinations/submissions/1916018336/

/*
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        if(n == k) {
            List<List<Integer>> C = new ArrayList<>();
            List<Integer> C1 = new ArrayList<>();

            for(int i = 0; i < n; ++i)
               C1.add(i + 1);

            C.add(C1);

            return C;
        }

        if(k == 0) {
            List<List<Integer>> C = new ArrayList<>();
            List<Integer> C1 = new ArrayList<>();
            C.add(C1);

            return C;
        }

        List<List<Integer>> A = combine(n - 1 , k);
        List<List<Integer>> B = combine(n - 1 , k - 1);

        for(int i = 0; i < B.size(); ++i) {
            B.get(i).add(n);
            A.add(B.get(i));
        }

        return A;
    }
}

*/

/*
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> Ans = new ArrayList<>();

        for(int mask = 0; mask < (1 << n); ++mask) {
            List<Integer> C = new ArrayList<>();

            if(Integer.bitCount(mask) == k)
                for(int j = 0; j < n; ++j)
                    if((mask & (1 << j)) != 0)
                        C.add(j + 1);

            if(C.size() > 0)
                Ans.add(C);
        }

        return Ans;
    }
}
*/

