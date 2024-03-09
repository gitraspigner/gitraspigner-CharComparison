public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * car < care < cat
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){

        // just loosely calculate the dictionary position of each array and return the max value
        int dictionaryPositionA = 0;
        int dictionaryPositionB = 0;

        for (int i = 0; i < a.length; i++) {
            dictionaryPositionA += a[i];
        }
        for (int i = 0; i < b.length; i++) {
            dictionaryPositionB += b[i];
        }
        if (dictionaryPositionA < dictionaryPositionB) {
            return -1;
        } else if (dictionaryPositionA > dictionaryPositionB) {
            return 1;
        } else { //dictionaryPositionA == dictionaryPositionB
            return 0;
        }

    }
}
