package main.java.com.magicvet.model;

public class Dog extends Pet{
    public String getSize() {
        return size;
    }

    private String size;
    public static final String XS = "XS";
    public static final String S = "S";
    public static final String M = "M";
    public static final String L = "L";
    public static final String XL = "XL";

    public Dog(){}

    public Dog(String size){
        this.size = size;
    }

    public Dog(String size, int age){
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



    public void setSize(String size) {
        this.size = size;
    }
}
