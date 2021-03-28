import java.util.Arrays;
public class Q4_binaryStringAddition{

     public static void main(String []args){
    //   String one = "110";
    //   String two = "11101";
    String one ="1010", two="1010";
       StringBuilder res = new StringBuilder();
       int i = one.length(), j = two.length();
       int carry=0, sum =0;
       while(i>0 || j>0){
           int one_i=0, two_i=0;
           if(i>0){
               one_i=Character.getNumericValue(one.charAt(--i));
           }
           if(j>0){
               two_i=Character.getNumericValue(two.charAt(--j));
           }
           sum = one_i + two_i + carry;
           System.out.println(one.charAt(i) + " " + one_i + " " + two_i + " " + sum);
           if(sum==2){
               carry = 1;
               sum=0;
           }else if(sum==3){
               sum =1;
               carry =1;
           }else{
               carry =0;
           }
           res.insert(0,sum);
       }
       if(carry !=0){
           res.setCharAt(0,'0');
           res.insert(0,'1');
       }
       System.out.println(res);
     }
}

