public class Hund {
    //Attribute
    String name;
    int alter;

    public Hund(String neuerName, int neuesAlter) {
    this.name = neuerName;
    this.alter = neuesAlter;
}
    //Methoden
    public void bellen() {
        System.out.println("wuff wuff");
    }
    public void friss() {
        System.out.println("mampf");
    }
}
