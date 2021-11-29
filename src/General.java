
public class General extends Human {
    private String fullName;
    private boolean fightAbility;

    public General(String name) {
        fullName = name;
    }

    public General(String name, boolean fightAbility) {
        fullName = name;
        this.fightAbility = fightAbility;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFightAbility(boolean fightAbility) {
        this.fightAbility = fightAbility;
    }

    @Override
    public boolean canFight() {
        return fightAbility;
    }

    @Override
    public String report() {
        return "I'm general. No one above me." + (canFight() ? "I can fight." : "I can't fight.");
    }
}
