package kg.geektech.hw5;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setBossHealth(700);
        boss.setBossDamage(50);
        boss.setBossDefence("magic");

        System.out.println("Boss health: (" + boss.getBossHealth() + ")" +
                " Boss damage: [" + boss.getBossDamage() + "] " + "Boss defence is " + boss.getBossDefence() + ".");

    }



 /*   public Hero createHeroes;
        Hero hero1 = new Hero(250, 20, "kinetic");
        Hero hero2 = new Hero(260, 25, "Medic");
        Hero hero3 = new Hero(270, 15);

        Hero[] array = {hero1, hero2, hero3};

        return = ;*/


}

