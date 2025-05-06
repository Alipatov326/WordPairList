import java.util.ArrayList;
public class WordPairList
{
    /** The list of word pairs, initialized by the constructor. */
    private ArrayList<WordPair> allPairs;

    /** Constructs a WordPairList object as described in part (a).
     * Precondition: words.length >= 2
     */
    public ArrayList<WordPair> getAllPairs(){
        return allPairs;
    }
    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<WordPair>();
        for(int i = 0; i < words.length; i++)
            for(int j = i + 1; j < words.length; j++)
                allPairs.add(new WordPair(words[i], words[j]));
        /* to be implemented in part (a) */ }

    /** Returns the number of matches as described in part (b).
     */
    public int numMatches()
    {
        int matches = 0;
        for(WordPair wp : allPairs) {
            if (wp.getFirst().equals(wp.getSecond()))
                matches++;
        }

        return matches;
        /* to be implemented in part (b) */ }
}