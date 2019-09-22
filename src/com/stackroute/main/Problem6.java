package com.stackroute.main;

public class Problem6 {
    public static void main(String[] args)
    {
        Problem6 problem6 = new Problem6();

        System.out.println("Int factorials:");
        problem6.printIntFactorials();

        System.out.println("Long factorials:");
        problem6.printLongFactorials();
    }

    private void printIntFactorials()
    {
        int i  = 1;
        int fn = 1;
        while (true)
        {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, fn);
            if (Integer.MAX_VALUE / fn < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            fn *= i;
        }

    }

    private void printLongFactorials()
    {
        long i  = 1L;
        long fn = 1L;
        while (true)
        {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, fn);
            if (Long.MAX_VALUE / fn < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            fn *= i;
        }

    }
}
