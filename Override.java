package OOps;



   public class Override {
        void  draw(){
            System.out.println("saniya");

        }

    }

    class  square extends OOps.Override {


        void draw(){
//      super.draw();
            System.out.println("disha ");

        }

    }

    class Angel{
        public static void main(String[] args) {
            OOps.Override nn=new square();
            nn.draw();
        }
    }


