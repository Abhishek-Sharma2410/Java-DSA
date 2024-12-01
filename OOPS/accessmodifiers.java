public class accessmodifiers{
    public static void main(String args[]){
        bankAccount myAccount = new bankAccount();
        myAccount.userName = "Abhishek Sharma";
        myAccount.changePassword("Abhishek@1234");
        myAccount.printDetails();
    }
}

class bankAccount{
    public String userName;
    private String password;
    public void changePassword(String newPass){
        password = newPass;
    }
    void printDetails(){
        System.out.println(this.userName);
        System.out.println("You Don't have authority to see the password");
    }
}