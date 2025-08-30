public class subsequence {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aghebkdhec";
        if(IsSubsequence(s1,s2,0,0)){
            System.out.println("S1 is a subsequence of s2");
        }
        else{
            System.out.println("s1 is not a subsequence s2");
        }
    }
    static boolean IsSubsequence(String s1, String s2, int i , int j){
        if(i == s1.length()) {
            return true;
        }
            if(j == s2.length()){
                return false;
            }
            if(s1.charAt(i) == s2.charAt(j)){
                return IsSubsequence(s1,s2,i+1,j+1);
            }
            else{
                return IsSubsequence(s1,s2,i,j+1);
            }
    }
}

