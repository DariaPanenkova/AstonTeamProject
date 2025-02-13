package dataclasses;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Randomizer {
    static Random random = Random.from(RandomGenerator.getDefault());

    public static String nameRandomizer() {
        String[] names = new String[]{"Вася", "Лена", "Дима", "Вероника", "Даша", "Петя", "Юра", "Коля", "Миша", "Алёна", "Света", "Женя"};
        return names[Randomizer.random.nextInt(0, names.length)];
    }

    public static String modelRandomizer() {
        String[] names = new String[]{"Пазик", "Икарус", "ГАЗ", "ВАЗ", "BMW"};
        return names[Randomizer.random.nextInt(0, names.length)];
    }

    public static String passwordRandomizer() {
        int size = random.nextInt(5, 12);
        char[] chars = new char[size];
        for (int i = 0; i < chars.length; i++) {
            char ch = (char) random.nextInt(50, 100);
            if (Character.isLetterOrDigit(ch)) {
                chars[i] = ch;
            } else if (i > 0) {
                i--;
            }
        }
        return String.valueOf(chars).trim();
    }

    public static String mailRandomizer() {
        char[] chars = new char[8];
        String[] mail = new String[]{"google", "yandex", "inbox", "mail"};
        String[] dom = new String[]{".com", ".ru", ".by", ".org"};
        for (int i = 0; i < chars.length; i++) {
            char ch = (char) random.nextInt(50, 100);
            if (Character.isLetter(ch) && !Character.isSpaceChar(ch) && !Character.isWhitespace(ch)) {
                chars[i] = ch;
            } else if (i > 0) {
                i--;
            }
        }
        return String.valueOf(chars).trim() + "@" + mail[random.nextInt(0, mail.length)] + dom[random.nextInt(0, dom.length)];
    }

    public static String groupRandomizer() {
        char[] chars = new char[3];
        for (int i = 0; i < chars.length; i++) {
            char ch = (char) random.nextInt(50, 100);
            if (Character.isLetter(ch) && !Character.isSpaceChar(ch) && !Character.isWhitespace(ch) && Character.isUpperCase(ch)) {
                chars[i] = ch;
            } else if (i > 0) {
                i--;
            }
        }
        return String.valueOf(chars).trim() + "-" + random.nextInt(0, 50);
    }

}
