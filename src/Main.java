public class Main {
    public static void main(String[] args) {
       Cat [] cats=new Cat[3];
       cats[0]=new Cat();
       cats[1]=new Lion();
       cats[2]=new Tiger();
        for (int i = 0; i < cats.length; i++) {
            cats[i].hunt();
            System.out.println("covered distance "+cats[i].run(10*i+1));
        }
    }
}