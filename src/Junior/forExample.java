package Junior;
/*
Операторы циклов - важная часть почти любого языка программирования, поскольку они обеспечивают возможность многократного выполнения
некоторой задачи. Как вы увидите в главе 5, язык Java предлагает мощный набор конструкций циклов. Возможно, наиболее универсальным является цикл
for. Вот простейшая форма цикла for:
for ( инициализация; условие; итерация) опера тор;
В своей самой распространенной форме часть иници ализация цикла
устанавливает переменную управления циклом в начальное значение. Часть
условие представляет собой булевское выражение, которое проверяет переменную управления циклом. Если результат проверки оказывается истинным,
тогда оператор выполняется, а цикл for продолжает работу. При ложном результате проверки цикл завершается. Выражение итерация определяет, каким
образом переменная управления циклом изменяется на каждой итерации цикла. Далее приведена короткая программа, иллюстрирующая работу цикла for:
 */
public class forExample {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 10; x++)
            System.out.println("Значение x: " + x);
/*
Программа генерирует такой вывод:
Значение х: О
Значение х: 1
Значение х: 2
Значение х: 3
Значение х: 4
Значение х: 5
Значение х: 6
Значение х: 7
Значение х: 8
Значение х: 9
В данном примере х - это переменная управления циклом. Она инициализируется нулем в части инициализация цикла for. В начале каждой итерации (включая первую) выполняется условная проверка x<1O. Если результат
проверки оказывается истинным, тоrда выполняется оператор println (),
после чеrо выполняется часть итерация цикла, которая увеличивает значение
х на 1. Процесс продолжается до тех пор, пока условная проверка не станет
ложной.
Интересно отметить, что в профессионально написанных программах на
Java вы практически никогда не встретите часть итерация цикла, написанную
так, как в предыдущей программе. То есть вы будете редко видеть операторы
вроде следующего:
х = х + 1;
Причина в том, что в Java есть специальная операция инкремента, обладающая большей эффективностью, которая обозначается посредством ++ (т.е.
два знака "плюс" подряд). Операция инкремента увеличивает свой операнд
на единицу. С помощью операции инкремента предыдущее выражение можно
записать в показанной ниже форме:
х++;
Таким образом, цикл for в предыдущей программе обычно будет записываться в следующем виде:
for (x = О; x<1O; х++ )
Можете опробовать его. Вы заметите, что цикл выполняется в точности,
как было ранее.
В Java также предлагается операция декремента, обозначаемая как --. Она
уменьшает свой операнд на единицу.
 */
    }
}
