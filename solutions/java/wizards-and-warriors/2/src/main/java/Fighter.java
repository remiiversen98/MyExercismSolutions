class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {return false;}

    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) return 10;
        return 6;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}
class Wizard extends Fighter {
    boolean vulnerable = super.isVulnerable();

    void prepareSpell() {vulnerable = false;}

    @Override
    boolean isVulnerable() {return vulnerable;}

    @Override
    int getDamagePoints(Fighter fighter) {
        if (vulnerable) return 3;
        return 12;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
