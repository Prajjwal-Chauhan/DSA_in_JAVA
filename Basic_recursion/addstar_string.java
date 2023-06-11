public class addstar_string {

    public static void addstar(String s,StringBuilder sb,int i,int n,char pre){
        if(i >= n){
            System.out.println(sb.toString());
            return;
        }
        if(s.charAt(i) == pre) sb.append('*');
        sb.append(s.charAt(i));
        addstar(s, sb, i+1, n, sb.charAt(sb.length()-1));
    }
    public static void main(String[] args) {
         StringBuilder sb = new StringBuilder();
        String s = "aabbcc";
        sb.append(s.charAt(0));
        addstar(s, sb, 1, s.length(), sb.charAt(0));
    }
}
