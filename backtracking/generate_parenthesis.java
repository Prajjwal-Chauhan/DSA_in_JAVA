class Solution {
    public void generate(List<String> result,int n,int opening,int closing,StringBuilder output){
        if(output.length() == n*2){
            result.add(output.toString());
            return;
        }
        if(opening < n){
            output.append("(");
            generate(result,n,opening+1,closing,output);
            output.deleteCharAt(output.length() - 1);
        }

        if(closing < opening){
            output.append(")");
            generate(result,n,opening,closing+1,output);
            output.deleteCharAt(output.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generate(result,n,0,0,sb);

        return result;
    }
}
