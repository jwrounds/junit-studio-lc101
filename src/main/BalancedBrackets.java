package main;


public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int openBrackets = 0;
        int closedBrackets = 0;
        boolean closed = true;

        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                closed = false;
                openBrackets++;
            } else if (ch == ']') {
                closedBrackets++;
                if (!closed && openBrackets == closedBrackets) {
                    closed = true;
                }
            }
        }
        return closed;
    }
}
