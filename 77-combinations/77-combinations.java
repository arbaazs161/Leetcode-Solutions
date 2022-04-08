class Solution {
    public List<List<Integer>> combine(int n, int k) {
        if (n <= 0 || k < 0) {
            throw new IllegalArgumentException("invalid input");
        }

        List<List<Integer>> result = new ArrayList<>();
        if (k == 0) {
            result.add(new ArrayList<>());
            return result;
        }

        combineHelper(n, k, new ArrayList<>(), result);
        return result;
    }

    private void combineHelper(int n, int k, List<Integer> temp, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = n; i >= 1; i--) {
            temp.add(i);
            combineHelper(i - 1, k - 1, temp, result);
            temp.remove(temp.size() - 1);
        }
    }

}