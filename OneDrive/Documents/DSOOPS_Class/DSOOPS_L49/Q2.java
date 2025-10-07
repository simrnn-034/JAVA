public class Q2 {
    public static void main(String[] args) {
        String str="Simran";
        char []arr=str.toCharArray();
        for(char ch:arr){
            System.out.print(ch+" ");
        }
        System.out.println();
        arr[0]='A';
         for(char ch:arr){
            System.out.print(ch+" ");
        }


    }
}
