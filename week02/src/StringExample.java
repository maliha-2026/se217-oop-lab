public class StringExample {
    public static void main(String[] args) {
        String S = "I@#love@#Bangladesh";

        String [] a = S.split("@");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);

        }
    }
}
