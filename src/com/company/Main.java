package com.company;

import java.util.Scanner;
import com.company.utility.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements");
        int num=sc.nextInt();
        int[] arrayToSort=new int[num];
        System.out.println("enter array elements");
        for(int i=0;i<num;i++){
            arrayToSort[i]=sc.nextInt();
        }
        System.out.println("enter your choice\n1.ascending sort\n2.descending sort");
        int choice=sc.nextInt();
        SortUtil sortUtil=new SortUtil();
        int[] arrayAfterSort=sortUtil.sort(arrayToSort,choice);

        System.out.println("aray after sorting");
        for(int i=0;i<arrayAfterSort.length;i++){
            System.out.print(arrayAfterSort[i]+" ");
        }
        if(choice==1){
            System.out.println("\nsecond largest number :"+arrayAfterSort[arrayAfterSort.length-2]);
        }
        else if(choice==2){
            System.out.println("\nsecond largest number :"+arrayAfterSort[1]);
        }


    }
}
