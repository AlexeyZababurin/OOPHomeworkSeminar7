## Урок 7. ООП Дизайн и Solid ч.2
Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
Соблюдать принципы SOLID, паттерны проектирования.

## По реализации
Созданы классы Calculator (основное меню и точка входа) и ComplexNumber (определение сущности комплексного числа и методы операций с комплексными числами). Результаты операций сложения, вычитания, умножения и деления выводятся на консоль, а также залогированы с использованием декоратора Logger (LoggerView). Используется реализация Logger - ConsoleLogger. Принципы SOLID используются SRP, OCP и LSP (всех операций используется общий интерфейс ComplexNumber). Распределение по папкам не использовалось так как проект небольшой.