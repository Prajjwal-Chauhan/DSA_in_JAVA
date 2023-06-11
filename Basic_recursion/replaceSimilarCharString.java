public class replaceSimilarCharString {

    public static void replaceChar(String s,StringBuilder sb,int i,int n,char pre){
        if(i >= n){
            System.out.println(sb.toString());
            return;
        }
        if(s.charAt(i) == pre) sb.append('#');
        else sb.append(s.charAt(i));
        replaceChar(s, sb, i+1, n, sb.charAt(i));
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "aabbcc";
        sb.append(s.charAt(0));
        replaceChar(s, sb, 1, s.length(), sb.charAt(0));

    }
}
