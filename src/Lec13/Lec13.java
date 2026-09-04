package Lec13;

public class Lec13 {
    public static void main(String [] args) {
        System.out.println("Jai Shree Krishna");

        /*
             nse -> next smaller eleemnt
             pse

             nge
             pge
        */

        /*
               [ 2 , 12 , 5 , 3 , 17 , 18 , 21 , 4 , 1  ]
               [ 0    1   2   3    4    5    6   7   8  ]
            -->[ 8    2   3   8    7    7    7   8   -             ]

               [ 1 , 1 , 1 ..... 1 ] --> Size = N
               --> (N - 1) + (N - 2) + (N - 3) + (N - 4) ... 3 + 2 + 1;

               --> (N * (N + 1)) / 2;
               --> ((N - 1) * (N - 1 + 1)) / 2;
               --> (N - 1) * N) / 2;
               --> (N^2 - N) / 2;
        */
    }
}
