package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlyOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void multipleSameBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[["));
    }

    @Test
    public void multipleNestedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[][]]]"));
    }

    @Test
    public void closedThenOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void multipleClosedThenOpenBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]][[[["));
    }

    @Test
    public void twoOpenAndOneClosedReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void openAndClosedBracketsWithOtherCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCodeRocks]"));
    }

    @Test
    public void nestedBracketsWithOtherCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("L[aun[ch[C]od]eRo]cks"));
    }

    @Test
    public void closedThenOpenBracketsWithOtherCharactersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Laun[chCode][Rocks"));
    }

    @Test
    public void stringWithoutBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCodeRocks"));
    }
}
