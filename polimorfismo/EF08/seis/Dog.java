package polimorfismo.EF08.seis;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }
    
    public void greets(Dog another) {
        System.out.println("Woooooof");    
    }
}
