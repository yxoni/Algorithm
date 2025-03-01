class Solution {
    public String solution(int[] food) {
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            answer += String.valueOf(i).repeat(food[i] / 2);
        }
        String temp = new StringBuffer(answer).reverse().toString();
        answer += "0" + temp;

        return answer;
    }
}