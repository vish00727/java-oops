package OOps;

public class CopyC {

    int a; String s;
    CopyC(int o, String c){
        a=o;
        s=c;
    }
    CopyC(CopyC ref){
        a=ref.a ;
        s=ref.s;
        System.out.println(a+" "+" "+s);
    }
}

class D{
    public static void main(String[] args) {
        CopyC g= new CopyC(16, "tal");
        CopyC g2 =new CopyC(g);
        System.out.println(g.a+" "+g.s);
    }
}
