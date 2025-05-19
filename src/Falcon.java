public class Falcon extends Animal {
    int fastestRecordedSpeedInKMpH;
    public Falcon(String name, int age, int fastestRecordedSpeedInKMpH) {
        super(name, age);
        this.fastestRecordedSpeedInKMpH = fastestRecordedSpeedInKMpH;
    }
    public int getFastestRecordedSpeed() {
        return fastestRecordedSpeedInKMpH;
    }
    @Override
    public void makeSound() {
        System.out.println("KKIIIEEEEEEEEEE");
        System.out.println();
    }
    @Override
    public void move() {
        System.out.println("Falcon flies by");
        System.out.println("FWOOMP SWISH SWISH");
        System.out.println();
    }
    @Override
    public void displayInformation() {
        System.out.println("Falcon Name: " + getName());
        System.out.println("Falcon Age: " + getAge());
        System.out.println("Falcon Top Speed: " + getFastestRecordedSpeed() + "km/h");
        System.out.println("Falcons are birds of prey in the genus Falco, which includes about 40 species." +
                " Some small species of falcons with long, narrow wings are called hobbies," +
                " and some that hover while hunting are called kestrels." +
                " Falcons are widely distributed on all continents of the world except Antarctica," +
                " though closely related raptors did occur there in the Eocene." +
                "Adult falcons have thin, tapered wings, which enable them to fly at high speed and change direction rapidly." +
                " Fledgling falcons, in their first year of flying, have longer flight feathers," +
                " which make their configuration more like that of a general-purpose bird such as a broadwing." +
                " This makes flying easier while still learning the aerial skills required to be effective hunters like the adults.");
        System.out.println();
    }
    @Override
    public void naturalHabitat() {
        System.out.println("Falcon's natural habitat");
        System.out.println("Falcons live in nests on cliff sides so that they are able to ");
        System.out.println();
    }
}

