package cycles;

import arrays.Ask;
import arrays.CreateArray;

import java.io.IOException;
import java.util.Scanner;

public class UserCycle {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Нажмите клавишу для выбора создаваемого массива, или "0" для отмены\s
                    1 - Автобусы
                    2 - Студенты
                    3 - Пользователи""");
            int type;
            int size = 0;
            try {
                type = Ask.askType(Integer.parseInt(console.nextLine()));
                if (type == 0){
                    break;
                }
                System.out.println("Введите размер создаваемого массива, или \"0\" для отмены");
                size = Integer.parseInt(console.nextLine());
                if (size == 0){
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат номера");
                type = 0;
            }
            try {
                DataInputTypeCycle.inputData(CreateArray.createArray(type,size));
            } catch (NullPointerException e) {
                System.out.println();
            }
        }
        }
    }
