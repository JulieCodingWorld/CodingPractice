class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        for (int i =S.length() - 1, flag = K + 1; i >= 0; i--){
            if(S.charAt(i) == '-') continue;
            if(--flag == 0) {
                sb.append("-");
                flag = K;
            }
            sb.append(Character.toUpperCase(S.charAt(i)));
        }
        return sb.reverse().toString();
    }
}