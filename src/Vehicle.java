import javax.swing.*;

public class Vehicle {
    private int power;      // kw
    private double weight;  // kg
    private String name;

                                                                    //Full-Constructor
    public Vehicle(String name, int power, double weight){
        this.power = power;
        this.weight = weight;
        this.name = name;
    }
                                                                    //Standard-Constructor
    public Vehicle(){}

    public String printName(){
        return name;
    }
    public void calculatePower(){
        JOptionPane.showMessageDialog(null, power +" kW sind in PS = " + Math.round(kWinPS()));
    }
    private double kWinPS(){
        return this.power * 1.36;
    }
                                        // Getter & Setter
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
