package savetofile;

import java.io.*;

public final class SaveToFile {
    private SaveToFile() {}

    public static <T> void saveArray(T[] array, String path){

        try(FileWriter file = new FileWriter(path, true)){
            for (int i = 0; i < array.length; i++) {
                file.write("\n");
                file.write(array[i].toString());
            }
            file.write("\n");
            System.out.println("Сохранение выполнено");
        } catch (IOException e){
            System.out.println("Произошла ошибка");
        }
    }

    public static <T> void saveElement(T element, String path){
        try(FileWriter file = new FileWriter(path, true)){
            file.write(element.toString()+"\n");
            System.out.println("Сохранение выполнено");
        } catch (Exception e){
            System.out.println("Произошла ошибка");
        }
    }

}
