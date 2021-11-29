public class Soldier extends Commander {
    private String rank = "Recruit";

    public Soldier(String name, Human head) {
        super(name, head);
    }

    public Soldier(String name, Human head, String rank) {
        super(name, head);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String report() {
        return "My general is " + getHead().getFullName() + "." + (canFight() ? "I can fight." : "I can't fight.");
    }
}
