package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Glam")
public class Glam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String cosmeticName, cosmeticFor, cosmeticBrand, manufacturedIn;
    int cosmeticPrice;
    String expiryDate;
    public Glam(int id, String cosmeticName, String cosmeticFor, String cosmeticBrand, String manufacturedIn,
            int cosmeticPrice, String expiryDate) {
        this.id = id;
        this.cosmeticName = cosmeticName;
        this.cosmeticFor = cosmeticFor;
        this.cosmeticBrand = cosmeticBrand;
        this.manufacturedIn = manufacturedIn;
        this.cosmeticPrice = cosmeticPrice;
        this.expiryDate = expiryDate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCosmeticName() {
        return cosmeticName;
    }
    public void setCosmeticName(String cosmeticName) {
        this.cosmeticName = cosmeticName;
    }
    public String getCosmeticFor() {
        return cosmeticFor;
    }
    public void setCosmeticFor(String cosmeticFor) {
        this.cosmeticFor = cosmeticFor;
    }
    public String getCosmeticBrand() {
        return cosmeticBrand;
    }
    public void setCosmeticBrand(String cosmeticBrand) {
        this.cosmeticBrand = cosmeticBrand;
    }
    public String getManufacturedIn() {
        return manufacturedIn;
    }
    public void setManufacturedIn(String manufacturedIn) {
        this.manufacturedIn = manufacturedIn;
    }
    public int getCosmeticPrice() {
        return cosmeticPrice;
    }
    public void setCosmeticPrice(int cosmeticPrice) {
        this.cosmeticPrice = cosmeticPrice;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

}
