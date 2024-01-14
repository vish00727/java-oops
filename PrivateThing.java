package OOps;

public class PrivateThing {



 protected   void SomeThing(){
     System.out.println("hi guys how are you");
 }
}



class Cog extends PrivateThing {
     Cog(){
        System.out.println(" hii how are yoy");

    }
    protected void SomeThing() {
        SomeThing();
    }

    public static void main(String[] args) {

         Cog bb=new Cog();


    }




}