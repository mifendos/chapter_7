
 public class Wolf extends Animal {

     Wolf w = new Wolf();

     public Wolf getW() {
         return w;

     }

     public void setW(Wolf w) {
         this.w = w;
         w.makeNoise();
         w.roam();
         w.eat();
         w.sleep();

     }

     @Override
     public void roam() {

     }
 }





