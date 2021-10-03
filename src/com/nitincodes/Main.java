package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write a program to check that the two arrays rae equal or not:
      Scanner sc = new Scanner(System.in);
      int[] arr1 = new int[5];
      int[] arr2 = new int[5];
        System.out.println("Enter the first array: ");
      for(int i=0;i< arr1.length;i++){
          arr1[i] = sc.nextInt();
      }
        System.out.println();
        System.out.println("Enter the second array: " );
      for(int i=0;i< arr2.length;i++){
          arr2[i]= sc.nextInt();
      }
      boolean isEqual = false;
      for(int i=0;i<arr1.length;i++){
          if(arr1[i]==arr2[i]){
          isEqual= true;
          }
          else {
              isEqual = false;
          }
      }
      if(isEqual==true){
          System.out.println("Arrays are equal");
      }
      else{
          System.out.println("Arrays are not equal");
      }
    }
}
