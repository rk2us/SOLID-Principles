package solid.SRP;

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        EmailNotifier emailNotifier = new EmailNotifier();
        userRepository.fetchUser();
        emailNotifier.sendEmail();
    }


}


