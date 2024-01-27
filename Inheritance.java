package OOps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parent {
     void me(int r){
         for (int i=0; i<r; i++){
             System.out.println(i);
         }

     }



}

class Child{
     static void Pro(int vv){
         for (int i=0; i<vv; i++){
             System.out.println(i);
         }

     }

    public static void main(String[] args) throws IOException {


        BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number1");
        int f=Integer.parseInt(Br.readLine());
        Parent nn=new Parent();
        nn.me(f);

        System.out.println("enter the number");
        int c=Integer.parseInt(Br.readLine());
        Child.Pro(c);

    }
}
