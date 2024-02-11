package main.java.com.magicvet.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Pet {
    static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
    private String type;
    private String sex;
    private int age;
    private String name;

    private HealthState healthState;

    private String ownerName;

    private final LocalDateTime registrationDate = LocalDateTime.now();

    @Override
    public String toString(){
        return "Pet {"
                +"\n\ttype = " + type
                +", name = " + name
                +", sex = " + sex
                +", age = " + age
                +", ownerName = " + ownerName
                +", registrationDate = " + registrationDate.format(FORMATTER)
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

    public int getAge() {
        return age;
    }

    public HealthState getHealthState() {
        return healthState;
    }

    public void setHealthState(HealthState healthState) {
        this.healthState = healthState;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public enum HealthState{
        VeryBad(1),
        Bad(2),
        Normal(3),
        Good(4),
        VeryGood(5),
        UNKNOWN(0);
        private final int value;
        HealthState(int value)
        {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
