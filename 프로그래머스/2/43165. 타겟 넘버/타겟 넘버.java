class Solution {
    private static int answer = 0;

    public int solution(int[] numbers, int target) {

        dfs(numbers, target, 0, 0);
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int start, int sum) {
        if (start == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        dfs(numbers, target, start + 1, sum + numbers[start]);
        dfs(numbers, target, start + 1, sum - numbers[start]);
    }
}