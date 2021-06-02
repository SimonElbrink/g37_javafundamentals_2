package se.lexicon.simon.model;

public class Car { //start of Car class

    private static int counter = 0;
    private String brand;
    private String regNumber;

    static {

        counter++;
    }

    //behavior
    public void getInformation(){
        System.out.println("Brand: " + brand + " regNumber: " +regNumber);
    }

    public void setBrand(String brandToSet){
        brand = brandToSet;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }


} //End of Car class
