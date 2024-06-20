public class Weapon {
    private WeaponEnum type;
    private String name;

    public Weapon(WeaponEnum type, String name) {
        this.type = type;
        this.name = name;
    }

    public WeaponEnum getType() {
        return type;
    }

    public void setType(WeaponEnum type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type=" + type +
                ", name='" + name + '\'' +
                '}';
    }
}
