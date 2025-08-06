public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int temp_value;
        int count = 0;
        for (int i = 0; i < array.length - 1; i = i + 2) {
            if (array[i + 1] < array[i]) {
                temp_value = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp_value;
            }
            count += 2;
            //одно сравнение за цикл и одно за if.
            //За цикл считаем так, как он вспомогательный и без него можно было обойтись
            //учитываем, что каждый if надо засчитывать независимо от того, зашли мы внутрь тела самого условия или нет
        }

        int min = array[0];
        int max = array[1];
        // далее сравнение в цикле игнорируем т.к. без него не обойтись никак вообще, это основной цикл.
        // технически говоря такое сравнение тоже подлежит учету, но для простоты его игнорируют.
        for (int i = 2; i < array.length; i = i + 2) {
            count++; //это увеличение count за уточнение того, на последнем ли мы элементе (if ниже, 25 строка)
            if (i != array.length - 1) {
                if (array[i + 1] <= min) {
                    min = array[i];
                } else {
                    if (array[i + 1] >= max) {
                        max = array[i + 1];
                    }
                    if (array[i] <= min) {
                        min = array[i];
                    }
                    count = count + 2;//собственно два основных внутренних условия
                }
                count++;//это if в 26 строчке
            } else {
                if (array[i] >= max) {
                    max = array[i];
                } else {
                    if (array[i] <= min) {
                        min = array[i];
                    }
                    count++;//условие включается если основное не сработало
                }
                count++;//основное условие в этом блоке
            }
        }

        //for (int i = 0; i < array.length; i++) {System.out.println(array[i]);}
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Сравнений: " + count);
        System.out.println("Цель: " + (3 * array.length / 2));
        System.out.println("Длина массива: " + array.length);

    }
