import java.util.Scanner;
class Strana{
    String name;
    double square;
}
public class Country {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("count");
        int count = sc.nextInt();
        Strana countries[] = new Strana[count];
        for (int i = 0; i < count; i++) {
            sc.nextLine();
            countries[i] = new Strana();
            System.out.println("Input name " + (i + 1));
            countries[i].name = sc.nextLine();
            System.out.println("Input square " + (i + 1));
            countries[i].square = sc.nextDouble();
        }
        sc.nextLine();
        System.out.println("Name \t square");
        for (int i = 0; i < count; i++) {
            System.out.println(countries[i].name + "\t" + countries[i].square);
        }
        /* Определить страну с макс площадью */
        int indexMax = 0;
        double squareMax = countries[indexMax].square;
        for (int i = 1; i < count; i++) {
            if (countries[i].square > squareMax) {
                indexMax = i;
                squareMax = countries[indexMax].square;
            }
        }
        System.out.println("Country " + countries[indexMax].name + " with max square " + countries[indexMax].square);
        /* сортировка по возрастанию */
        for (int i = 0; i < countries.length - 1; i++) {
            for (int j = 0; j < countries.length - j - 1; j++) {
                if (countries[i].square > countries[i + 1].square) {
                    Strana temp = countries[i];
                    countries[i] = countries[i + 1];
                    countries[i + 1] = temp;
                }
            }
        }
        System.out.println("Sort by square");
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i].name + "\t" + countries[i].square);
        }
        for (int i = 0; i < countries.length - 1; i++) {
            for (int j = 0; i < countries.length - i - 1; i++) {
                if (countries[i].name.compareTo(countries[i + 1].name) > 0) {
                    Strana temp = countries[i];
                    countries[i] = countries[i + 1];
                    countries[i + 1] = temp;
                }
            }
        }
        System.out.println("Sort by name");
        for (int i = 0; i < countries.length; i++) {
            System.out.println(countries[i].name + "\t" + countries[i].square);
        }
        /*подсчитать среднюю площадь введенных стран и определить страну с площадью больше средней */
        double squareSum = 0;
        for (int i = 0; i < countries.length; i++){
            squareSum = squareSum + countries[i].square;
        }
        double avgSquare = squareSum/count;
        System.out.println("avgSquare = " + avgSquare);
        System.out.println("Contries with square > avgSquare");
        for (int i = 0; i < countries.length; i++){
            if(countries[i].square > avgSquare){
                System.out.println(countries[i].name + "\t" + countries[i].square);
            }
        }
        //найти страну по названию введенному пользователем
        System.out.println("Input name");
        String searchName = sc.nextLine();
        int indexSearch = -1;
        for (int i = 0; i < countries.length; i++){
            if (countries[i].name.equalsIgnoreCase(searchName)){
                indexSearch = i ;
            }
        }
        if (indexSearch != -1){
            System.out.println("Country found");
            System.out.println(countries[indexSearch].name + "\t" + countries[indexSearch].square);
        }
        else{
            System.out.println("Not found");
        }
    }
}