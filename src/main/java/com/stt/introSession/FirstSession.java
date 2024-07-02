public class FirstSession {


    public static void main(String[] args) {
        System.out.println("Automation Testing");

        FirstSession firstSession = new FirstSession();
        firstSession.loginTest();
        payment();
        FirstClassReference.sum();
        String s = FirstClassReference.getText();
        System.out.println(s);

        FirstClassReference firstClassReference = new FirstClassReference();
        firstClassReference.total(17, 15);
        firstClassReference.verifyTextPresentOnThePage(" ");
    }

    public static void payment(){
        System.out.println("Payment successful");
    }

    public void loginTest(){
        System.out.println("Login Successful");
    }

}
