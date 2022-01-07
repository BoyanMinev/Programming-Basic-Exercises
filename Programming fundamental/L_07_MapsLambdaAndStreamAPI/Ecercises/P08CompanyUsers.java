package L_07_MapsLambdaAndStreamAPI.Ecercises;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();
        while(!input.equals("End")){
            String[] data = input.split(" -> ");
            String company = data[0];
            String idEmployee = data[1];
            List<String> employees = new ArrayList<>();

            if(!companyEmployees.containsKey(company)){
                employees.add(idEmployee);
                companyEmployees.put(company, employees );
            }else {
                boolean isExist = false;
                for (int i = 0; i < companyEmployees.get(company).size(); i++) {
                    if (companyEmployees.get(company).get(i).equals(idEmployee)){
                        isExist = true;
                    }
                }
                if (!isExist){

                    companyEmployees.get(company).add(idEmployee);
                }
            }


            input = scanner.nextLine();
        }
        companyEmployees.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(e -> {
                            System.out.println(e.getKey());
                            for (String name : e.getValue()) {
                                System.out.println("-- " + name);
                            }
                        }
                        );
    }
}
