class InstanceMethod {
    public int add(int a, int b) {
        int s = a + b;
        return s;
    }
    InstanceMethod(){
        System.out.println("Constructor Called");
    }

    public static void main(String args[]) {
        // creating an object of the class
        InstanceMethod obj = new InstanceMethod();

        System.out.println(obj.add(1, 2));
        // invoking instance method

    }
}