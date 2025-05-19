public class Elephant extends Animal {
    int weight;
    public Elephant(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    @Override
    public void makeSound() {
        System.out.println("Elephant Trumpet sound");
        System.out.println();
    }
    @Override
    public void move() {
        System.out.println("Elephant moves");
        System.out.println("THUMP THUMP THUMP THUMP");
        System.out.println();
    }
    @Override
    public void displayInformation() {
        System.out.println("Elephant Name: " + getName());
        System.out.println("Elephant Age: " + getAge());
        System.out.println("Elephant Weight in tons: " + weight);
        System.out.println("Elephants are the largest living land animals." +
                " Three living species are currently recognised:" +
                " the African bush elephant (Loxodonta africana)," +
                " the African forest elephant (L. cyclotis)," +
                " and the Asian elephant (Elephas maximus)." +
                " They are the only surviving members of the family Elephantidae and the order Proboscidea;" +
                " extinct relatives include mammoths and mastodons." +
                " Distinctive features of elephants include a long proboscis called a trunk, tusks, large ear flaps, pillar-like legs, and tough but sensitive grey skin.");
        System.out.println();
    }
    @Override
    public void naturalHabitat() {
        System.out.println("Elephant natural habitat");
        System.out.println("Elephants primarly live in african and in asia, in the bush and in the jungle");
        System.out.println();
    }
}
