
 public class Dog extends Animal {

 Dog d = new Dog();

  public void setD(Dog d) {
   this.d = d;
   d.makeNoise();
   d.roam();
   d.eat();
   d.sleep();


  }


  @Override
  public void roam() {

  }
 }







