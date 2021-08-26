package task1.Model;

public class Main {
    public static void main(String[] args) {
        //Создание письма
        Letter letter = new Letter();
        letter.setNumber("123");
        letter.setName("Письмо");
        letter.setFromWhom("деректору А.С.Петрову");
        letter.setForWhom("программиста Л.П.Иванова");
        //Создание приказа о приеме на работу
        EmploymentOrder employmentOrder = new EmploymentOrder();
        employmentOrder.setNumber("132");
        employmentOrder.setName("Приказ о приеме на работу");
        employmentOrder.setEmployee("Степанов Александр Дмитреевич");
        employmentOrder.setTextOrder("Прошу принять меня на должность прграммиста");
        //Создание приказа на увольнение
        DismissalOrder dismissalOrder = new DismissalOrder();
        dismissalOrder.setNumber("321");
        dismissalOrder.setName("Приказ об уольнении");
        dismissalOrder.setEmployee("Иванов Алексей Антонович");
        dismissalOrder.setTextOrder("Прошу уволить меня с должности прграммиста");
        dismissalOrder.setReasonForDismissal("из-за семейных обстоятельств");

        if(args.length!=0){
            if(args[0].equals("-simple")){
                //Вывод с параметром -simple
                System.out.println("Номер: "+letter.getNumber());
                System.out.println("Наименование: "+letter.getName());
                System.out.println();
                System.out.println("Номер: "+employmentOrder.getNumber());
                System.out.println("Наименование: "+employmentOrder.getName());
                System.out.println();
                System.out.println("Номер: "+dismissalOrder.getNumber());
                System.out.println("Наименование: "+dismissalOrder.getName());
            }
            else{
                System.out.println("Данный атрибут не предусмотрен");
            }
        }
        else {
            //Обычный вывод
            System.out.println("Номер: "+letter.getNumber());
            System.out.println("Наименование: "+letter.getName());
            System.out.println("Для кого: "+letter.getFromWhom());
            System.out.println("От кого: "+letter.getForWhom());
            System.out.println();

            System.out.println("Номер: "+employmentOrder.getNumber());
            System.out.println("Наименование: "+employmentOrder.getName());
            System.out.println("Сотрудник: "+employmentOrder.getEmployee());
            System.out.println(employmentOrder.getTextOrder());
            String statusEmploymentOrder = employmentOrder.getStatus("generated");
            if (statusEmploymentOrder=="generated"){
                System.out.println("Статус: создан");
            }
            System.out.println();

            System.out.println("Номер: "+dismissalOrder.getNumber());
            System.out.println("Наименование: "+dismissalOrder.getName());
            System.out.println("Сотрудник: "+dismissalOrder.getEmployee());
            System.out.println(dismissalOrder.getTextOrder());
            System.out.println(dismissalOrder.getReasonForDismissal());
            String statusDismissalOrder = dismissalOrder.getStatus("generated");
            if (statusDismissalOrder=="generated"){
                System.out.println("Статус: создан");
            }
            System.out.println();

            //Смена статуса и повторный вывод на печать
            statusEmploymentOrder = employmentOrder.getStatus("executed");
            statusDismissalOrder = dismissalOrder.getStatus("executed");
            System.out.println("Номер: "+employmentOrder.getNumber());
            System.out.println("Наименование: "+employmentOrder.getName());
            System.out.println("Сотрудник: "+employmentOrder.getEmployee());
            System.out.println(employmentOrder.getTextOrder());
            if (statusEmploymentOrder=="executed"){
                System.out.println("Статус: исполнен");
            }
            System.out.println();
            System.out.println("Номер: "+dismissalOrder.getNumber());
            System.out.println("Наименование: "+dismissalOrder.getName());
            System.out.println("Сотрудник: "+dismissalOrder.getEmployee());
            System.out.println(dismissalOrder.getTextOrder());
            System.out.println(dismissalOrder.getReasonForDismissal());
            if (statusDismissalOrder=="executed"){
                System.out.println("Статус: исполнен");
            }
            System.out.println();
        }
    }
}
