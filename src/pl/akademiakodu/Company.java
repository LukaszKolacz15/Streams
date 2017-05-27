package pl.akademiakodu;

/**
 * Created by Lukasz Kolacz on 26.05.2017.
 */
public class Company {

    private String companyName;
    private String companyCity;

    public Company(String companyName, String companyCity) {
        this.companyName = companyName;
        this.companyCity = companyCity;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }
}
