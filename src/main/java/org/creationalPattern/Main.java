package org.creationalPattern;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    Deque<String> st = new ArrayDeque<>();
    public String simplifyPath(String path) {
        String[] temp = path.split("/");
        for (String str : temp){
            if(str.equals("") || str.equals(".")) continue;
            else if(str.equals("..") && !st.isEmpty()) st.pollLast();
            else if(str.equals("..")) continue;
            else st.offerLast(str);
        }
        if(st.isEmpty()) return "/";
        StringBuilder ans = new StringBuilder("/");
        while (!st.isEmpty()){
            ans.append(st.pollFirst());
            if(st.size()!=0) ans.append("/");
        }
        return ans.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.simplifyPath("/a/./b/../../c/");
    }
}