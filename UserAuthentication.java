public class UserAuthentication implements Authentication {
    private String username;
    private String password;

    public UserAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        return username.equals(this.username) && password.equals(this.password) ? true : false;
    }

    @Override
    public void logout() {
        System.out.println("User logged out");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if (newPassword.equals(this.password) || newPassword.equals("")) {
            return false;
        } else if (!this.username.equals(username) || !this.password.equals(oldPassword)) {
            return false;
        } else {
            this.password = newPassword;
            return true;
        }
    }

}
