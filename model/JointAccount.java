package gr.aueb.cf.model;

public class JointAccount extends Account {
    private User secondHolder = new User();

    public JointAccount() {}

    public JointAccount(User holder, String iban, double balance, User secondHolder) {
        super(holder, iban, balance);
        this.secondHolder = secondHolder;
    }

    public User getSecondHolder() {
        return secondHolder;
    }

    public void setSecondHolder(User secondHolder) {
        this.secondHolder = secondHolder;
    }

    @Override
    public String toString() {
        return "JointAccount{" + getHolder() +
                "secondHolder=" + secondHolder + ", iban: " + getIban() +
                ", balance: " + getBalance() +
                '}';
    }

    @Override
    protected boolean isSsnValid(String ssn) {
        return super.isSsnValid(ssn) || secondHolder.getSsn().equals(ssn);
    }
}
