public class Main {
    public static void main(String[] args) {
        String email = "thiagofmj16@outlook.com";
        int position = email.indexOf('@');
        String org = email.substring(position);

        System.out.println(org);



    }
}