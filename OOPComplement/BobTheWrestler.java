package OOPComplement;

public class BobTheWrestler implements WrestlerInterface{


    @Override
    public void themeMusic() {
        System.out.println("My name is Bob music");
    }

    @Override
    public void finisher() {
        System.out.println("Bob`s finisher move");
    }

    @Override
    public void payment(int hours) {
        System.out.println("Bob will make $" + hours*200.00 + " for this match");
    }
}
