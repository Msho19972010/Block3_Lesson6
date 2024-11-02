import java.util.*;

public class Main{

    public static void main(String[] args) throws EmptyCollectionException {
        List<Integer> numbers = Arrays.asList(1,2,3,4,4,4,4,5,5,5,6,7,8,9,1,2,3);
        System.out.println("-This is the list without duplicates: " + deleteDuplicates(numbers));

        List<String> words = Arrays.asList("nana", "nomanm", "bird", "car", "film", "name");
        System.out.println("-The count of specific letter that is beginning of words: " + countStringsStartingWith(words));

        List<Integer> numbers2 = Arrays.asList(14,25,36,41,42,43,44,55,512,52342,62,799,88,987,1,2,3);
        System.out.println("-The second-largest element in the  list is: " + secondLargestElement(numbers2));
    }

    public static Collection deleteDuplicates(Collection list) throws EmptyCollectionException {
        if(list.isEmpty()) {
            throw new EmptyCollectionException();
        }

        if(list.stream().allMatch(String.class::isInstance)) {
            return list.stream().distinct().toList();
        } else {
            return list.stream().distinct().toList();
        }
    }
    public static int countStringsStartingWith(List<String> list) throws EmptyCollectionException{
        if(list.isEmpty()) {
            throw new EmptyCollectionException();
        }

        return (int) list.stream().filter(s -> s.startsWith("n")).count();
    }

    public static int secondLargestElement(List<Integer> list) throws EmptyCollectionException{
        if(list.isEmpty()) {
            throw new EmptyCollectionException();
        }

        return list.stream().sorted().skip(list.size() - 2).findFirst().orElseThrow();
    }

}
