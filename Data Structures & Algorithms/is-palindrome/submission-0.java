class Solution {
    private String format(String s){
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == ' ' || !Character.isLetterOrDigit(ch)){
                continue;
            }
            str.append(Character.toLowerCase(ch));
        }
        return str.toString();
    }
    public boolean isPalindrome(String s) {
        String str = format(s);
        int i = 0; 
        int j = str.length() - 1;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
