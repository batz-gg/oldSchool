package com.example.helloworld;

public class countFatNumbers2 {

    public static void main(String[] args) {
        int n = 2147483647;        
        System.out.println("Fat number: "+countFatNumbers());
        
    }
    
    static int countFatNumbers()
    {
        int count = 0;
        for(int i=1; i<2147483647; i++) {
            int sum = 0;
            int j = i;
            while(j>0 && sum<=i) {
                sum += factorial(j%10);
                j/=10;
            }
            if(sum==i)
                count++;
        }
        return count;
    }
    
    static int factorial(int n) {
        switch(n) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 6;
            case 4:
                return 24;
            case 5:
                return 120;
            case 6:
                return 720;
            case 7:
                return 5040;
            case 8:
                return 40320;
            case 9:
                return 362880;
            case 10:
                return 3628800;
            default:
                return 1;
        }        
    }
    
}
