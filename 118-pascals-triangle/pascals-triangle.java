class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<List<Integer>>();
        
        for(int i=0;i<numRows;i++){
            int icj = 1;
            List<Integer> ls2 = new ArrayList<Integer>();
            // ls.add(i);
            for(int j=0;j<=i;j++){
                ls2.add(icj);
                icj = ((icj*(i-j))/(j+1));
            }
            ls.add(ls2);
        }
        return ls;
    }

}