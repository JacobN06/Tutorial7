public class Snake extends Animal {
    int length;
    Boolean venomous;
    public Snake(String name, int age, int length, Boolean venimous) {
        super(name, age);
        this.length = length;
        this.venomous = venimous;
    }
    public int getLength() {
        return length;
    }
    public String isVenimous() {
        return venomous.booleanValue() ? "yes" : "no";
    }
    @Override
    public void makeSound() {
        System.out.println("Hisssssssssssssss");
        System.out.println();
    }
    @Override
    public void move() {
        System.out.println("Snake moves");
        System.out.println("slither slither");
        System.out.println();
    }
    @Override
    public void displayInformation() {
        System.out.println("Snake Name: " + getName());
        System.out.println("Snake Age: " + getAge());
        System.out.println("Snake Length in M: " + getLength());
        System.out.println("Snake Venimous?: " + isVenimous());
        System.out.println("Snakes are elongated limbless reptiles of the suborder Serpentes." +
                " Cladistically squamates, snakes are ectothermic, amniote vertebrates covered in overlapping scales much like other members of the group." +
                " Many species of snakes have skulls with several more joints than their lizard ancestors and relatives," +
                " enabling them to swallow prey much larger than their heads (cranial kinesis)." +
                " To accommodate their narrow bodies, snakes' paired organs (such as kidneys) appear one in front of the other instead of side by side," +
                " and most only have one functional lung.");
        System.out.println();
    }
    @Override
    public void naturalHabitat() {
        System.out.println("Snake's natural habitat");
        System.out.println("Snakes are found on every continent with the exception of Antartica." +
                "The only excemption to this are some larger islands such as greenland, New Zealand, and a few more");
        System.out.println();
    }
}
