import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(), a=0, b=0, n=0;
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            int exp = 1, base = 2, term1 = a+(1*b), expresult = term1, finalres = term1;
            System.out.print(term1+" ");
            expresult = 1;
            for(int q=2; q<=n; q++){
                for(; exp!=0; exp--){
                    expresult *= base;
                }
                exp++;
                finalres += (expresult*b);
                System.out.print(finalres+" ");
            }
            System.out.println();
        }
    }
}