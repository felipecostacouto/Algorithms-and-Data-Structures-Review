package OOPComplement;

public class Main {

    public static void main(String[] args){
        WrestlerAbstract wrestlerAbs = new KaneTheWrestler();
        WrestlerInterface wrestlerInt = new StoneTheWrestler();
        WrestlerInterface wrestlerInt2 = new BobTheWrestler();

        wrestlerAbs.themeMusic();
        wrestlerAbs.finisher();
        wrestlerAbs.paymentForWork(6);
        System.out.println("_________________\n");

        wrestlerInt.themeMusic();
        wrestlerInt.finisher();
        wrestlerInt.payment(4);
        System.out.println("_________________\n");

        wrestlerInt2.themeMusic();
        wrestlerInt2.finisher();
        wrestlerInt2.payment(4);
    }
}
