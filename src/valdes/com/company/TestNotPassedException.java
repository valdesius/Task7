package valdes.com.company;

class TestNotPassedException extends Exception {

    public TestNotPassedException() {
        System.out.println("One or more tests is/are not passed");
        System.out.println("The program is completed.");
    }
}
