public class Codility {

    public static int solution(int[] A) {
        int counter1 = 1;
        int counter2 = 0;
        boolean check = false;
        int digit = -1;
        if (A.length==0) return 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length - i; j++) {
                if (A[i] == A[i + j]) {
                    counter1++;
                } else if (!check) {
                    digit = A[i + j];
                    check = true;
                    counter2++;
                } else if (digit == A[i + j] && check) {
                    counter2++;
                }
            }
        }
        return counter1 + counter2;
    }

    public static void main(String[] args) {
        int A[] = {5, 4, 4, 5, 0, 12};

        System.out.println(solution(A));
    }
}
