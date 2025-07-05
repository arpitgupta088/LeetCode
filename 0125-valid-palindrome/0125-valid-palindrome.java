class Solution {
    //to check if char is alphanumeric
    public boolean isAlphaNum(char ch){
        return (ch >= '0' && ch <='9') ||
        (ch >= 'A' && ch <='Z') ||
        (ch >= 'a' && ch <='z');
    }
    //to check if str is valid palind.
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            //skip non aplhanum charcters i.e. @, #, % etc
            while(start<end && !isAlphaNum(s.charAt(start))){
                start++;
            }
            while(start<end && !isAlphaNum(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
