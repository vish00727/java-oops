package OOps;

public class Private23 {

    void m1(){
        System.out.println("Private 23 m1");

        m2();
    }

    private void m2(){
        System.out.println("Private 23 m2");
    }
}

class XYz extends Private23{


    @java.lang.Override
    void m1() {
        System.out.println("m1 xyz");
        m2();
    }

    private void m2(){
        System.out.println("m2 xyz");
    }
}



class ttt{


    public static void main(String[] args) {
        Private23 bb= new Private23();
//        bb.m1();
        Private23 obj=new XYz();
        obj.m1();


    }
}


