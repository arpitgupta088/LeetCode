class Solution {
    public boolean isAnagram(String s, String t) {
        //dono strings ki length :-
        int m = s.length();
        int n = t.length();
        if(m!=n){
            return false;
        }
        else{
            int count[]=new int[26];   // [0,1,2,....26] array
            for (int i=0; i<m; i++){    //s ko travel kiya
                count[s.charAt(i)-'a']++;   //Ascii value se check hoga e.g. 97-97=0 
            }
            for(int i=0; i<n;i++){
                count[t.charAt(i)-'a']--;
            }
            for(int i=0;i<count.length;i++){
                if(count[i]!=0){
                    return false;
                }
            }
            return true;
        }
    }
}