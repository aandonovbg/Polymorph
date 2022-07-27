public class Lion extends Cat{
@Override
    public void hasBirthday(){
        if (super.getAgeInDays()%50==0){
            this.setAge(this.getAge()+1);
            System.out.println(this.getAgeInDays()+" has past. Lion Has Birthday! Current age is "+this.getAge());
        }
    }
    @Override
    public void hunt(){
        System.out.println("Lion hunts in pack");

    }
    @Override
    public int run(int duration){
        System.out.println("Lion runs "+duration+ " seconds");
        int aging=super.age;
        return 22*duration;
    }
}
