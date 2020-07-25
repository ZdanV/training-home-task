package classes_task;
//Создать класс, спецификация которого приведена ниже. Определить кон-
//структоры и методы setТип(), getТип(), toString(). Определить дополнительно
//методы в классе, создающем массив объектов. Задать критерий выбора данных
//и вывести эти данные на консоль. В каждом классе, обладающем информацией,
//должно быть объявлено несколько конструкторов.
//Phone: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки,
//Дебет, Кредит, Время городских и междугородных разговоров.
//Создать массив объектов. Вывести:
//a) сведения об абонентах, у которых время внутригородских разговоров
//превышает заданное;
//b) сведения об абонентах, которые пользовались междугородной связью;
//c) сведения об абонентах в алфавитном порядке.


import java.util.ArrayList;

public class MainPhoneOperator {
    public static void main(String[] args) {
        Operator telecom = new Operator("A1");

        telecom.addCustomer(new Customer("Иванов","Иван","Иванович","Брест, ум. Держинского",
                5454545454545L,345.45,456736.60,5353,3456));

        telecom.addCustomer(new Customer("Петров","Петр","Питрович","Минск, Бресткая, 1",
                1111111111111L,1000.00,23.66,1345,664546));

        telecom.addCustomer(new Customer("Сидоров","Иван","Петрович","Кобрин, Минская, 3",
                23571056402749L,113355.37,4346.34,42225,0));

        telecom.addCustomer(new Customer("Уткин","Селезень","Владимирович","Барановичи, Кобринская, 5",
                56304829561048L,226794.35,234850.35,1154656,34535));

        telecom.addCustomer(new Customer("Агосян","Махмуд","Алиевич","д.Упырь, ул. Лесная",
                57205637402739L,336.98,2544645.75,8389,0));

        telecom.addCustomer(new Customer("Уткин","Геннадий","Евдотович","Малорита, БОМЖ",
                56203657208632L,5.03,253666.43,458,855672));

        telecom.addCustomer(new Customer("Воробьев","Дмитрий","Иванович","Гомель, Спасателей, 10",
                72275930573902L,2432568.11,2546746.54,245267,0));


        System.out.println("Абонименты в алфавитном порядке");
        ArrayList<Customer> listName = telecom.getCustomerListByAlphabet();
        for (Customer cust : listName) {
            System.out.println(cust);
        }


        System.out.println("\nАбонименты, которые проговорили во внутренней сети более 10_000 ms:");
        ArrayList<Customer> listLocal = telecom.getCustomerListWithLocal(10000);
        for (Customer cust : listLocal) {
            System.out.println(cust);
        }

        System.out.println("\nСведения об абонентах, которые пользовались междугородной связью");
        ArrayList<Customer> listInternational = telecom.getCustomerListWithInternational(0);
        for (Customer cust : listInternational) {
            System.out.println(cust);
        }
    }
}
