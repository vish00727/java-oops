package OOps;

abstract class abc{
        abstract void m1();
        abc(){
            System.out.println(" hii");
        }

    }



    class xyz extends  abc{
        void m1(){
            System.out.println("hello");
        }

    }



    public class ConstructionofAb {
        public static void main(String[] args) {
            abc nn= new xyz();
            nn.m1();


        }
    }


