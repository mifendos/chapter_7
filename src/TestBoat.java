
 public class TestBoat {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();
        BlueBeryboat b4 = new BlueryBoat();
        MyImprovisatsion b5 = new MyImprovisatsion();
        b2.move();
        b1.move();
        b3.move();
        b4.move();
        b5.move();
    }

    private static class BlueryBoat extends BlueBeryboat {
    }
}

class Boat {
    private int length;
    public void setLength(int len) {
        length = len;
    }
    public int getLength() {
        return length;
    }
    public void move() {
        System.out.print("drift ");
    }
}

class Rowboat extends Boat {
    public void rowTheBoat() {
        System.out.print("stroke natasha");
    }
}

class Sailboat extends Boat {
    public void move() {
        System.out.print("hoist sail ");
    }
}

class BlueBeryboat {
     public void move() {
         System.out.println("strawberry");
     }
}

class MyImprovisatsion extends Boat {
    public void move() { System.out.println("higher");
    }

}