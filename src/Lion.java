
 public class Lion extends Animal {

    Lion l = new Lion();

    public Lion getL() {
        return l;
    }

    public void setW(Lion l) {
        this.l = l;
        l.makeNoise();
        l.roam();
        l.eat();
        l.sleep();


    }


     @Override
     public void roam() {

     }
 }





