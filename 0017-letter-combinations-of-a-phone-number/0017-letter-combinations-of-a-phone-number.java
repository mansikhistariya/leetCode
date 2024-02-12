class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> re=new ArrayList<>();
         if(digits.length()==0|| digits==null){
            return re;
        }
    
        HashMap<Integer,String> map=new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
         re.add(""); 
       
        for (int i = 0; i < digits.length(); i++) {
            int d=Character.getNumericValue(digits.charAt(i));
            String letter=map.get(d);
            if(letter ==null){
                continue;
            }
            List<String> temp=new ArrayList<>();
            for (String c:re) {
                for (char l :letter.toCharArray()) {
                    temp.add(c+l);
                }
            }
            re=temp;
        }
        return re;
    }

}