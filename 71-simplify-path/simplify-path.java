class Solution {
    public String simplifyPath(String path) {
        // String res = "";
        String [] parts = path.split("/");
        Stack<String> st = new Stack<>();
        // System.out.println(Arrays.toString(parts));//[,"home"]

        for(String part : parts){
            System.out.println(part);
           if(part.equals(".") || part.equals("")){
            continue;
           } 
           else if(part.equals("..")){
            if(!st.isEmpty()){
                st.pop();
            }
           }else{
            st.push(part);
           }
        }
        // System.out.println("stackkkkkkkkkkkk");
        // System.out.println(st);

        return "/" + String.join("/",st);
    }
}