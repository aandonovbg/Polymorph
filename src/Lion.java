public class Lion extends Cat{
    @Override
    public void hunt(){
        System.out.println("Lion hunts in pack");

    }
    @Override
    public int run(int duration){
        System.out.println("Lion runs "+duration+ " seconds");
        return 22*duration;
    }
}
