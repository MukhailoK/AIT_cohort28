1. Наследование (англ. inheritance) — концепция объектно-ориентированного программирования, 
   согласно которой абстрактный тип данных может наследовать данные и функциональность 
   некоторого существующего типа, способствуя повторному использованию компонентов программного 
   обеспечения. В Java абстрактные типы данных называют классами.
2. Один класс может наследовать от другого класса используя специальное слово extends. 
   Родительский класс называют еще супер-классом. Класс наследник, называют дочерним классом. 
   Наследовать разрешено только от одного класса. При помощи насследования, в Java, можно 
   строить сложные иерархии классов.
3. Класс наследник, наследует поля и методы супер-класса. В дочернем классе можно переопределить 
   методы родительского класса, если необходимо изменить, или определить в них новую 
   функциональность. Конструкторы не наследуются (кроме дефолтного, если других конструкторов 
   нет). Кроме модификаторов public, private, существуют еще модификаторы protected и package 
   protected (являющийся дефолтным модификатором).
4. Все классы у которых явно не указан супер-класс, наследуют от класса Object. Например они 
   наследуют от класса Object метод toString, возвращающий строковое представление объекта.
5. Ссылка родительского типа может ссылаться на объект дочернего типа. В этом случае Java сама 
   проведет upper casting. Если попытаться ссылке дочернего типа присвоить значение ссылки 
   родительского типа, то компилятор потребует явно провести кастинг (down casting). При этом, 
   если ссылка родительского типа указывает на другой дочерний объект, то в процессе выполнения 
   кода, произойдет ошибка. Проверить соответствие типов, можно при помощи оператора instanceof.