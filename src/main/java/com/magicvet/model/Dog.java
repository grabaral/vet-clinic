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
                +", sex = " + getSex()
                +", age = " + getAge()
                +", name = " + getName()
                +", size = " + getSize()
                +", ownerName = " + getOwnerName()
                +", registrationDate = " + getRegistrationDate().format(FORMATTER)
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

        public static Size fromString(String value){
           /*for (Size size : values()){
                if(size.toString().equals(value)){
                    return size;
                }
            }
            System.out.println("Unable to parse value '"+value+"'. Using default value: "+UNKNOWN);
            return UNKNOWN;*/
            Size size;
            try {
                size = Size.valueOf(value);
            } catch (IllegalArgumentException e) {
                System.out.println("Unable to parse value '"+value+"'. Using default value: "+UNKNOWN);
                size = Size.UNKNOWN;
            }
            return size;
        }

        public int getValue() {
            return value;
        }
    }
}
