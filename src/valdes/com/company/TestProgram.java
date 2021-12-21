package valdes.com.company;

class TestProgram {

    public TestResult testProgram() {
        PositionOfLastNumInSeq positionOfLastNumInSubSeq = new PositionOfLastNumInSeq();
        ArraysForTests arraysForTests = new ArraysForTests();
        TestCase[] testCases = arraysForTests.getTests();

        for (int i = 0; i < testCases.length; i++){
            int min = positionOfLastNumInSubSeq.findMinIndOfArray(testCases[i].getArray());
            int max = positionOfLastNumInSubSeq.findMaxIndOfArray(testCases[i].getArray());
            int ind = positionOfLastNumInSubSeq.findPositionOfLastNum(max, min, testCases[i].getArray());

            if (ind != testCases[i].getPositionOfLastNum()){
                System.out.printf("Test %d is not passed...", i + 1);
                return new TestResult(false);
            }
        }

        return new TestResult(true);
    }
}
