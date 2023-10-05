import java.util.Scanner;
public class TASHA {
    public static void main(String[] args) {
        
        String username = "user123";
        String password = "pass123";
        Scanner scanner = new Scanner(System.in);
        
        int attempts = 3;
        boolean loggedIn = false;
        while (attempts > 0) 
        {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();
            
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();
            
            if (inputUsername.equals(username) && inputPassword.equals(password)) 
            {
                loggedIn = true;
                break;
            } else {
                System.out.println("Incorrect username or password. " + (--attempts) + " attempts remaining.");
            }
        }
        if (loggedIn) {
            System.out.println("Login successful! Welcome, " + username + "!");
        } else {
            System.out.println("Login failed. You've exceeded the maximum number of attempts.");
        }
        
        scanner.close();
    }
}