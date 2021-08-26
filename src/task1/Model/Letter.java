package task1.Model;

public class Letter {
    private String number;
    private String name;
    private String fromWhom;
    private String forWhom;

    public Letter(){

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

    public String getFromWhom(){
        return fromWhom;
    }
    public void setFromWhom(String fromWhom){
        this.fromWhom = fromWhom;
    }

    public String getForWhom(){
        return forWhom;
    }
    public void setForWhom(String forWhom){
        this.forWhom = forWhom;
    }
}
