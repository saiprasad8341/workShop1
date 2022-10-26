public class ReverseString {
    public static void main(String[] args) {
        String name = "Saiprasad";
        String temp = "";
        char ch;

        for (int i = 0; i < name.length(); i++){
            ch = name.charAt(i);//s a
            temp = ch + temp; // s + "" //
        }
        System.out.println(temp);
    }
}
