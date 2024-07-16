import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;



public class SortArray {
    public static void main(String[] args) {
        int[] arr={7,10,13,22,17,31};
        int[] prime=new int[arr.length];
        List<Integer> primeNo = new ArrayList<>();
        generatePrime(primeNo);
        for(int i=0;i<arr.length;i++)
        {
           int num=nearPrime(arr[i],primeNo);
           prime[i]=num;
        }

        for(int i=0;i<arr.length;i++)
        {
            int minIndex=findmin(arr,prime,i);
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

            int temp1=prime[minIndex];
            prime[minIndex]=prime[i];
            prime[i]=temp1;
        }
       // System.out.println(Arrays.toString(prime));
        System.out.println(Arrays.toString(arr));

    }

    private static int findmin(int[] arr, int[] prime, int i) {
        int min=prime[i];
        int index=i;
        for(int j=i+1;j<prime.length;j++)
        {
            if(prime[j]<min)
            {
                min=prime[j];
                index=j;
            }
        }
        return index;
    }

    private static int nearPrime(int i,List<Integer> list) {
        int left = i;
        while(!list.contains(left))
        {
            left--;
        }
        int right =i;
        while(!list.contains(right))
        {
            right++;
        }
        return Math.min(Math.abs(i-left),Math.abs(i-right));
    }

    private static void generatePrime(List<Integer> primeNo) {
        for(int i=1;i<=50;i++)
        {
            if(check(i))
            {
                primeNo.add(i);
            }
        }
    }
    private static boolean check(int a)
    {
        int count=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                count++;
                if(count==2)
                {
                    return false;
                }
            }
        }
        return true;
    }

}
