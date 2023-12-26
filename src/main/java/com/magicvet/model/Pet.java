package main.java.com.magicvet.model;

public abstract class Pet {
    private String type;
    private String sex;
    private String age;
    private String name;

    private String ownerName;

    @Override
    public String toString(){
        return "Pet {"
                +"\n\ttype = " + type
                +", name = " + name
                +", sex = " + sex
                +",age = " + age
                +"\n\t}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
