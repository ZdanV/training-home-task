package classes_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Operator {

    private String operatorName;
    private ArrayList<Customer> customerList = new ArrayList<>();

    Operator(String operatorName){
        this.operatorName = operatorName;
    }

    void addCustomer(Customer customer){
        customerList.add(customer);
    }

    public String getOperatorName(){
        return operatorName;
    }

    public ArrayList<Customer> getCustomerListByAlphabet(){
        ArrayList<Customer> custlist = new ArrayList<>(customerList);
        Collections.sort(custlist, new Comparator<Customer>() {
            @Override
            public int compare(Customer cust1, Customer cust2) {
                return cust1.getName().compareToIgnoreCase(cust2.getName());
            }
        });
        return custlist;
    }

    public ArrayList<Customer> getCustomerListWithInternational(long timeInternational){
        ArrayList<Customer> custlist = new ArrayList<>();
        for (Customer cust : customerList){
            if (cust.getTimeInternational() > timeInternational){
                custlist.add(cust);
            }
        }
        return custlist;
    }

    public  ArrayList<Customer> getCustomerListWithLocal(long timeLocal){
        ArrayList<Customer> custlist = new ArrayList<>();
        for (Customer cust : customerList){
            if (cust.getTimeLocal() > timeLocal){
                custlist.add(cust);
            }
        }
        return custlist;
    }
}
