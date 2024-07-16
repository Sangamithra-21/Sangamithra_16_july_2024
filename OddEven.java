import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {
        int[] arr={13,-3,-5,-100,-1};
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                int maxIndex=findMax(i,arr);
                int temp=arr[i];
                arr[i]=arr[maxIndex];
                arr[maxIndex]=temp;
            }
            else {
                int minIndex=findMin(i,arr);
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int findMin(int i, int[] arr) {
        int index=i;
        int min=arr[i];
        for(int j=i;j<arr.length;j=j+2)
        {
            if(arr[j]<min)
            {
                min=arr[j];
                index=j;
            }
        }
        return index;
    }

    private static int findMax(int i, int[] arr) {
        int index=i;
        int max=arr[i];
        for(int j=i;j<arr.length;j=j+2)
        {
            if(arr[j]>max)
            {
                max=arr[j];
                index=j;
            }
        }
        return index;
    }
}
