public class Kolokwium {

    public static boolean czyCiagArytmetyczny(int[] tab) {
        int diff = tab[1] - tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (i < tab.length - 1) {
                if (tab[i + 1] - tab[i] != diff)
                    return false;
            }
        }

        return true;
    }

    public static int podciag(int[] tab) {
        int longestSequence = 0;
        int currentSequenceLength = 1;

        for (int i = 0; i < tab.length; i++) {
            if (i < tab.length - 1) {
                if (tab[i + 1] > tab[i]) {
                    currentSequenceLength++;
                }
                else {
                    if (currentSequenceLength > longestSequence)
                        longestSequence = currentSequenceLength;

                    currentSequenceLength = 1;
                }
            }
        }

        return longestSequence;
    }

    public static int podciag(int[] tab, int r) {
        int longestSequence = 0;
        int currentSequenceLength = 1;

        for (int i = 0; i < tab.length; i++) {
            if (i < tab.length - 1) {
                if (tab[i + 1] > tab[i] && tab[i + 1] - tab[i] == r) {
                    currentSequenceLength++;
                }
                else {
                    if (currentSequenceLength > longestSequence)
                        longestSequence = currentSequenceLength;

                    currentSequenceLength = 1;
                }
            }
        }

        return longestSequence;
    }

    public static void sekwencjaCollatza(int n, int c) {
        for (int i = c; i < n + c; i++) {
            if (i % 2 == 0) {
                System.out.println(i / 2);
            }
            else {
                System.out.println(i * 3 + 1);
            }
        }
    }

    public static void minMaxSekwencjaCollatza(int n, int c) {
        int arr[] = new int[n];
        int idx = 0;

        for (int i = c; i < n + c; i++) {
            if (i % 2 == 0) {
                arr[idx] = i / 2;
            }
            else {
                arr[idx] = i * 3 + 1;
            }

            idx++;
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void main(String[] args) {
        int[] arithmeticSequence = { 2, 4, 6, 8, 10 };
        int[] subsequenceArr = { 1, 2, 0, 3, 5, 1, 4 };
        czyCiagArytmetyczny(arithmeticSequence);
        sekwencjaCollatza(5, 2);
        minMaxSekwencjaCollatza(5, 2);
        podciag(subsequenceArr);
        podciag(subsequenceArr, 1);
    }
}