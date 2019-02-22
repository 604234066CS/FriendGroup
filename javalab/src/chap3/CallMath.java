package chap3;


public class CallMath {
    public static void main(String[] args) {
        System.out.println("====== Math Test ======");
        System.out.println("PI = "+Math.PI);
        
        int x = Math.max(100, 200);
        System.out.println("Max ="+x);
        
        int a = Math.min(100, 200);
        System.out.println("Min ="+a);
        
        double z = Math.pow(2, 3);
        System.out.println("Power 2,3"+z);
        
        System.out.println("ปัดเศษขึ้น ="+ Math.ceil(Math.PI) );
        
        
        System.out.println("ปัดเศษลง ="+ Math.floor(Math.PI));
        
        
    }
}
