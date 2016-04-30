package loopandarrays.lidasorn;
import java.util.Scanner;
public class LoopAndArraysLidaSorn {
    public static void main(String[] args) {
        average();
        
        printArray(10);//input number of row you want to print
        
        //store number in an array
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        //declear and creat array
        String hasZero = "";
        int[] a = new int[10];
        for(int i = 0; i < a.length; i++){
            a[i] = input.nextInt();
            if(a[i] == 0){
                hasZero = "0";
            }
        }
        //get array output from the input array a
        int[] distinct = eliminateDuplicates(a);
        System.out.print("The distinct numbers are: "+hasZero+" ");
        for(int j = 0; j < distinct.length; j++){
            if(distinct[j] != 0){
                System.out.print(distinct[j]+" ");
            }
        }
    
    }//end of main
    public static void average(){
        //store number in array
        Scanner input = new Scanner (System.in);
        double[] a = new double[10];
        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < a.length; i++){
            a[i] = input.nextDouble();
        }
        //compute average
        double sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        System.out.printf("The average is %.2f\n",sum/a.length);
        //print differnces
        System.out.print("Differences: ");
        for(int i = 0; i < a.length; i++){
            System.out.printf("%.2f  ",sum/a.length - a[i]);
        }
        //print square of differnces
        System.out.print("\nSquare of differences: ");
        for(int i = 0; i < a.length; i++){
            System.out.printf("%.2f  ",(sum/a.length - a[i])*(sum/a.length - a[i]));
        }
        //the average of the square
        double square = 0;
        for(int i = 0; i < a.length; i++){
            square += (sum/a.length - a[i]) * (sum/a.length - a[i]);
        }
        System.out.printf("\nAverage of the square is %.2f\n\n",square/10);          
    }//end of average
    //print array
    public static void printArray(int n){
        int[] s = new int[n];
        int[] t = new int[n];
        //asign random value is array s
        for (int i = 0; i < n; i++){
            s[i] = (int)(1 + 99*Math.random());
        }
        //asign random value is array t
        for (int j = 0; j < n; j++){
            t[j] = (int)(1 + 99*Math.random());
        }
        //print the two array and sum
        System.out.println("       S       T      Sum:");
        for (int j = 0; j < n; j++){
            System.out.printf("%8d%8d%8d\n",s[j],t[j],s[j]+t[j]);
        }
    }//end of print array
    public static int[] eliminateDuplicates(int[] numbers){
        int[] distinct = new int[numbers.length];
        distinct[0] = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(check(numbers[i],distinct)){
                continue;
            }
            distinct[i] = numbers[i];
        }
        return distinct;
    }//end of eliminateDuplicates
    //check whether integer exist in an array
    public static boolean check(int a, int[] b){
        for(int i = 0; i < b.length; i++){
            if(b[i] == a)
                return true;
        }
        return false;
    }//end of check  
}
