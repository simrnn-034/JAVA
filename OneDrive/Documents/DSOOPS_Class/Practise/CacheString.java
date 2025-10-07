// import java.util.Scanner;
// public class CacheString{
//     public static void main(String[] args){
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         String[] cache=new String[n];
//         int index=0;
//         for(int i=0;i<cache.length;i++){
//             cache[i]=in.nextLine();
//              index=(index+1)%cache.length; //index = (index + 1) % cache.length makes it circular (wraps around when full).

//         }
//         if(index==cache.length){
//             for(int i=cache.length-1;i>0;i--){
//                 cache[i]=cache[i-1];
//             }
//         }
//         String newVal=in.nextLine();
//         cache[0]=newVal;
//         System.out.println();
      
       
//     }
// }


// import java.util.Arrays;
// import java.util.Scanner;

// public class EnteringTheFirstElement {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the cache size: ");
//         int size = input.nextInt();
//         String[] arr = new String[size];
//         input.next();
//         System.out.print("Enter the cache elements: ");
//         for (int i = 0;i<arr.length;i++){
//             arr[i] = input.nextLine();
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }



import jdk.jshell.SourceCodeAnalysis;

import java.util.Arrays;
import java.util.Scanner;

public class Cache {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] cache = new String[n];
        in.nextLine();
        for(int i=0;i< cache.length;i++){
            cache[i] = in.nextLine();
        }
        String newVal = in.nextLine();
            for(int i= cache.length-1;i>0;i--){
                cache[i] = cache[i-1];
            }
        cache[0] = newVal;
        System.out.println(Arrays.toString(cache));

    }
}