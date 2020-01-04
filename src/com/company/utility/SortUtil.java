package com.company.utility;

public class SortUtil {

    public int[] sort(int[] arrayToSort,int choice){

        if(choice==1){
           return ascendingSort(arrayToSort);
        }
        else if(choice==2){
           return descendingSort(arrayToSort);
        }


    return  null;
    }

    public int[] ascendingSort(int[] arrayToSort){
        int temp;
        for(int i=0;i<arrayToSort.length;i++){
            for(int j=0;j<arrayToSort.length;j++){
               if(arrayToSort[i]<arrayToSort[j]){
                   temp=arrayToSort[i];
                   arrayToSort[i]=arrayToSort[j];
                   arrayToSort[j]=temp;
               }
            }
        }

        return  arrayToSort;
    }
    public int[] descendingSort(int[] arrayToSort){

        int temp;
        for(int i=0;i<arrayToSort.length;i++){
            for(int j=0;j<arrayToSort.length;j++){
                if(arrayToSort[i]>arrayToSort[j]){
                    temp=arrayToSort[i];
                    arrayToSort[i]=arrayToSort[j];
                    arrayToSort[j]=temp;
                }
            }
        }

        return  arrayToSort;
    }

}
