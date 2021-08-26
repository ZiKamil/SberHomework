package task1.Model;

public class EmploymentOrder {
    private String number;
    private String name;
    private String employee;
    private String textOrder;
    private enum status{
        generated,
        executed;
    };
    public EmploymentOrder(){

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public String getEmployee(){
        return employee;
    }
    public void setEmployee(String employee){
        this.employee = employee;
    }
    public String getTextOrder(){
        return textOrder;
    }
    public void setTextOrder(String textOrder){
        this.textOrder = textOrder;
    }
    public String getStatus(String type){
        status searchType = status.valueOf(type);
        return searchType.toString();
    }
}
