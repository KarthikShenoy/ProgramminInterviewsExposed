import java.util.Arrays;
public class Q3_arrayNumberAdd{

     public static void main(String []args){
        int[] inp = {9,9,9};
        
        int i = inp.length -1;
        System.out.println(i);
        int sum = 0;
        int carry = 1;
        while(carry!=0 && i >=0){
            sum = inp[i] + carry;
            carry = sum /10;
            sum = sum %10;
            inp[i] = sum;
            i--;
        }
        if(carry!=0){
            int[] newInp = new int[inp.length+1];
            newInp[0]=carry;
            for( i = 1; i < newInp.length; i++){
                newInp[i] = inp[i-1];
            }
            inp = newInp;
        }
        for(int in : inp){
            System.out.print(in + " ");
        }
     }
}

