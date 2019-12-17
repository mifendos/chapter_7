package mixed_mesagges;

public class MonsterTestDrive {
    public static void main(String[] args) {

        Monster [] ma = new Monster[3];
        ma [0] = new Vampire();
        ma [1] = new Dragon();
        ma [2] = new Monster();
        for (int x = 0; x < 3; x++) {
            ma[x].frighten(x);
        }
    }
     static class Monster {

        int frighten(int a) {
            System.out.println("Grrrr");
            return 3;

        }
    }
    static class Vampire extends Monster {
        boolean frighting (int x) {
            System.out.println("Beat?");
            return false;
        }

    }

    static class Dragon extends Monster {
        boolean frighting (int x) {
            System.out.println("Fire breathing");
            return true;

        }

    }

}
