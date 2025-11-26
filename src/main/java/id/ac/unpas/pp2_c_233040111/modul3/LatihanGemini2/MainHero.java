package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini2;

public class MainHero {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Layla", 100, 10);
        Hero hero2 = new Hero("Yin", 100, 5);

        hero1.attack(hero2);

        hero2.getName();
        hero2.getHp();

        hero2.attack(hero1);

        hero1.getName();
        hero1.getHp();
    }
}
