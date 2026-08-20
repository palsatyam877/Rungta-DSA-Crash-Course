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

    public static void main(String [] args) {

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

        FastReader s = new FastReader();
        int t = s.nextInt();

        while (t-- > 0)
            solve(s);

        // https://leetcode.com/problems/roman-to-integer/description/?topicSlugs=array
        // https://www.geeksforgeeks.org/problems/minimum-vertical-sum-1593518814/1

        // https://leetcode.com/problems/kth-largest-element-in-an-array/
        // https://leetcode.com/problems/top-k-frequent-elements/description/

        // Making Map store Duplicate keys

        // https://leetcode.com/problems/k-closest-points-to-origin/
        // https://leetcode.com/problems/meeting-rooms-iii/

        // Ascending and Descinding iterator from a given point in Set ***** IMP

        // https://leetcode.com/problems/find-median-from-data-stream/
    }
}
