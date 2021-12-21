package valdes.com.company;

public class TestCase {
    final int[] array;
    final int positionOfLastNum;

    public TestCase(int[] array, int positionOfLastNum) {
        this.array = array;
        this.positionOfLastNum = positionOfLastNum;
    }

    public int[] getArray() {
        return array;
    }

    public int getPositionOfLastNum() {
        return positionOfLastNum;
    }
}
