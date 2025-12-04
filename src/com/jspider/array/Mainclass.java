package com.jspider.array;

public class Mainclass {
    public static void printArray(int[] nums)
    {
        for(int index=0; index<=nums.length-1; index++)
        {
            System.out.print(nums[index]+" ");
        }
        System.out.println();
    }
    public static int[] test(int[] nums)
    {
        int[] a1=new int[nums.length];
        for (int i=0; i<=nums.length-1; i++)
        {
            a1[i]= nums[i]%2;

        }
        return a1;
    }
    public static void main(String[] args) {
        int[] nums={11,20,13,40};
        printArray(nums);
        int[] result=test(nums);
        printArray(result);
    }
}

