public class Quiz4Check {
    public static void main(String[] args) {
        boolean[][] truthTable = {
            {true, true, true},
            {true, true, false},
            {true, false, true},
            {true, false, false},
            {false, true, true},
            {false, false, true},
            {false, true, false},
            {false, false, false}
        };

        for (int i = 0; i < truthTable.length; i++) {
            getResults(truthTable[i][0], truthTable[i][1], truthTable[i][2]);
        }
    }

    public static void getResults(boolean p, boolean q, boolean r) {
        System.out.printf("p = %5s, q = %5s, r = %5s: ", p, q, r);

        System.out.print(" A ");

        if (p) {
            System.out.print(" B ");
            if (q) {
                System.out.print(" C ");
            }
            if (!r) {
                System.out.print(" D ");
            } else if (!q && !r) {
                System.out.print(" E ");
            }
        }

        if (q || r) {
            if (q && r) {
                System.out.print(" F ");
            } else if (!p) {
                System.out.print(" G ");
            } else {
                System.out.print(" H ");
            }
        }

        if (!q) {
            System.out.print(" J ");
            if (!(q || r)) {
                System.out.print(" K ");
            }
        } else {
            if (p && !r) {
                System.out.print(" L ");
            }
            if (!p && q) {
                System.out.print(" M ");
            }
        }

        System.out.println();
    }
}