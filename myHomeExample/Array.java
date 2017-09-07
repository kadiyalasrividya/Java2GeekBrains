/**
 * Java. My test from JavaRush 
 * Java Book. Mike McGrath
 * Java programming easy steps
 * @author Iurii Leskovetc
 * @version 1.0 dated Sep 07, 2017
 */
 
// Using arrays.

class Array {

    public static void main(String[] args) {
        String[] str = new String[3];
        int[] numInt = new int[4];
        float[] numFloat = new float[2];
        char[] chArr = new char[3];
        boolean[] boolArr = new boolean[5];

        System.out.println("Array String default: " + str[0] + " " + str.length);
        System.out.println("Array int default: " + numInt[0] + " " + numInt.length);
        System.out.println("Array float default: " + numFloat[0] + " " + numFloat.length);
        System.out.println("Array char default: " + chArr[0] + " " + chArr.length);
        System.out.println("Array boolean default: " + boolArr[0] + " " + boolArr.length);
    }
}
/*
.length
copyOf() − предназначен для копирования массива
copyOfRange() − копирует часть массива
toString() − позволяет получить все элементы в виде одной строки
sort() — сортирует массив методом quick sort
binarySearch() − ищет элемент методом бинарного поиска
fill() − заполняет массив переданным значением (удобно использовать, если нам необходимо значение по умолчанию для массива)
equals() − проверяет на идентичность массивы
deepEquals() − проверяет на идентичность массивы массивов
asList() − возвращает массив как коллекцию

Process started >>>
Array String default: null 3
Array int default: 0 4
Array float default: 0.0 2
Array char default: ◦ 3
Array boolean default: false 5
<<< Process finished. (Exit code 0)
*/