package pl.akademiakodu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Lukasz Kolacz on 26.05.2017.
 */
public class Homework {
    public static void main(String[] args) {

        System.out.println("------------------------------ 1 ------------------------------");

        List<Company> companyList = new ArrayList<>();
        companyList.add(new Company("ArtaTech", "Wroclaw"));
        companyList.add(new Company("Helion", "Gliwice"));
        companyList.add(new Company("Midiapolis", "Wroclaw"));
        companyList.add(new Company("SpecShop", "Poznan"));
        companyList.add(new Company("AkademiaKodu", "Warszawa"));

        List<String> compName = companyList.stream()
                .map(s -> s.getCompanyName())
                .collect(Collectors.toList());
        System.out.println("Nazwy firm: " + compName);

        System.out.println("------------------------------ 2 ------------------------------");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Lukasz", "Kolacz", "ArtaTech"));
        employeeList.add(new Employee("Adam", "Kaczmarek", "Midiapolis"));
        employeeList.add(new Employee("Oskar", "Reily", "Helicon"));
        employeeList.add(new Employee("Gniewomir", "Nurkowski", "SpecShop"));
        employeeList.add(new Employee("Viktor", "Rammstein", "ArtaTech"));
        employeeList.add(new Employee("Michal", "Makaruk", "AkademiaKodu"));

//          ---------------------------- map --------------------------------
        Map<String, List<Employee>> groupByCompany = employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.getCompany()));

        groupByCompany.forEach((company, e) -> System.out.println(e.toString()));


    }
}
