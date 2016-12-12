package Config.General;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Created by user on 06-Dec-16.
 */
public class VerificationMethods {

    /**
     * Actual Result Is Equal To The Expected Result.
     *
     * @param actual   Enter Actual Value In String.
     * @param expected Enter Expected Value In String.
     * @return Return Result In Boolean.
     */
    public static boolean actualIsEqualToExpected(String actual, String expected) {
        boolean result;
        result = assertThat(actual).isEqualTo(expected) != null;
        return result;
    }

    /**
     * Actual Result Is Equal To Ignoring Case To The Expected.
     *
     * @param actual   Enter Actual Value In String.
     * @param expected Enter Expected Value In String.
     * @return Return Result In Boolean.
     */
    public static boolean actualIsEqualToIgnoringCaseExpected(String actual, String expected) {
        boolean result;
        result = assertThat(actual).isEqualToIgnoringCase(expected) != null;
        return result;
    }

    /**
     * Actual Result Is Equal To Ignoring White Space In Expected Result.
     *
     * @param actual   Enter Actual Value In String.
     * @param expected Enter Expected Value In String.
     * @return Return Result In Boolean.
     */
    public static boolean actualIsEqualToIgnoringWhiteSpaceExpected(String actual, String expected) {
        boolean result;
        result = assertThat(actual).isEqualToIgnoringWhitespace(expected) != null;
        return result;
    }

    /**
     * Actual Result Contains The Expected Result.
     *
     * @param actual   Enter Actual Value In String.
     * @param expected Enter Expected Value In String.
     * @return Return Result In Boolean.
     */
    public static boolean actualContainsExpected(String actual, String expected) {
        boolean result;
        result = assertThat(actual).contains(expected) != null;

        return result;
    }

    /**
     * Actual Result Contains Ignoring Case In Expected Result.
     *
     * @param actual   Enter Actual Value In String.
     * @param expected Enter Expected Value In String.
     * @return Return Result In Boolean.
     */
    public static boolean actualContainsIgnoringCaseExpected(String actual, String expected) {
        boolean result;
        result = assertThat(actual).containsIgnoringCase(expected) != null;

        return result;
    }

    /**
     * Expected Result Contains Only Digits.
     *
     * @param expected Enter Expected Value In String.
     * @return Return Result In Boolean.
     */
    public static boolean expectedContainsOnlyDigits(String expected) {
        boolean result;
        result = assertThat(expected).containsOnlyDigits() != null;

        return result;
    }

    /**
     * Actual Result Contains Only Once The Expected Result.
     *
     * @param actual   Enter Actual Value In String.
     * @param expected Enter Expected Value In String.
     * @return Return Result In Boolean.
     */
    public static boolean actualContainsOnlyOnceExpected(String actual, String expected) {
        boolean result;
        result = assertThat(actual).containsOnlyOnce(expected) != null;

        return result;
    }

    /**
     * Actual Result Does Not Contain The Expected Result.
     *
     * @param actual   Enter Actual Value In String.
     * @param expected Enter Expected Value In String.
     * @return Return Result In Boolean.
     */
    public static boolean actualDoesNotContainExpected(String actual, String expected) {
        boolean result;
        result = assertThat(actual).doesNotContain(expected) != null;

        return result;
    }

    /**
     * Actual Result Does Not Start With The Expected Result.
     *
     * @param actual   Enter Actual Value In String.
     * @param expected Enter Expected Value In String.
     * @return Return Result In Boolean.
     */
    public static boolean actualDoesNotStartWithExpected(String actual, String expected) {
        boolean result;
        result = assertThat(actual).doesNotStartWith(expected) != null;

        return result;
    }

    /**
     * Actual Result Does Not End With The Expected Result.
     *
     * @param actual   Enter Actual Value In String.
     * @param expected Enter Expected Value In String.
     * @return Return Result In Boolean.
     */
    public static boolean actualDoesNotEndWithExpected(String actual, String expected) {
        boolean result;
        result = assertThat(actual).doesNotEndWith(expected) != null;

        return result;
    }

    /**
     * Actual Result Does Not Match With The Expected Result.
     *
     * @param actual   Enter Actual Value In String.
     * @param expected Enter Expected Value In String.
     * @return Return Result In Boolean.
     */
    public static boolean actualDoesNotMatchExpected(String actual, String expected) {
        boolean result;
        result = assertThat(actual).doesNotMatch(expected) != null;

        return result;
    }

    /**
     * Actual Result Matches With The Expected Result.
     *
     * @param actual   Enter Actual Value In String.
     * @param expected Enter Expected Value In String.
     * @return Return Result In Boolean.
     */
    public static boolean actualMatchesExpected(String actual, String expected) {
        boolean result;
        result = assertThat(actual).matches(expected) != null;

        return result;
    }

}
