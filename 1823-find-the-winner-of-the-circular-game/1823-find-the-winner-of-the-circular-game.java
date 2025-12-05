class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            li.add(i);
        }
        int index = 0;
        while (li.size() > 1) {
            index = (index + k - 1) % li.size();
            li.remove(index);
        }
        return li.get(0);
    }
}
