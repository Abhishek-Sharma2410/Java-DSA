public class stringsconcatenation{
    public static void main(String args[]){
        String firstName = "Abhishek";
        String lastName = "Sharma";
        // This is the simple method of conctenation of two strings 
        // String fullName = firstName + " " +lastName;
        // This is the function for concatenation of two strings using string function
        String newFullName = firstName.concat(lastName);
        System.out.println(newFullName);
    }
}