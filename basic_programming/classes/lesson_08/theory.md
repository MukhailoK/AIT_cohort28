1. В Java существует три основных логических оператора: логическое "и" - &&, логическое "или" - ||,
   логическое отрицание - !
2. Аргументы, как и результат логических операций тип boolean
3. Массив в Java определяется как совокупность однотипных данных. Массив занимает смежный участок памяти 
   и имеет фиксированную длину.
4. Определить массива можно например вот так: ``int[] arr = new int[5]``. Таким образом мы задаем массив из пяти целых 
   чисел. 
5. Можно определить массив и сразу инициализировать его например вот так: ``int[] arr = {10,20,30}``. Таким образом мы  
   задаем массив из трех целых чисел: 10, 20, 30
6. Нумерация элементов массива начинается с нуля. Обратиться к элементу массива можно при помощи синтаксиса 
   квадратных скобок. Например вот так: ``arr[0], arr[2]``. Попытка обратиться к элементу массива находящемуся за его 
   пределами приведет к ошибке.
7. Узнать длину массива можно например вот так: ``arr.length``