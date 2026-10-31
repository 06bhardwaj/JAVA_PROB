/*package DAY2.SESSION1;

import java.util.Scanner;

public class method1 {

    
    
    static void count(int low, int high) {
       int temp = 0;
       for (int i = low; i <= high; i++) {
           if (i % 2 != 0) {
               System.out.println(i);
           }
       }  
    }
       
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range low:");
        int low = sc.nextInt();

        System.out.println("Enter the range high:");
        int high = sc.nextInt();
        

       count(low, high);


        sc.close();
    }


}
    

package DAY2.SESSION1;

import java.util.Scanner;

public class method1 {

    static void count(int low, int high) {
        int count = (high + 1) / 2 - low / 2;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range low:");
        int low = sc.nextInt();

        System.out.println("Enter the range high:");
        int high = sc.nextInt();

        count(low, high);

        sc.close();
    }
}


package DAY2.SESSION1;

public class method1 {
    static int climb(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return climb(n-1)+climb(n-2);
        }
    }
    static void main(String[] args) {
        int n=4;
        System.out.println(climb(n));
    }
}

package DAY2.SESSION1;

public class method1 {
public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int a = 1;
        int b = 2;

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
} */









