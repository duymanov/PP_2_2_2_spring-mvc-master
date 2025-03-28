package web.model;


public class Car {
    private String carBrand;
    private String carModel;
    private int serialNumber;



    public Car(String carBrand, String carModel, int serialNumber) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.serialNumber = serialNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }



}
