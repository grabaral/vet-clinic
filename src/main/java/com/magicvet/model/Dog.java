package main.java.com.magicvet.model;

public class Dog extends Pet{
    public Size getSize() {
        return size;
    }

    private Size size;


    public Dog(){}

    public Dog(Size size){
        this.size = size;
    }

    public Dog(Size size, int age){
        this.size = size;
        setAge(age);
    }
    @Override
    public String toString(){
        return "Pet {"
                +"\n\ttype = " + getType()
                +", name = " + getName()
                +", sex = " + getSex()
                +",age = " + getAge()
                +",size = " + size
                +"\n\t}";
    }



    public void setSize(Size size) {
        this.size = size;
    }

    public enum Size{
        XS(1),
        S(2),
        M(3),
        L(4),
        XL(5),
        UNKNOWN(0);

        private final int value;
        Size(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
