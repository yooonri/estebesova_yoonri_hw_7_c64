public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero() {
            @Override
            public void applySuperAbility() {
            }
        };
        HavingSuperAbility[] abilities = {new Magic(),new Medic(),new Warrior()};
        for (int i = 0; i < abilities.length; i++) {
            abilities[i].applySuperAbility();
        }
    }
}