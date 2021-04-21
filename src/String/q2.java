package String;

public class q2 {
    static Boolean stringCompare(String str1, String str2){
        if(str1 == null || str2 == null){
            return str1 == null && str2 == null;
        }
        int l1 = str1.length();
        int l2 = str2.length();
        if(l1 != l2){
            return false;
        }
        for (int i = 0; i < l1; i++) {

            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Boolean n = stringCompare("yuyu", "yuyu");
        System.out.println(n);
    }

}
