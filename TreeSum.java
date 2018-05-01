import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ThreeSum {

    public static void FindTripletSum(int arr[],ArrayList<ArrayList<Integer > > result,int target){
        int numberOfElement = arr.length;
        for(int i = 0;i<numberOfElement-2;i++){
            int j = i+1;//pointing to next element to i
            int k = numberOfElement-1;//pointing to last element
            while(j < k){
                if(arr[i]+arr[j]+arr[k]==target){
                    //result.add(new ArrayList<Integer>());
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    al.add(arr[j]);
                    al.add(arr[k]);
                    result.add(al);
                  
                    j++;
                    k--;
                }
                else if(arr[i]+arr[j]+arr[k]<target){
                    j++;
                }
                else{
                    k--;
                }
            }   
        }
}
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int numberOfElement = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[numberOfElement];
        for(int i =0;i<numberOfElement;i++){
            arr[i] = sc.nextInt();
        }
       
        Arrays.sort(arr);
       
        if(numberOfElement < 3){
            System.out.println("No of Element is lesser than 3");
        }
        ArrayList<ArrayList<Integer> > result =new ArrayList<ArrayList<Integer>>();
        FindTripletSum(arr,result,target);
       
        for(ArrayList<Integer> al : result){
            for(int c : al){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
   
}



