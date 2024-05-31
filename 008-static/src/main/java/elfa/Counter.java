package elfa;

public class Counter {
    public static int totalCount = 0;
    public int instanceCount;

    public Counter() {
        this.instanceCount = 0;
    }

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        this.instanceCount++;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "totalCount=" + totalCount +
                ", instanceCount=" + instanceCount +
                '}';
    }
}
