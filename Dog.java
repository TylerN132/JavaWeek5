class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Bark");
    }

    public void greets(Dog another) {
        System.out.println("Bark");
    }

    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}