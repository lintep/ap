package ap.livecodes.y403.m12.d14;

public class StringArray {

    public static void main(String[] args) {

        String query = "ab";

        String[] stringArray = {"ac", "ab", "abc", "ddab", "ab", "abcde"};
        for(String str:stringArray){
            System.out.println(str);
        }

        String stringInput = "ac ab abc ddab ab abcde";

//        int result = search(query, stringArray);

//        String[] array=stringInput.split(" ");
//        int result = search(query, array);

        int result = search(query, stringInput);


        System.out.println("result=" + result);
    }

    public static int search(String query, String[] strings) {
        int counter = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(query)) {
                counter++;
                System.out.println("index: " + i);
            }
        }
        return counter;
    }

    public static int search(String query, String stringInput) {
        return search(query, stringInput.split(" "));
    }
}
