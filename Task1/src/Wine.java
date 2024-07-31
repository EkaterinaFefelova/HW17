import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String name;
    private Brand brand;
    private Country country;
    private LocalDate manufactureDate;
    private String description;

    public Wine(String name, Brand brand, Country country, LocalDate manufactureDate, String description) {
        this.name = name;
        this.brand = brand;
        this.country = country;
        this.manufactureDate = manufactureDate;
        this.description = description;
    }

    public Wine() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAgeInYears (LocalDate currentDate){
        return Period.between(this.manufactureDate, currentDate).getYears();
    }
}
