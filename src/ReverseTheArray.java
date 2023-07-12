import java.util.Scanner;

public class ReverseTheArray {
    static int[] reverseArray(int array[])
    {
        int size=array.length;
        int i=0,j=size-1;
        while (i<j)
        {
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int[] array=reverseArray(A);
        for (int i=0;i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
