package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini2;

public class Hero {
    private String name;
    private double hp;
    private double attackPower;

    public Hero(String name, double hp, double attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public String getName() {
        System.out.println("Nama Hero: " + this.name);
        return this.name;
    }

    public double getHp() {
        System.out.println("Sisa HP " + this.name + " adalah " + this.hp);
        return this.hp;
    }

    public void attack(Hero enemy) {
        enemy.hp -= this.attackPower;
        System.out.println(this.name + " menyerang " + enemy.name + "! HP " + enemy.name +" berkurang sebesar " + this.attackPower);
    }

}
