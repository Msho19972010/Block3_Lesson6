import java.util.*;

public class Main{

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,4,4,4,5,5,5,6,7,8,9,1,2,3);
        List<String> words = Arrays.asList("nana", "nomanm", "bird", "car", "bird", "film", "name");
        List<Integer> numbers2 = Arrays.asList(14,25,36,41,42,43,44,55,512,52342,62,799,88,987,1,2,3);

        System.out.println("-This is the list without duplicates: " + deleteDuplicates(numbers));

        System.out.println("-This is the list without duplicates: " + deleteDuplicates(words));

        System.out.println("-The count of specific letter that is beginning of words: " + countStringsStartingWith(words));

        System.out.println("-The second-largest element in the  list is: " + secondLargestElement(numbers2));
    }

    public static <T>Collection deleteDuplicates (Collection<T> list) {
        if(list.isEmpty()) {
            throw new NoSuchElementException();
        }

        return list.stream().distinct().toList();
    }
    public static int countStringsStartingWith(List<String> list) {
        if(list.isEmpty()) {
            throw new NoSuchElementException();
        }

        return (int) list.stream().filter(s -> s.startsWith("n")).count();
    }

    public static int secondLargestElement(List<Integer> list) {
        if(list.size() < 2) {
            throw new NoSuchElementException();
        }

        Optional<Integer> maxValue = list.stream().max(Integer::compare);

        return list.stream().filter(i -> i < maxValue.get()).toList().stream().max(Integer::compare).orElse(0);
    }
}
