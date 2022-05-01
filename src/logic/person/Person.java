package logic.person;

import java.util.Objects;


public class Person {

    private String name;
    private double weightKg;
    private double heightM;

    public Person() {
    }

    
    
    
    public Person(String name, double weightKg, double heightM) {
        this.name = name;
        this.weightKg = weightKg;
        this.heightM = heightM;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public double getHeightM() {
        return heightM;
    }

    public void setHeightM(double heightM) {
        this.heightM = heightM;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("name=").append(name);
        sb.append(", weightKg=").append(weightKg);
        sb.append(", heightM=").append(heightM);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.weightKg) ^ (Double.doubleToLongBits(this.weightKg) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.heightM) ^ (Double.doubleToLongBits(this.heightM) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (Double.doubleToLongBits(this.weightKg) != Double.doubleToLongBits(other.weightKg)) {
            return false;
        }
        if (Double.doubleToLongBits(this.heightM) != Double.doubleToLongBits(other.heightM)) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }
    
            
}
