package Graph;

import java.util.*;

public class Alien_Dictionary {
    class Solution{
        public String alienOrder(String[] words) {
            // Write your code here
            HashMap<Character, List<Character>> map=new HashMap<>();
            for (int i = 0; i < words.length; i++) {
                String s=words[i];
                for (int j = 0; j < s.length(); j++) {
                    if(!map.containsKey(s.charAt(j)))
                        map.put(s.charAt(j),new ArrayList<>());
                }
            }
            for (int i = 0; i < words.length-1; i++) {
                String s1=words[i];
                String s2=words[i+1];
                for (int j = 0; j < Math.min(s1.length(),s2.length()); j++) {
                    if(s1.charAt(j)!=s2.charAt(j)){
                        map.get(s1.charAt(j));
                        break;
                    }
                }
            }
            return "";
        }
        public Object TopologicalSort(HashMap<Character,List<Character>> map){
            int in[]=indegree(map);
            StringBuilder sb=new StringBuilder();
            Queue<Character> q=new LinkedList<>();
            for(char ch:map.keySet()){
                if(in[ch-'a']==0){
                    q.add(ch);
                }
            }
            int c=0;
            while(!q.isEmpty()){
                char ch=q.remove();
                c++;
                sb.append(ch);
                for (char nbrs:map.get(ch)){
                    in[nbrs-'a']--;
                    if(in[nbrs-'a']==0);
                }
                return "";
            }
            return null;
        }

        public int [] indegree(HashMap<Character, List<Character>> map){
            int[] in=new int[26];
            for(char key:map.keySet()){
                for(char nbrs:map.get(key)){
                    in[nbrs-'a']++;
                }
            }
            return in;
        }
    }
}
