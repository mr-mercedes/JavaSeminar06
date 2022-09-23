package ru.seminar06;

import java.util.Objects;

public class Notebook {
    private String brand;
    private String model;
    private String color;
    private String serialNumber;
    private String operationSystem;
    private int id;
    private String heardDiskVolume;
    private String RAM;


    public Notebook(String brand, String model, String color, String serialNumber, String operationSystem, int id, String heardDiskVolume, String RAM) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.serialNumber = serialNumber;
        this.operationSystem = operationSystem;
        this.id = id;
        this.heardDiskVolume = heardDiskVolume;
        this.RAM = RAM;
    }

    public Notebook(String model, String serialNumber, int id) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.id = id;
    }

    public Notebook(String brand, String model, String color, String operationSystem, String heardDiskVolume, String RAM) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.operationSystem = operationSystem;
        this.heardDiskVolume = heardDiskVolume;
        this.RAM = RAM;
    }

    public Notebook(String brand, String model, String color, String operationSystem, String heardDiskVolume) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.operationSystem = operationSystem;
        this.heardDiskVolume = heardDiskVolume;
    }

    public Notebook(String brand, String model, String color, String operationSystem) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.operationSystem = operationSystem;
    }

    public Notebook(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public Notebook(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Notebook(String brand) {
        this.brand = brand;
    }

    public Notebook() {
    }

    public boolean contains(Object t) {
        if (this == t) return true;
        if (t == null || getClass() != t.getClass()) return false;
        Notebook notebook = (Notebook) t;
        return brand == t || model == t || color == t || operationSystem == t || id == notebook.id || heardDiskVolume == notebook.heardDiskVolume || RAM == notebook.RAM;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                ", id=" + id +
                ", heardDiskVolume=" + heardDiskVolume +
                ", RAM=" + RAM +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(brand, notebook.brand) && Objects.equals(model, notebook.model) && Objects.equals(color, notebook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeardDiskVolume() {
        return heardDiskVolume;
    }

    public void setHeardDiskVolume(String heardDiskVolume) {
        this.heardDiskVolume = heardDiskVolume;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }
}
