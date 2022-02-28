import java.util.Scanner;
class Sotrud{
    String fam, im, otch, doljnost;
    int oklad;
    int kolDet;
    Child[] childrens = null;
}
class Child{
    String name;
    int age;
}
public class FirmaDeti {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input count");
        int count = sc.nextInt();
        Sotrud[] sotruds = new Sotrud[count];
        System.out.println("Input info");
        sc.nextLine();
        for (int i = 0; i < count; i ++){
            sotruds[i] = new Sotrud();
            System.out.println("fam " + (i+1));
            sotruds[i].fam = sc.nextLine();
            System.out.println("im " + (i+1));
            sotruds[i].im = sc.nextLine();
            System.out.println("otch " + (i+1));
            sotruds[i].otch = sc.nextLine();
            System.out.println("doljnost " + (i+1));
            sotruds[i].doljnost = sc.nextLine();
            System.out.println("oklad " + (i+1));
            sotruds[i].oklad = sc.nextInt();
            System.out.println("count childrens");
            sotruds[i].kolDet = sc.nextInt();
            if(sotruds[i].kolDet !=0){
                sotruds[i].childrens = new Child[sotruds[i].kolDet];
                sc.nextLine();
                for (int j = 0; j < sotruds[i].kolDet; j++){
                    System.out.println("Children name");
                    sotruds[i].childrens[j] = new Child();
                    sotruds[i].childrens[j].name = sc.nextLine();
                    System.out.println("Children age");
                    sotruds[i].childrens[j].age = sc.nextInt();
                }
            }
            sc.nextLine();
        }
        System.out.println("Info about sotr");
        for (int i = 0; i < count; i++){
            System.out.println(sotruds[i].fam + " " + sotruds[i].im + " " + sotruds[i].otch +
                    sotruds[i].doljnost + " " + sotruds[i].oklad);
            if(sotruds[i].kolDet!=0){
                for (Child c : sotruds[i].childrens){
                    System.out.println("Name child " + c.name + " age child " + c.age);
                }
            }
        }
    }
}
