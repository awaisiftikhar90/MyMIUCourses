//package edu.miu.cs489.srm.srm;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import edu.miu.cs489.srm.srm.model.Product;
//import edu.miu.cs489.srm.srm.model.Supplier;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@SpringBootApplication
//public class SrmApplication  implements CommandLineRunner {
//
//    public static void main(String[] args) {
//        SpringApplication.run(SrmApplication.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("___________________JPA/Hibernate___________");
//
//        public void printAllCustomers(List<Supplier> suppliers) {
//            if(suppliers.size() > 0) {
//                System.out.println("[");
//                var sortedCustomers = customers.stream()
//                        .sorted(Comparator.comparing(Customer::getLastName));
////            sortedCustomers.forEach(customer -> System.out.println(customer.toJSONString()));
//                System.out.println(sortedCustomers.map(c -> c.toJSONString())
//                        .collect(Collectors.joining(",")));
//                System.out.println("]");
//            } else {
//                System.out.println("[]");
//            }
//        }
//
//
//// Create a list of suppliers
//       // List<Supplier> suppliers = new ArrayList<>();
//
//        // Add suppliers to the list
//        List<Supplier> suppliers = Arrays.stream(new Supplier[]{
//            new Supplier(1,"Google, Inc",null,new Product(3128874119L,"Pixel 8 Pro",LocalDate.of(2023,1,24),1599.55)),
//            new Supplier(1,"Google, Inc",null,new Product(3128874119L,"Pixel 8 Pro",LocalDate.of(2023,1,24),1599.55)),
//            new Supplier(1,"Google, Inc",null,new Product(3128874119L,"Pixel 8 Pro",LocalDate.of(2023,1,24),1599.55)),
//        }).toList();
//
//        // Print all suppliers
//        for (Supplier supplier : suppliers) {
//            System.out.println(supplier);
//        }
//        public void printAllSuppliers(List<Supplier> suppliers) {
//            if(suppliers.size() > 0) {
//                System.out.println("[");
//                var sortedCustomers = suppliers.stream()
//                        .sorted(Comparator.comparing(Supplier::getName));
////            sortedCustomers.forEach(customer -> System.out.println(customer.toJSONString()));
//                System.out.println(sortedCustomers.map(c -> c.toString())
//                        .collect(Collectors.joining(",")));
//                System.out.println("]");
//            } else {
//                System.out.println("[]");
//            }
//
//        }
//        public static void printSupplierName(List<Supplier> suppliers) throws JsonProcessingException {
//            ObjectMapper mapper = new ObjectMapper();
//            //let's sort employees
//            suppliers = suppliers.stream().sorted(Comparator.comparing(Supplier::getName).thenComparing(Supplier::getProducts, new Comparator<long>() {
//                @Override
//                public int compare(long o1, long o2) {
//                    return long.compare(o1,o2);
//                }
//            })).toList();
//            System.out.println("\n\n\n--------------------\n");
//            System.out.println(mapper.writeValueAsString(suppliers));
//            System.out.println("\n--------------------------\n\n");
//        }
//    }
//}
