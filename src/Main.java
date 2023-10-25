import java.util.*;

//Fa o clasa cu 2 fielduri, id: Integer si someValue: Integer, creeaza-ti 100.000 de obiecte cu valori random intre 1 si 100
//pt someValue, si iduri de la 1 la 100.000, genereaza apoi 100
//de numere random intre 1 si 100.000, trebuie sa printezi fieldul
//"someValue" pt fiecare obiect care are ID = nr tau random generat (din astea 100)
public class Main {
    public static void main(String[] args) {
        Random randNum=new Random();

        Map<Integer, Integer> mapOfClients = new HashMap<>();
        int upperbound=100;
        for (int i=0 ; i<=100000 ; i++){
            Clients client = new Clients(i, randNum.nextInt(upperbound));
            mapOfClients.put(i,client.someVal);
        }
        upperbound=100000;
        for (int j=0;j<=100;j++)
        {
            if (mapOfClients.containsKey(randNum.nextInt(upperbound))){
                System.out.println("The object value with the id: " + randNum.nextInt(upperbound) + " is: " + mapOfClients.get(randNum.nextInt(upperbound)));
            }
        }

    }
}