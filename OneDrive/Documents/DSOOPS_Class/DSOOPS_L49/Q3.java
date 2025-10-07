public class Q3 {
    public static void main(String[] args) {
        String str = "Simran";
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U' ||
                arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                arr[i] = '*'; 
            }
        }
 
        String result = new String(arr);
        System.out.println(result);
    }
}
