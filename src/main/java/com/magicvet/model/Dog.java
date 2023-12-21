package main.java.com.magicvet.model;

public class Dog extends Pet{
    private String size;

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
