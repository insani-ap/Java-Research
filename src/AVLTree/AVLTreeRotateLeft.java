package AVLTree;

public class AVLTreeRotateLeft {
    public static int[] rotateArray(int[] input, int k) {
        int[] output = new int[input.length];
        int temporaryDown = k-1;
        int temporaryUp = input.length-1;

        for (int i = 0, j = input.length-1; i < input.length; i++, j--) {
            if (i < k)
                output[j] = input[temporaryDown--];
            else
                output[j] = input[temporaryUp--];
        }

        return output;
    }

    public static void main(String[] args) {
        for (int result : rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 5)) {
            System.out.println(result);
        }
    }
}
