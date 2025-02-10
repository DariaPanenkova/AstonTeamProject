package saveToFile;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class SaveArray<T> {


    public void saveArray(T[] array){
        System.out.println("Введите путь файла, в который будет призведено сохранение:");
        try(BufferedReader bufferedWriter = new BufferedReader(new InputStreamReader(System.in));
            FileWriter file = new FileWriter(bufferedWriter.readLine(), true)){
            for (int i = 0; i < array.length; i++) {
                file.write("\n");
                file.write(array[i].toString());
            }

        } catch (Exception e){
            System.out.println(e.getCause());
        }

    }

}
