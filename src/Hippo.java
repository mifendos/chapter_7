
 public class Hippo extends Animal {

    Hippo h = new Hippo();

     public Hippo getH() {
         return h;
     }

     public void setH(Hippo h) {
        this.h = h;
        h.makeNoise();
        h.roam();
        h.eat();
        h.sleep();


    }


     @Override
     public void roam() {

     }
 }






