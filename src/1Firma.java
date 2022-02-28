import java.util.Scanner;
class Sotrudnik{
    String fam, im, otch, doljnost;
    int oklad;
}
public class Firma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input count");
        int count = sc.nextInt();
        Sotrudnik[] sotrudniks = new Sotrudnik[count];
        System.out.println("Input info");
        sc.nextLine();
        for (int i = 0; i < count; i ++){
            sotrudniks[i] = new Sotrudnik();
            System.out.println("fam " + (i+1));
            sotrudniks[i].fam = sc.nextLine();
            System.out.println("im " + (i+1));
            sotrudniks[i].im = sc.nextLine();
            System.out.println("otch " + (i+1));
            sotrudniks[i].otch = sc.nextLine();
            System.out.println("doljnost " + (i+1));
            sotrudniks[i].doljnost = sc.nextLine();
            System.out.println("oklad " + (i+1));
            sotrudniks[i].oklad = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Info about sotr");
        for (int i = 0; i < count; i++){
            System.out.println(sotrudniks[i].fam + " " + sotrudniks[i].im + " " + sotrudniks[i].otch +
                    sotrudniks[i].doljnost + " " + sotrudniks[i].oklad);
        }
    }
}
