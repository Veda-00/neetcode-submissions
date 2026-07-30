class Solution {

    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<String>();
        return helper("", digits);
    }

    List<String> helper(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list; 
        }

        ArrayList<String> list = new ArrayList<>();
        
        int digit = up.charAt(0) - '0'; 
        
        String letters = KEYPAD[digit];

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            list.addAll(helper(p + ch, up.substring(1)));
        }

        return list;
    }
}