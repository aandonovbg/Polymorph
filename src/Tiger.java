public class Tiger extends Cat{
    @Override
    public void hunt(){
        System.out.println("Tiger hunts alone");
    }
    @Override
    public int run(int duration){
        System.out.println("Tiger runs "+duration+ " seconds");
        return 16*duration;
    }
}
