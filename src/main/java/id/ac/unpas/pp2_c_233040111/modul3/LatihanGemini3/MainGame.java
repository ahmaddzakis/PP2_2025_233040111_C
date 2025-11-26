package id.ac.unpas.pp2_c_233040111.modul3.LatihanGemini3;

public class MainGame {
    public static void main(String[] args) {
        Medic medic1 = new Medic("Dr. Stone");
        Survivor survivor1 = new Survivor("Ucup", 10);

        medic1.obati(survivor1);
        medic1.obati(survivor1);
        medic1.obati(survivor1);
        medic1.obati(survivor1);
    }
}
