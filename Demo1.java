package OOps;




    interface  A{
        void m1();

        void m2();

        void m3();


    }

    class  B implements A{
        public void m1(){
            System.out.println("m1");

        }

        @Override
        public void m2() {
            System.out.println("m2");
        }

        @Override
        public void m3() {
            System.out.println("m3");
        }
    }


    public class Demo1 {
        public static void main(String[] args) {
            A obj= new B();
            obj.m1();
            obj.m3();
            obj.m2();

        }


    }


