package ejer.ejer1.login_v2.java.model;

public class Usuario {
    private String login;
    private String password;
    private int blocked;

    public Usuario(String login, String password, int blocked) {
        this.login = login;
        this.password = password;
        this.blocked = blocked;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getBlocked() {
        return blocked;
    }

    public void setBlocked(int blocked) {
        this.blocked = blocked;
    }
}