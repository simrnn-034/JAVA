package DSOOPS_Wk10_S4_L38;
public class LoopOutput {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            if (i == 1) continue;
            System.out.print(i + " ");
        }
    }
}
