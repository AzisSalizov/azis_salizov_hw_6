public class Hero extends GameEntity{
    private String heroAttacksType;

    public Hero(int health, int damage, String heroAttacksType) {
        super(health, damage);
        this.heroAttacksType = heroAttacksType;
    }

    public Hero(int health, int damage) {
        super(health, damage);
        this.heroAttacksType = "None";
    }

    public String getHeroAttacksType() {
        return heroAttacksType;
    }
}
