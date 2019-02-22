package chap3;

class MultifunctionPrinter{

    private Object newCopy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    static class Fax{
        void sendFaxMethod(){
            System.out.println("sendFax");           
        }
        void cancelFaxMethod(){
            System.out.println("cancelFax");
        }
    }
    
    class ScanMember{
        void scanDocument(){
            System.out.println("scanDocument");
        }
        
    }
    
    void copyDocumemt(int total){
        class copy{
            void makeCopy(){
                System.out.println("Copy");
                
            }
        }
        if(total>5){
            new copy().makeCopy();
        
        }
    }  
}//end class MultifunctionPrinter



//////////////////////////////////////////////////
public class TestMultifunctionPrinter {
    public static void main(String[] args) {
        MultifunctionPrinter.Fax myFaxObj = new MultifunctionPrinter.Fax();
        myFaxObj.sendFaxMethod();
        myFaxObj.cancelFaxMethod();
        MultifunctionPrinter ScanObj = new MultifunctionPrinter();
        MultifunctionPrinter.ScanMember myScanObj = ScanObj.new ScanMember();
        myScanObj.scanDocument();
        
        MultifunctionPrinter mfp = new MultifunctionPrinter();
        mfp.copyDocumemt(10);
        
    }
    
}//end class TestMultifunctionPrinter
