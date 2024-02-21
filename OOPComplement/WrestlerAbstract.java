package OOPComplement;

// if there`s a mixture of unique and generalized methods that your subclasses
// will inherit then you should use an abstract Class as the super class.
public abstract class WrestlerAbstract {
    public void paymentForWork(int hours){
        System.out.println("The Wrestler will make $" + hours*250.00 + " for tonight's match");
    }

    public abstract void themeMusic();

    public abstract void finisher();
}
