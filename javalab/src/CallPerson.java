public class CallPerson {
        public static void main(String[] args) {
        Person amobj = new Person();
        System.out.println(">> "+amobj);
        amobj.idCard = "1234567891010";
        amobj.name = "Sararat";
        amobj.lastName = "Boonyodying";
        amobj.sex = 'F';
        amobj.age = 20;
        amobj.address = "41/1 Moo 2 Huasai Nakhonsrithammarat 80170";
        
        System.out.println("Id Card :"+amobj.idCard);
        System.out.println("Name :"+amobj.name);
        System.out.println("Last Name :"+amobj.lastName);
        System.out.println("Sex :"+amobj.sex);
        System.out.println("Age :"+amobj.age);
        System.out.println("Adress :"+amobj.address);
        
        amobj.run();
        amobj.eat();
        amobj.walk();
        
    }
    
}
