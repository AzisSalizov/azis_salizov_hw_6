public class Main {
    public static void main(String[] args) {

        Weapon bossWeapon = new Weapon(WeaponEnum.FIRE_WEAPON , "UMP");
        Weapon skeletonWeapon1 = new Weapon(WeaponEnum.CHEMICAL_WEAPON , "Mustard gas");
        Weapon skeletonWeapon2 = new Weapon(WeaponEnum.CHEMICAL_WEAPON , "Mustard gas");
        Boss boss = new Boss(500, 50, bossWeapon);

        boss.printInfo();

        Skeleton skeleton1 = new Skeleton(300, 40, skeletonWeapon1, 5);
        Skeleton skeleton2 = new Skeleton(240, 35, skeletonWeapon2, 4);
        skeleton1.printInfo();
        skeleton2.printInfo();

        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() +
                    ", Damage: " + hero.getDamage() +
                    ", Attacks Type: " + hero.getHeroAttacksType());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(200, 30, "Physical");
        Hero hero2 = new Hero(150, 25);
        Hero hero3 = new Hero(180, 20, "Kinetic");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}
