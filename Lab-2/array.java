import java.util.*;
class array{
  public static void main(String[] args) {
    int len;
    System.out.println("Enter the size of the array:");
    Scanner scan=new Scanner(System.in);
    len=scan.nextInt();
    int[] arr=new int[len];
    System.out.println("Enter the numbers in the array:");
    for (int i=0; i<len; i++ ) {
      arr[i]=scan.nextInt();
    }
    int max=arr[0], min=arr[0];
    for(int i=1; i<len; i++){
      if(arr[i]>max)
      max=arr[i];
      else if(arr[i]<min)
      min=arr[i];
    }

    System.out.println("The maximum value in the array is "+max+" and the minimum value is "+min);
}
}
