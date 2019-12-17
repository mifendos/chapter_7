
 public class Cat extends Animal {


  private static final Object makeNoise = 2;
  private static final Object eat = 4;
  private static final Object roam = 5
          ;

//  public Cat(String name, int sleep) { super(sleep, makeNoise, eat, roam); }

  public Cat() {
   super();
  }

  public static Object getEat() {
   return eat;
  }
 }

