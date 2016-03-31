package algorithm;

public class SimpleQuickUnion {

    public SimpleQuickUnion() {
        // TODO Auto-generated constructor stub
    }

    /*
     * Algorithm
     * 
     * Create connected components by using their roots.
     */
    private int[] id;
    private boolean printState = false;

    public SimpleQuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int root(int p) {
        while (id[p] != p) {
            p = id[p];
        }
        return p;
    }

    /*
     * Two numbers (p,q) are connected whether their roots are equal.
     */
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    /*
     * The union algorithm: 1. Check p and q are not connected 2. All values on the array equal to
     * root (p) value must be updated to root(q).
     */
    public SimpleQuickUnion union(int p, int q) {
        if (!connected(p, q)) {
            int rootP = root(p);
            int rootQ = root(q);
            id[rootP] = rootQ;
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
