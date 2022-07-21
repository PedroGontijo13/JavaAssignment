package ca.ciccc.assignment8.question4;

public class ApplicationDriver {
    class SolutionClass {
        public int[] solution(int a[], int n) {
            int[] b = new int[n];
            int j = n;
            for (int i = 0; i < n; i++) {
                b[j - 1] = a[i];
                j = j - 1;
            }

            // printing the reversed array
            System.out.println("Reversed array is: \n");
            for (int k = 0; k < n; k++) {
                System.out.print(b[k]);
            }
            return b;
        }
    }

    public void main() {
        SolutionClass sl = new SolutionClass();
        int[] m = {1, 2, 3, 4, 5, 6, 7};
        sl.solution(m, m.length);
    }
}
