public class AdminAuthentication implements Authentication {
    private String adminUsername;
    private String adminPassword;

    public AdminAuthentication(String adminUsername, String adminPassword) {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    @Override
    public boolean login(String adminUsername, String adminPassword) {
        return adminUsername.equals(this.adminUsername) && adminPassword.equals(this.adminPassword) ? true : false;
    }

    @Override
    public void logout() {
        System.out.println("Admin logged out");
    }

    @Override
    public boolean resetPassword(String adminUsername, String oldPassword, String newPassword) {
        if (newPassword.equals(this.adminPassword) || newPassword.equals("")) {
            return false;
        } else if (!this.adminUsername.equals(adminUsername) || !this.adminPassword.equals(oldPassword)) {
            return false;
        } else {
            this.adminPassword = newPassword;
            return true;
        }
    }

}
