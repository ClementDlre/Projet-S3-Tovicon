package arenas;

import items.Potion;
import monsters.Ectaplasmo;

public class Arena1 extends Arena {
    public Arena1() {
        super("Carnaval");
        monsters.add(new Ectaplasmo());
        actualMonster = monsters.get(0);
        MReward = monsters.get(0);
        IReward = new Potion();
    }
}
