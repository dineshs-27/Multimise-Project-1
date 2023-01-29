package BcciRanking;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.ArrayList;

import java.util.Objects;

import java.util.Scanner;

public class RankList {
    public static void main(String[] args) throws IOException {
        Scanner getInput = new Scanner(System.in);
        BufferedReader getinput = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println("Enter the Number of Players : ");
        int x = getInput.nextInt();
        for(int i=0; i<x; i++) {
            System.out.println("\nEnter the player " + (i+1) + ": ");
            String P = getinput.readLine();
            System.out.println("Enter the Score in Match 1 : ");
            int a = getInput.nextInt();
            System.out.println("Enter the Score in Match 2 : ");
            int b = getInput.nextInt();
            System.out.println("Enter the Score in Match 3 : ");
            int c = getInput.nextInt();
            int Total = a+b+c;
            list1.add(Total);
            list2.add(P);
        }
        int[] arr1 = new int[list1.size()];
        for(int i=0; i<list1.size(); i++){
            arr1[i] = list1.get(i);
        }
        int temp;
        for(int j=0; j<arr1.length; j++){
            for(int k=j+1; k<arr1.length; k++){
                if(arr1[j]<arr1[k]){
                    temp = arr1[k];
                    arr1[k] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for(int l=0; l<arr1.length; l++){
            list3.add(arr1[l]);
        }
        System.out.println("\nTotal Players : " + list2);
        System.out.println("\nTo see the players stats, Enter the number of player's stats want to see : ");
        int y = getInput.nextInt();
        for(int n=0; n<y; n++){
            System.out.println("\nPlease enter the name : ");
            String S = getinput.readLine();
            for(int q=0; q<list2.size(); q++) {
                if(S.equals(list2.get(q))) {
                    System.out.println("Player Name : " + S);
                    System.out.println("Total Runs : " + list1.get(q));
                    for (int p=0; p<list3.size(); p++) {
                        if(Objects.equals(list1.get(q),list3.get(p))) {
                            System.out.println("Position : " + (p + 1) + " rank");
                        }
                    }
                }
            }
        }
    }
}
