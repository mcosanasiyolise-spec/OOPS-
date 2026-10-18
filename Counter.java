//run this program using javac Counter.java  - > java Counter
class Counter {
    //uncomment the below lines to know the importance of statics keyword

    int number=10;
    //static int number=10;

    void increment(){
        number=number+1;
    }  
    public static void main(String[] args) {
        Counter obj1=new  Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        //Guess the answer
        obj1.increment();
        obj2.increment();
        obj3.increment();

        //to check your answer uncomment the next lines

        //system.out.println(obj1.number);
        // system.out.println(obj2.number);
        // system.out.println(obj3.number);
    }
}