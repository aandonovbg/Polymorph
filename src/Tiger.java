public class Tiger extends Cat{
    @Override
    public void hasBirthday(){
        if (super.getAgeInDays()%60==0){
            this.setAge(this.getAge()+1);
            System.out.println(this.getAgeInDays()+" has past. Tiger Has Birthday! Current age is "+this.getAge());
        }
    }
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
