public class reversestring {
    public static void main(String[] args) {
        System.out.println(reversed("whello"));
    }
    static String reversed(String str){

        if(str.isEmpty()){
            return str;
        }

        return reversed(str.substring(1)) + str.charAt(0);
    }
}
