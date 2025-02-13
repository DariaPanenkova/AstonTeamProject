package cycles;

import arrays.Ask;
import arrays.CreateArray;
import savetofile.SaveToFile;
import sortdir.quicksorts.DataQuickSort;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
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
                if (type == 0) {
                    break;
                }
                System.out.println("Введите размер создаваемого массива, или \"0\" для отмены");
                size = Integer.parseInt(console.nextLine());
                if (size == 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат номера");
                type = 0;
            }
            try {
                Object[] array = DataInputTypeCycle.inputData(CreateArray.createArray(type, size));
                DataQuickSort<Object> sortData = new DataQuickSort<>();
                System.out.println("Отсортированный массив:\n" + Arrays.toString(sortData.sort(array)));
                Object[] arr = sortData.sort(array);
                SearchCycle<Object> search = new SearchCycle<>();
                System.out.println("Хотите сохранить отсортированный массив?\n\"+\" - да");
                if (Objects.equals(console.nextLine(), "+")) {
                    SaveToFile.getPathAndSave(sortData.sort(array));
                }
                int index = 0;
                System.out.println("Хотите найти объект в массиве?\n\"+\" - да");
                if (Objects.equals(console.nextLine(), "+")) {
                    index = search.search(arr);
                    if (index == -1) {
                        continue;
                    }
                }
                System.out.println("Хотите сохранить объект в файл?\n\"+\" - да");
                if (Objects.equals(console.nextLine(), "+")) {
                    SaveToFile.getPathAndSave(arr[index]);
                }

            } catch (NullPointerException e) {
                System.out.println();
            }
        }
    }
}
