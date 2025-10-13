public class Solution 
{
    public String clearStars(String s) 
    {
        int n = s.length();
        boolean[] removed = new boolean[n];
        List<Integer>[] charIndices = new ArrayList[26];
        for (int i = 0; i < 26; i++) 
        {
            charIndices[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) 
        {
            char c = s.charAt(i);

            if (c == '*') 
            {
                removed[i] = true; 
                for (int j = 0; j < 26; j++) 
                {
                    if (!charIndices[j].isEmpty()) 
                    {
                        int idx = charIndices[j].remove(charIndices[j].size() - 1);
                        removed[idx] = true;
                        break;
                    }
                }
            } 
            else 
            {
                charIndices[c - 'a'].add(i);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) 
        {
            if (!removed[i] && s.charAt(i) != '*') 
            {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}