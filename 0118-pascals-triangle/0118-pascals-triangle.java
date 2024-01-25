
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows > 0) {
            for (int i = 0; i < numRows; i++) {
                List<Integer> rowList = new ArrayList<>();

                for (int j = 0; j <= i; j++) {
                    if (j == 0 || i == 0) {
                        rowList.add(1);
                    } else if (i == j) {
                        rowList.add(1);
                    } else {
                        rowList.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                    }
                }

                result.add(rowList);
            }
        }

        return result;
    }
}
