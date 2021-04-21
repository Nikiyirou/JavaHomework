package String;

public class q4 {
    public static void main(String[] args) {
        String[] strArray = {"a", "b", "hello", "world"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strArray.length; i++){
            sb.append(strArray[i]);
        }
        System.out.println(sb.toString());
    }

}
