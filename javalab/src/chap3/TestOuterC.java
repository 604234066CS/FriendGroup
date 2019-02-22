package chap3;

class OuterC{
    int outerAttribute1 = 5;
    static int outerAttribute2 = 10;
    
    void outerMethod1(){
        System.out.println("OuterC : outerMethod1()");
    }
    
    static void outerMethod2(){
        System.out.println("OuterC : outerMethod2()");
    }
    
    void outerMethod3(final int x, boolean y, final int Z){
        class LocallInner{
            void showDetails(){
                System.out.println(x+","+Z);
                System.out.println(outerAttribute1 +","+ outerAttribute2);
                outerMethod1();
                outerMethod2();
                
            }
        }
            if(y){
                new LocallInner().showDetails();
            }else{
                outerMethod1();
            }
    }


    }
public class TestOuterC {
    public static void main(String[] args) {
        OuterC outObj = new OuterC();
        outObj.outerMethod3(11, true, 33);
    }
    
}
