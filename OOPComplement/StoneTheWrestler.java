package OOPComplement;

public class StoneTheWrestler implements WrestlerInterface {


    @Override
    public void themeMusic() {
        System.out.println("Stone cold music");
    }

    @Override
    public void finisher() {
        System.out.println("Stone`s arm bar");
    }

    @Override
    public void payment(int hours) {
        System.out.println("Stone Cold will make $" + hours*300.00 + " for this match");
    }
}
