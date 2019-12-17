public abstract class Animal {

    public static int counter;

    private int sleep;

    private String eat;

    private String roam;

    private String makeNose;



    public Animal() {

    }

    public static void getCounter() {

    }


    public void eat() {
    }

    public void makeNoise() {
    }

    public void roam() {
    }

    public void sleep() {

        Animal[] animals = new Animal[5];


        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();


        for (int i = 0; i < animals.length; i++) {


        }

    }
}






