public class Main {
    public static void main(String[] args) {
        Falcon falcon = new Falcon("Lupin",4,15);
        Elephant elephant = new Elephant("dumbo",20,400);
        Snake snake = new Snake("Cobra",5,2,true);
        elephant.displayInformation();
        snake.displayInformation();
        falcon.displayInformation();
    }
}