package kg.geektech.hw5;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setBossHealth(700);
        boss.setBossDamage(50);
        boss.setBossDefence("magic");

        System.out.println("Boss health: (" + boss.getBossHealth() + ")" +

                " Boss damage: [" + boss.getBossDamage() + "] " +

                "Boss defence is " + boss.getBossDefence() + ".");

    }

}

