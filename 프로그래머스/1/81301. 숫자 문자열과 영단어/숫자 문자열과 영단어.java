class Solution {
    public int solution(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder sum = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                sum.append(c);
            } else {
                result.append(c);
            }

            if (toNumber(sum) != 10) {
                result.append(toNumber(sum));
                sum = new StringBuilder();
            }
        }

        return Integer.parseInt(String.valueOf(result));
    }

    public int toNumber(StringBuilder s) {
        switch (String.valueOf(s)) {
            case "zero":
                return 0;
            case "one":
                return 1;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
        }
        return 10;
    }
}