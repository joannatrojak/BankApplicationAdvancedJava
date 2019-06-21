package pl.lodz.uni.math.BankApplication.User;

abstract class User {
    private String userLogin;
    private String userPassword;
    private String userType;

    public String getUserLogin(){
     return this.userLogin;
    }
    private int countLettersInLogin(String loginToBeSet){
        return loginToBeSet.length();
    }
    private boolean validateLoginOrPassword(String toBeValidated){
        return countLettersInLogin(toBeValidated) >= 6;
    }
    public void setUserLogin(String userLoginToSet){
        if(validateLoginOrPassword(userLoginToSet)){
            this.userLogin = userLoginToSet;
        }
    }
    public void setUserPassword(String userPaswordToBeSet) {
        if (validateLoginOrPassword(userPaswordToBeSet)){
            this.userPassword = userPaswordToBeSet;
        }
    }
    public String getUserPassword() {
        return this.userPassword;
    }
}
