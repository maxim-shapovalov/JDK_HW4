import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Directions directions = new Directions();

        directions.addEmployee("Инокентий","Васильев","89922476856",10);
        directions.addEmployee("Степан","Годунов","89995553444",8);
        directions.addEmployee("Григорий","Силантьев","89943335431",15);
        directions.addEmployee("Питер","Стаценко","89993322545",2);
        directions.addEmployee("Алексей","Вменяев","89215557896",5);


        System.out.println(directions);
        System.out.println(directions.searchEmpToEx(8));
        System.out.println("");
        System.out.println(directions.searchNumberByName("Степан"));
        System.out.println("");
        System.out.println(directions.searchEmpToID(4));
    }
}
