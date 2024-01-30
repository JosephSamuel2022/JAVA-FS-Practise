package Tables;

import java.util.Scanner;

import static java.lang.Math.max;

public class MaxFood {
    static int[][] dir={{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{1,-1},{-1,1}};

    public static int neighbours(int i,int j,int [][] arr,int[][] dir){
        int sum=arr[i][j];
        for( int[] row:dir){

            int ni=i+row[0];
            int nj=j+row[1];
            if(ni>=0 && nj>=0 && ni<arr.length && nj<arr[0].length){
                sum+=arr[ni][nj];
            }

        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);


        try{
            System.out.println("Enter the number of rows and columns : ");
            int m=sc.nextInt();

            int n=sc.nextInt();

            int [][] arr=new int[m][n];
            System.out.println("Enter the matrix elements : ");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){

                    arr[i][j]=sc.nextInt();
                }
            }
            int ans=Integer.MIN_VALUE;
            int x=0;
            int y=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(neighbours(i,j,arr,dir)>ans) {
                        ans = neighbours(i, j, arr, dir);
                        x=i;
                        y=j;
                    }
                }
            }
            System.out.println("Result : x:"+(x+1)+" y:"+(y+1)+" "+ans);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
