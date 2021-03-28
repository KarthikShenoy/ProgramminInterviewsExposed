import java.util.Arrays;
public class Q5_multiplyArray{

     public static void main(String []args){
        int[] two = {2,0,2}, one = {-9,1};
        boolean setNegative = one[0]<0 ^ two[0]<0;
        two[0]=Math.abs(two[0]);
        one[0]=Math.abs(one[0]);
        int[] res_a = new int [one.length + two.length];
        
        int carry = 0;
        
        int offset =0;
        int c =0;
        for(int i = one.length-1; i >=0; --i){
             c = res_a.length -1- offset;
            for(int j = two.length-1; j>=0;--j){
                int res = (one[i] * two[j]) + carry;
                
                carry = res/10;
                res = res % 10;
                res_a[c] = res+res_a[c--];
            }
            if(carry!=0){
                res_a[c]=carry;
                carry =0;
            }
            offset++;
        }
        if(setNegative){
            res_a[c]=res_a[c]*-1;
        }
        for(int val:res_a){
            System.out.print(val);
        }
     }
}

