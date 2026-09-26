class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String ,String> map=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            List<String> p = knowledge.get(i);
            map.put(p.get(0),p.get(1));
        }
        String ans="";
        String key="";
        Boolean inside=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                inside = true;
            }
            else if(ch==')'){
                inside = false;
                ans+=map.getOrDefault(key,"?");
                key="";
            }
            else if(inside){
                key+=ch;
            }
            else if(!inside){
                ans+=ch;
            }
        }
        return ans;
    }
}