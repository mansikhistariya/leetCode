class RandomizedSet {
    private List<Integer> data;
    private HashMap<Integer, Integer> indexMap;
    private Random rand;

    public RandomizedSet() {
         data = new ArrayList<>();
        indexMap = new HashMap<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
         if(indexMap.containsKey(val)){
            return false;
        }
        data.add(val);
        indexMap.put(val,data.size()-1);
        return true;

    }
    
    public boolean remove(int val) {
        if(!indexMap.containsKey(val)){
            return false;
        }
         int idx = indexMap.get(val);
        int lastElement = data.get(data.size()-1 );

        // Swap the element to be removed with the last element
        data.set(idx, lastElement);
        indexMap.put(lastElement, idx);

        // Remove the last element
        data.remove(data.size()-1 );
        indexMap.remove(val);

        return true;
    }
    
    public int getRandom() {
         int randomIndex = rand.nextInt(data.size());
        return data.get(randomIndex);

        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */