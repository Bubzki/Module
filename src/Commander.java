

public class Commander extends General {
    private Human head;

    public Commander(String name, Human head) {
        super(name);
        this.head = head;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    @Override
    public String report() {
        return "My general is " + getHead().getFullName() + "." + (canFight() ? "I can fight." : "I can't fight.");
    }
}
