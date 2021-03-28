import java.util.Arrays;
public class Q1_threeWaySplit{

     public static void main(String []args){
         //5b 4g 5r
        char[] inp = {'b','b','g','b','r','g','r','b','g','g','r','b','r','r'};
        //char[] inp = {'r','b','g','b','r','g','r','b','g','g','r','b','r','b'};
        //char[] inp = {'r','b','g','r'};
        int b=0,u=0,r=inp.length -1;
        int i =0;
        while(i <= r){
            System.out.println("Looking at "+inp[i]);
            if(inp[i]=='r'){
                swap(inp, i, r--);
            }
            else if(inp[i]=='b'){
                swap(inp,i++,b++);
            }
            else{
                i++;
            }
        }
        for(char c: inp){
            System.out.print(c + " ");
        }
     }
     public static void swap(char[] inp, int src, int dst){
         char tmp = inp[dst];
         inp[dst]=inp[src];
         inp[src]=tmp;
     }
}

