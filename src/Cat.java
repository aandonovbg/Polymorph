public class Cat {
    public static final int PAWS_COUNT =4;
    protected int teeth=20;
    protected int age=0;
    protected int ageInDays=0;


    public void hasBirthday(){
        if (this.getAgeInDays()%40==0){
            this.setAge(this.getAge()+1);
            System.out.println(this.getAgeInDays()+" has past. Has Birthday! Current age is "+this.getAge());
        }
    }
    protected void hunt(){
        System.out.println("Cat is hunting furiously");
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public void setAgeInDays(int ageInDays) {
        this.ageInDays = ageInDays;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAgeInDays() {
        return ageInDays;
    }

    public int getAge() {
        return age;
    }

    public int getTeeth() {
        return teeth;
    }

    public int run(int duration){
        System.out.println("Normal cats runs "+duration+ " seconds");
        return 11*duration;
    }
}
