package task1.Model;

public class DismissalOrder {
    private String number;
    private String name;
    private String employee;
    private String textOrder;
    private String reasonForDismissal;
    private enum status{
        generated,
        executed;
    };
    public DismissalOrder(){

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
    public String getReasonForDismissal(){
        return reasonForDismissal;
    }
    public void setReasonForDismissal(String reasonForDismissal){
        this.reasonForDismissal = reasonForDismissal;
    }
    public String getStatus(String type){
        status searchType = status.valueOf(type);
        return searchType.toString();
    }
}
