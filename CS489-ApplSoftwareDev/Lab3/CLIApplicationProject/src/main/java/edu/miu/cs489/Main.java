package edu.miu.cs489;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.miu.cs489.model.Customers;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Customers> employees = Arrays.stream(new Customers[]{
                new Customers("SV1089","Daniel","Agar", LocalDate.of(1978,01,17),LocalDate.of(2013,10,10),950.50f),
                new Customers("CK1007","Benard","Shaw", LocalDate.of(2004,10,20),LocalDate.of(2013,10,9),100005.50f),
                new Customers("SV2307","Carly","DeFiori", LocalDate.of(2014,05,16),LocalDate.of(2019,11,4),1555.50f),
                new Customers("CK1423","Wesley","Schneider", LocalDate.of(2001,11,02),LocalDate.of(2001,11,2),125009.55f),
        }).toList();
        try{
            printCustomers(employees);
            getplatinumAccountCustomers(employees);
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }

        }
    public static void printCustomers(List<Customers> customers) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //let's sort customers
        customers = customers.stream().sorted(Comparator.comparing(Customers::getLastName).thenComparing(Customers::getAccountBalance, new Comparator<Float>() {
            @Override
            public int compare(Float o1, Float o2) {
                return Float.compare(o2,o1);
            }
        })).toList();
        System.out.println("\n\nEmployees List with  (By Last name and Account balance)\n--------------------\n");
        System.out.println(mapper.writeValueAsString(customers));
        System.out.println("\n--------------------------\n\n");
    }
    public static void getplatinumAccountCustomers(List<Customers> customers) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        //Let  Sorting the customers in descending order based on accountBalance
        customers = customers.stream()
                .sorted(Comparator.comparing(Customers::getAccountBalance).reversed())
                .collect(Collectors.toList());
        System.out.println("\n\nPrint Customer List (By sorted in descending order of the Accounts’ balance and then Account Number.)\n--------------------\n");
        System.out.println(mapper.writeValueAsString(customers));
        System.out.println("\n--------------------------\n\n");
    }
    }
