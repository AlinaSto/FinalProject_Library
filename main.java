package Library_comparator;

import java.util.*;
public class main {
    public static void main(String[] args) {
        Map<Integer, String> products = new HashMap<>();
        products.put(1000, "Notebook");
        products.put(2000, "Phone");
        products.put(3000, "Keyboard");
        for (Map.Entry<Integer, String> set : products.entrySet()) {
            System.out.println(set.getKey() + " " + set.getValue());
        }
        List<Integer> numbersList = new ArrayList();
        numbersList.add(4);
        numbersList.add(8);
        numbersList.add(25);
        System.out.println(numbersList);
        System.out.println(listNumberWithParameters(numbersList));
        System.out.println("-----------------------------");
        List<String> words = new ArrayList();
        words.add("miercuri");
        words.add("ia");
        words.add("paine");
        System.out.println(words);
        System.out.println(findLongestWord(words));
        System.out.println("-----------------------------");
        Set<Integer> firstList = new HashSet();
        firstList.add(75);
        firstList.add(-75);
        firstList.add(-1);
        firstList.add(-65);
        System.out.println(firstList);
        Set<Integer> secondList = new HashSet();
        secondList.add(9);
        secondList.add(85);
        System.out.println(secondList);
        System.out.println(showPositiveNumbers(firstList, secondList));
        System.out.println("-----------------------------");
        List<String> wordsList = new ArrayList();
        wordsList.add("pufuleti");
        wordsList.add("in");
        wordsList.add("chia");
        wordsList.add("a");
        System.out.println(wordsList);
        System.out.println(reverseWords(wordsList));
        System.out.println("-----------------------------");
        Set<String> firstParametersSet = new HashSet();
        firstParametersSet.add("maine");
        firstParametersSet.add("nu");
        firstParametersSet.add("va");
        firstParametersSet.add("ploua");
        System.out.println(firstParametersSet);
        Set<String> secondParametersSet = new HashSet();
        secondParametersSet.add("va");
        secondParametersSet.add("maine");
        System.out.println(secondParametersSet);
        System.out.println(supersetMethod(firstParametersSet, secondParametersSet));
        System.out.println("-----------------------------");
        List<String> wordsNo = new ArrayList();
        wordsNo.add("piersici");
        wordsNo.add("mere");
        wordsNo.add("mere");
        wordsNo.add("nuci");
        System.out.println(duplicates(wordsNo));
    }

    public static List<Integer> listNumberWithParameters(List<Integer> numbersList) {
        List<Integer> addedNumbers = new ArrayList();
        Iterator var2 = numbersList.iterator();

        while (var2.hasNext()) {
            int number = (Integer) var2.next();
            addedNumbers.add(number * 2);
        }

        return addedNumbers;
    }

    public static String findLongestWord(List<String> words) {
        int maxLength = 0;
        String longestWord = null;
        Iterator var3 = words.iterator();

        while (var3.hasNext()) {
            String word = (String) var3.next();
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static Set<Integer> showPositiveNumbers(Set<Integer> firstList, Set<Integer> secondList) {
        Set<Integer> positiveNumbers = new HashSet();
        Iterator var3 = firstList.iterator();

        Integer numberS;
        while (var3.hasNext()) {
            numberS = (Integer) var3.next();
            if (numberS > 0) {
                positiveNumbers.add(numberS);
            }
        }

        var3 = secondList.iterator();

        while (var3.hasNext()) {
            numberS = (Integer) var3.next();
            if (numberS > 0) {
                positiveNumbers.add(numberS);
            }
        }

        return positiveNumbers;
    }

    public static List<String> reverseWords(List<String> wordsList) {
        List<String> reverse = new ArrayList();
        wordsList.spliterator();

        for (int i = wordsList.size() - 1; i >= 0; --i) {
            if (((String) wordsList.get(i)).length() >= 3) {
                reverse.add((String) wordsList.get(i));
            }
        }

        return reverse;
    }

    public static boolean supersetMethod(Set<String> firstParametersSet, Set<String> secondParametersSet) {
        return firstParametersSet.containsAll(secondParametersSet) && !firstParametersSet.equals(secondParametersSet);
    }

    public static Map<String, Integer> duplicates(List<String> wordsNo) {
        HashMap<String, Integer> hashmap = new HashMap();

        for (int i = 0; i < wordsNo.size(); ++i) {
            String currentWord = (String) wordsNo.get(i);
            if (hashmap.containsKey(currentWord)) {
                hashmap.put(currentWord, (Integer) hashmap.get(currentWord) + 1);
            } else {
                hashmap.put(currentWord, 1);
            }
        }

        return hashmap;
    }
}

