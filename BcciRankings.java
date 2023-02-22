package BcciRanking;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.ArrayList;

import java.util.Scanner;

public class RankList {
    public static void main(String[] args) throws IOException {
        Scanner getInput = new Scanner(System.in);
        BufferedReader getinput = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> Total = new ArrayList<>();
        ArrayList<String> Players = new ArrayList<>();
        ArrayList<Integer> SortedTotal = new ArrayList<>();
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
            int total = a+b+c;
            Total.add(total);
            Players.add(P);
        }
        int[] arr1 = new int[Total.size()];
        for(int i=0; i<Total.size(); i++){
            arr1[i] = Total.get(i);
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
            SortedTotal.add(arr1[l]);
        }
        System.out.println("\nTotal Players : ");
        for(int r=0; r<Players.size(); r++){
            System.out.println(Players.get(r));
        }
        System.out.println("\nTo see the players stats, Enter the number of player's stats want to see : ");
        int y = getInput.nextInt();
        for(int n=0; n<y; n++){
            System.out.println("\nPlease enter the name : ");
            String S = getinput.readLine();
            if(S.equals(Players.get(n))) {
                for (int q = 0; q < Players.size(); q++) {
                    if (S.equals(Players.get(q))) {
                        System.out.println("Player Name : " + S);
                        System.out.println("Total Score in 3 Matches : " + Total.get(q));
                        System.out.println("Position : " + (SortedTotal.indexOf(Total.get(q)) + 1) + " rank");
                    }
                }
            }
            else{
                System.out.println("Player doesn't exist !\n");
            }
        }
    }
}
