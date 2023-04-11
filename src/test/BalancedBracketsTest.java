package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //      * The function BalancedBrackets should return true if and only if
//            * the input string has a set of "balanced" brackets.
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

//     *
//             * That is, whether it consists entirely of pairs of opening/closing
//     * brackets (in that order), none of which mis-nest. We consider a bracket
//     * to be square-brackets: [ or ].
//            *


        @Test
    public void closeBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
        }

        @Test
    public void openBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        }


//            * The string may contain non-bracket characters as well.
//            *

    @Test
    public void zeroBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
    }
//            * These strings have balanced brackets:
//            *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
//            *
    @Test
    public void stringBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void stringClosedBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void stringOpenBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code"));
    }

    @Test
    public void stringClosedOpenBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void nestedBracketsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void missingClosedBracketsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Quit[time"));
    }

    @Test
    public void correctBracketCountTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[This is fun]" + "So [much] fun"));
    }
//            * While these do not:
//            *   "[LaunchCode", "Launch]Code[", "[", "]["
//            *
//            * @param str - to be validated
//     * @return true if balanced, false otherwise
//     */

}
