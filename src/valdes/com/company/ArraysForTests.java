package valdes.com.company;

public class ArraysForTests {

    public TestCase[] getTests(){
        TestCase arr1 = new TestCase(new int[] {4, 7, 55, 33, 49, 86, 99, 11, 14}, 7);
        TestCase arr2 = new TestCase(new int[] {3, 6, 9, 4, 5, 66, 7}, 6);
        TestCase arr3 = new TestCase(new int[] {55, 79, -146, 555, 23, 76, 88, 11, 43}, 4);
        TestCase arr4 = new TestCase(new int[] {32, 74, 5, 38, 55, 855, 5, 108}, 6);
        TestCase arr5 = new TestCase(new int[] {345, 566, 215, 432, -61, 54}, 2);
        TestCase arr6 = new TestCase(new int[] {112, -44, -35, 443, 65}, 4);
        TestCase arr7 = new TestCase(new int[] {25, 4, 6, 7, 88, 99, 12, 77}, 6);
        TestCase arr8 = new TestCase(new int[] {71, 79, 88, 87, 43, 127, 36, 554, 3}, 8);
        TestCase arr9 = new TestCase(new int[] {91, 4, 65, 46, 68, 32}, 1);
        TestCase arr10 = new TestCase(new int[] {3, -7, 96, 54, 34, 23, 46}, 3);

        return new TestCase[]{arr1, arr2, arr3, arr4, arr5, arr6, arr7, arr8, arr9, arr10};
    }
}
