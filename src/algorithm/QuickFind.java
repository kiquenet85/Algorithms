package algorithm;

public class QuickFind {

    /*
     * Algorithm
     * 
     * Create connected components by using their indices.
     */
    private int[] id;
    private boolean printState = false;

    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /*
     * Two numbers (p,q) are connected whether their values are equal.
     */
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    /*
     * The union algorithm: 1. Check p and q are not connected 2. All values on the array equal to p
     * value must be updated to q value (id[q]).
     */
    public QuickFind union(int p, int q) {
        if (!connected(p, q)) {
            int valueP = id[p];
            int valueQ = id[q];
            for (int i = 0; i < id.length; i++) {
                if (id[i] == valueP) {
                    id[i] = valueQ;
                }
            }
            printState("union: " + p + "," + q);
        } else {
            printState("union: " + p + "," + q + " Currently connected.");
        }

        return this;
    }

    public boolean isPrintState() {
        return printState;
    }

    public void setPrintState(boolean printState) {
        this.printState = printState;
    }

    private void printState(String operation) {
        if (this.printState) {
            System.out.println(operation);
            System.out.println(toString());
        }
    }

    public String toString() {
        String result = "{";

        for (int i = 0; i < id.length; i++) {
            result += id[i] + " ";
        }

        result += "}";
        return result;
    }

}
