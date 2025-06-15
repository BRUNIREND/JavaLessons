public class UserAccount {
    private String username;
    private String password;
    private String email;

    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }

    public String getemail(){
        return email;
    }

    public void setUsername(String newUserName){
        username = newUserName;
    }

    public void setPassword(String oldPasswordForCheck,String newPassword){
        if (password.equals(oldPasswordForCheck)){
            if (newPassword.length() >= 8 && newPassword.charAt(0) == newPassword.toUpperCase().charAt(0)){
                password = newPassword;
            }
        }
    }
    public void setEmail(String newEmail){
        if (newEmail.contains("@")){
            email = newEmail;
        }
    }
}
