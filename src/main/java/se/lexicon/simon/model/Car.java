package se.lexicon.simon.model;

public class Car { //start of Car class

    //Protecting Your fields
    private String brand;
    private String regNumber;


    //behaviors
    public void getInformation(){
        System.out.println("Brand: " + brand + " regNumber: " +regNumber);
    }

    //Setters | Controlling the usages of setting.
    public void setBrand(String brandToSet){
        brand = brandToSet;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }


} //End of Car class
