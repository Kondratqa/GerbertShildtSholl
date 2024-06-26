package Junior;
/*
Вторая простая программа
Вероятно, никакая другая концепция не является более фундаментальной
для языка программирования, нежели переменная. Возможно, вам уже известно, что переменная представляет собой именованную ячейку памяти, которой
ваша программа может присвоить значение. Значение переменной можно изменять во время выполнения программы. В следующей программе показано,
как объявлять и присваивать значение переменной. В программе также иллюстрируется ряд новых аспектов консольного вывода. Как следует из комментариев в начале программы, файл потребуется назвать Example2 . java.
 */
public class Example2 {
    public static void main(String[] args) {
        int num;
        num = 100;
        System.out.println("Значение num " + 100);

        num = num * 2;

        System.out.println("Значение num * 2: ");
        System.out.println(num);
    }
}
/*
Запустив программу, вы получите следующий вывод:
Значение num: 100
Значение num * 2: 200
Давайте выясним, почему генерируется такой вывод. Ниже приведена новая строка в программе:
int num; // объявление переменной по имени num
В строке объявляется целочисленная переменная по имени num. Подобно
многим другим языкам переменные в Java до своего использования должны
быть объявлены.
Вот как выглядит общая форма объявления переменной:
тип имя-переменной;
Здесь тип указывает тип объявляемой переменной, а имя-переменной -
имя переменной. При желании объявить более одной переменной з аданного
типа можете применять список имен переменных, отделенных друг от друга
запятыми. В Java определено несколько типов данных, включая целочисленный, символьный и числовой с плавающей точкой. Целочисленный тип указывается с помощью ключевого слова int. Следующая строка в программе:
num = 100; // присваивание переменной num значения 100
обеспечивает присваивание переменной num значения 100. Операция присваивания в Java обозначается одиночным з наком равенства.
В показ анной далее строке кода выводится значение num, предваренное
строкой "Значение num: ".
System.out . println ( "Знaчeниe num: "+ num) ;
Знак + в операторе приводит к тому, что значение num добавляется к строке, которая ему предшествует, после чего результирующая строка выводится. (На самом деле з начение num сначала преобраз уется из целочисленного
в эквивалентное строковое и затем объединяется с предшествующей ему
строкой. Этот процесс подробно описан далее в книге.) Такой подход можно
обобщить. Использ уя операцию +, вы можете объединять в одном операторе
println () столько элементов, сколько хотите.
В следующей строке кода переменной num присваивается значение num,
умноженное на 2. Как и в большинстве других языков, операция умножения
в Java обозначается символом *. После выполнения строки кода переменная
num будет содержать значение 200.
Ниже показаны очередные две строки программы:
System . out . print ( "Значение num * 2: " ) ;
System . out . println ( num) ;

Здесь происходит несколько новых вещей. Первым делом с применением встроенного метода print () отображается строка "Значение num * 2: ".
Она не заканчивается символом новой строки, т.е. вывод, генерируемый следующим, будет начинаться в той же самой строке. Метод print () аналогичен
методу println (), но он не выводит символ новой строки после каждого вызова. Взгляните теперь на вызов println (). Обратите внимание, что переменная num используется сама по себе. Методы print () и println () можно
применять для вывода значений любых встроенных типов Java.
 */
