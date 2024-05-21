package models;

public class Account {
    private String id;
    private String password;
    private String name;
    private float balance;

    public Account(String id, String name, String password, float balance) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
