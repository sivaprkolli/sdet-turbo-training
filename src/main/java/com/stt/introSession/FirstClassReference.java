public class FirstClassReference {
    int i=5;
    String s = "Selenium";
    char c = 'T';
    boolean b = true;
    float f = 11.2f;
    double d = 11.5;

    public static void sum(){
        int a =10,b=5, c;
        c = a+b;
        System.out.println("c value :: " + c);
    }

    public static String getText(){
        String str = "Test Automation";
        return str;
    }

    public int total(int e, int f){
        int d = e*f;
        System.out.println("d value :: "  +d);
        return d;
    }

    public boolean verifyTextPresentOnThePage(String text){
        System.out.println(text.isEmpty());
        System.out.println(text.isBlank());
        return text.isEmpty();
    }

}
