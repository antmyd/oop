public class Main {
    public static void main(String[] args) {
        //um oop zu verstehen: muss mna Klassen, Objekte, Konstruktoren verstehen
        //oop=programmierstil
        
    
       //Konstruktor
       Hund objektVonTypHund = new Hund("Bello", 7);
       System.out.println(objektVonTypHund.name);
       System.out.println(objektVonTypHund.alter);

       Hund objektVonTypHund2 = new Hund("Mars", 6);
       System.out.println(objektVonTypHund2.name);
       System.out.println(objektVonTypHund2.alter);
    }
}