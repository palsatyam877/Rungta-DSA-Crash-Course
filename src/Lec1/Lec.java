package Lec1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Lec {

    static class FastReader {

        // BufferedReader to read input
        BufferedReader b;

        // StringTokenizer to tokenize input
        StringTokenizer s;

        // Constructor to initialize BufferedReader
        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        // Method to read the next token as a string
        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return s.nextToken();
        }

        // Method to read the next token as an integer
        int nextInt() {
            return Integer.parseInt(next());
        }

        // Method to read the next token as a long
        long nextLong() {
            return Long.parseLong(next());
        }

        // Method to read the next token as a double
        double nextDouble() {
            return Double.parseDouble(next());
        }

        // Method to read the next line as a string
        String nextLine() {
            String str = "";
            try {
                if (s.hasMoreTokens()) {
                    str = s.nextToken("\n");
                } else {
                    str = b.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void solve(FastReader s) {

    }

    public static class myComp implements Comparator<Integer> {

        @Override
        public int compare(Integer a , Integer b) {
//            if(a.compareTo(b) == 0)
//                 return 1;
            return a.compareTo(b);
        }
    }


    public static void main(String [] args) {

         Map<Integer , Integer> mp = new TreeMap<>(new myComp());
         mp.put(1 , 56);
         mp.put(6 , 43);
         mp.put(16 , 2);
         mp.put(1 , 56);

         System.out.println(mp.get(6));
         System.out.println(mp);

        // https://www.codechef.com/problems/CHOCGM

        /*
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{

       static class FastReader {

        // BufferedReader to read input
        BufferedReader b;

        // StringTokenizer to tokenize input
        StringTokenizer s;

        // Constructor to initialize BufferedReader
        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        // Method to read the next token as a string
        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return s.nextToken();
        }

        // Method to read the next token as an integer
        int nextInt() {
            return Integer.parseInt(next());
        }

        // Method to read the next token as a long
        long nextLong() {
            return Long.parseLong(next());
        }

        // Method to read the next token as a double
        double nextDouble() {
            return Double.parseDouble(next());
        }

        // Method to read the next line as a string
        String nextLine() {
            String str = "";
            try {
                if (s.hasMoreTokens()) {
                    str = s.nextToken("\n");
                } else {
                    str = b.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void solve(FastReader s) {
        int n = s.nextInt();

        int [] a = new int[n + 1];
        int T = 0 , O = 0;

        for(int i = 1; i <= n; ++i) {
            a[i] = s.nextInt();
            T += a[i];

            if(a[i] % 2 != 0)
                ++O;
        }

        if(T % 2 == 0) {
            int A = T - O;
            A += (O / 2);
            System.out.println(A);
        } else {
            int B = T - O;
            B += ((O / 2) + 1);

            System.out.println(T - B);
        }
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        FastReader s = new FastReader();
        int t = s.nextInt();

        while(t-- > 0)
            solve(s);
	}
}

        */

        // https://www.geeksforgeeks.org/problems/modular-exponentiation-for-large-numbers5537/1

        /*
class Solution {
    public int powMod(int x, int n, int m) {
        // code here
        long X = (long)x , N = (long)n , M = (long)m;

        ArrayList<Long> A = new ArrayList<>();
        A.add(X % M);

        for(int i = 1; i <= 31; ++i)
            A.add((A.getLast() * A.getLast())%M);

        long ans = 1;

        for(int bit = 0; bit <= 31; ++bit)
            if((N & ((long)1 << bit)) != 0) {
               ans *= A.get(bit);
               ans %= M;
            }

        return (int)ans;
    }
}
        */

//        FastReader s = new FastReader();
//        int t = s.nextInt();
//
//        while (t-- > 0)
//            solve(s);

       /*
class Solution {
    public long f(long X , long N , long M) {
        if(N == 0)
            return 1;
        else if(N == 1)
            return (X % M);

        if(N % 2 == 0) {
            long T = f(X , N / 2 , M);

            T = (T * T) % M;
            return T;
        } else {
            long T = f(X , (N  - 1)/ 2 , M);

            T = (T * T) % M;

            return (X * T) % M;
        }
    }

    public int powMod(int x, int n, int m) {
        // code here
        long X = (long)x , N = (long)n , M = (long)m;

        return (int)f(X , N , M);
    }
}
*/
        // https://www.geeksforgeeks.org/problems/minimum-vertical-sum-1593518814/1

        // https://leetcode.com/problems/roman-to-integer/description/?topicSlugs=array

        // https://leetcode.com/problems/kth-largest-element-in-an-array/
        // https://leetcode.com/problems/top-k-frequent-elements/description/

        // Making Map store Duplicate keys

        // https://leetcode.com/problems/k-closest-points-to-origin/
        // https://leetcode.com/problems/meeting-rooms-iii/

        // Ascending and Descinding iterator from a given point in Set ***** IMP

        // https://leetcode.com/problems/find-median-from-data-stream/
    }
}
