package train4_6;

import java.io.IOException;
import java.util.Scanner;

public class Train {
    public static void main(String[] arg) throws IOException {
        int[] targetTable = new int[100];
        for (int i=0;i<100;i++){
            targetTable[i] = 2*i;
        }
        System.out.println("please input a number between 0~198");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println("刚才输入的值是:" + t);
        System.out.println(binarySearch(t,targetTable));
        System.out.println(binarySearchRecursion(targetTable,99,0,t));
    }
    public static int binarySearch(int t,int[] tab){
        if (t < 0 || t > 198)
            return -1;
        boolean i =true;
        int serialMin = 0;
        int serialMax = 99;
        int tempNumber = 0;
        while(serialMin <= serialMax){
            tempNumber = (int)((serialMin+serialMax)*0.5);
            if(tab[tempNumber] < t) {
                serialMin = tempNumber +1;
            } else { if(tab[tempNumber] == t) {
                     return tempNumber;
                }else {
                     serialMax = tempNumber -1;
                }
            }
        }
       return tempNumber;
    }
    public static int binarySearchRecursion(int[] tab,int serialMax,int serialMin,int t){
        if(serialMin> serialMax) return -1;
        if(tab[serialMin] == t) return serialMin;
        int mid = (serialMax + serialMin)/2;
        if(tab[mid]<t) return binarySearchRecursion(tab,serialMax,mid+1,t);
        if(tab[mid]==t) return binarySearchRecursion(tab,mid,serialMin,t);
        if(tab[mid]>t) return binarySearchRecursion(tab,mid-1,serialMin,t);
        return 0;
    }
}
