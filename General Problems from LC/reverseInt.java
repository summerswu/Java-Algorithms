class Solution {
    public int reverse(int x) {
        
        if(x<=-2147483648 || x >= 2147483647) return 0; 
        
        if(x < 0){
            int arr = -(reverse(-x));
            return arr;
        }
        
        String s = "" + x;
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(s);
        
        sb = sb.reverse();
        
        int arr = 0; 
        
        try {
                  arr = Integer.parseInt(sb.toString());
            } catch (NumberFormatException e) {
                  arr = 0;
            }
        
        return arr;
        
    }
}