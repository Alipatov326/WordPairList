public class WordPair
{

    private String first;
    private String second;

    /** Constructs a WordPair object. */
    public WordPair(String first, String second)
    {
        this.first = first;
        this.second = second;
        /* implementation not shown */ }

    public String toString(){
        return "(\"" + first + "\", \"" + second + "\")";
    }

    /** Returns the first string of this WordPair object. */
    public String getFirst()
    {
        return first;
        /* implementation not shown */ }

    /** Returns the second string of this WordPair object. */
    public String getSecond()
    {
        return second;
        /* implementation not shown */ }
}