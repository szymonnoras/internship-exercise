import java.util.*;

public class BalancedWordsCounter {

    public int count(String input) throws Exception {
        if(!input.chars().allMatch(Character::isLetter)){
            throw new RuntimeException("the text does not contain only letters");
        }

        if(input==null){
            throw new RuntimeException("null string");
        }

        int balancedWords=0;
        List<String> subWords=subStrings(input);

        for (int i = 0; i < subWords.size(); i++) {
            Object[] letters=numberOfEachLetterInWord(subWords.get(i));
            balancedWords+=isWordBalanced(letters);
        }

        return balancedWords;
    }

    private List<String> subStrings(String input){
        List<String> subWords=new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = input.length(); j > i; j--) {
                subWords.add(input.substring(i,j));
            }
        }
        return subWords;
    }

    private Object[] numberOfEachLetterInWord(String word){
        Map<Character,Integer> letters=new HashMap<Character,Integer>();
        letters.put('a',0);
        letters.put('b',0);
        letters.put('c',0);
        letters.put('d',0);
        letters.put('e',0);
        letters.put('f',0);
        letters.put('g',0);
        letters.put('h',0);
        letters.put('i',0);
        letters.put('j',0);
        letters.put('k',0);
        letters.put('l',0);
        letters.put('m',0);
        letters.put('n',0);
        letters.put('o',0);
        letters.put('p',0);
        letters.put('q',0);
        letters.put('r',0);
        letters.put('s',0);
        letters.put('t',0);
        letters.put('u',0);
        letters.put('v',0);
        letters.put('w',0);
        letters.put('x',0);
        letters.put('y',0);
        letters.put('z',0);

        char c;
        for (int i = 0; i < word.length(); i++) {
            c=word.toLowerCase(Locale.ROOT).charAt(i);
            letters.replace(c,letters.get(c)+1);
        }

        return letters.values().toArray();
    }

    private Integer[] objectArrayToIntegerArray(Object[] objectArray){
        Integer[] integerArray = new Integer[objectArray.length];

        for (int i = 0; i < objectArray.length; i++) {
            integerArray[i] = (Integer)objectArray[i];
        }
        return integerArray;
    }

    private int isWordBalanced(Object[] array){
        Integer[] letters=objectArrayToIntegerArray(array);
        int max=maxValue(letters);
        for (int i = 0; i < letters.length; i++) {
            if(letters[i]!=0 && letters[i]!=max){
                return 0;
            }
        }
        return 1;
    }

    private int maxValue(Integer[] letters){
        int max=0;
        for (int i = 0; i < letters.length; i++) {
            if(letters[i]>max){
                max=letters[i];
            }
        }
        return max;
    }
}
