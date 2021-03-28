import java.util.Arrays;
public class Q2_fourWaySplit{

     public static void main(String []args){
         //a3 b2 c2 d2
         char[] inp = {'a','c','b','d','a','d','b','c','a','b'};
         //a and d
         int a =0, d= inp.length;
         int i =0;
         while(i < d){
             if(inp[i]=='a'){
                 swap(inp,i++,a++);
             }else if(inp[i]=='d'){
                 swap(inp, i,--d);
             }else{
                 i++;
             }
         }
         int b = a,c=d;
         i =a;
         while(i<c){
             if(inp[i]=='b'){
                 swap(inp, i++,b++);
             }else{
                 swap(inp,i,--c);
             }
         }
        for(char ch: inp){
            System.out.print(ch + " ");
        }
     }
     public static void swap(char[] inp, int src, int dst){
         char tmp = inp[dst];
         inp[dst]=inp[src];
         inp[src]=tmp;
     }
}

