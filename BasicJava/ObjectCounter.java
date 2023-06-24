class ObjectCounter{
    public static void main(String[] args) {
        
        Test obj1 = new Test();
        Test obj2 = new Test();

        obj2.counter();
        obj1.counter();
    }
}

class Test{
    static int i = 0;

    public Test(){
        i++;
    }
    
    public void counter(){
        System.out.println(i);
    }
}