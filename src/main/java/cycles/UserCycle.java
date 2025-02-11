package cycles;

import arrays.CreateArray;
import java.util.Scanner;

public class UserCycle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Нажмите клавишу для выбора создаваемого массива, или "0" для отмены\s
                    1 - Автобусы
                    2 - Студенты
                    3 - Пользователи""");
            String line = console.nextLine();
            if (line.equalsIgnoreCase("0")) {
                break;
            }
            switch (line) {
                case "1": {
                    if (CreateArray.createBusesArray() == 0) {
                        break;
                    }
                    break;
                }
                case "2": {
                    if (CreateArray.createStudentsArray() == 0) {
                        break;
                    }
                    break;
                }
                case "3": {
                    if (CreateArray.createUsersArray() == 0) {
                        break;
                    }
                    break;
                }
                default:
                    System.out.println("Неверный формат номера\n");
            }
        }
    }
}
