package hnu.progtech;
//hallo
public class Main {
    public static void main(String[] args) {

        Taschenrechner tr = new Taschenrechner(0);
        tr.add(10);
        System.out.println(tr.getResult());
    }
}
