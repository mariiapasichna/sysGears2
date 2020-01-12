package com.mariiapasichna;

import java.util.Scanner;

public class Main {

    /*Задача:
Вам необходимо создать приложение для автоматизации работы погрузочных кранов, позволяющих перемещать плиты между грузовыми автомобилями на крупной строительной площадке.
Приложение должно предоставлять кранам последовательность разгрузки, оптимальную для переноса груза с автомобиля на автомобиль, учитывая следующее:
● плиты размещаются на автомобилях одна над другой (от 3 до 8 штук в высоту), и отсортированы по весу (от тяжелых - снизу, к легким - сверху)
● кран может снимать и перемещать только самую верхнюю плиту с грузовика, и при разгрузке не может устанавливать более тяжелые плиты на более легкие
● перенос груза с загруженного автомобиля на пустой нужно осуществить используя только одно дополнительное место для временного хранения плит
Входящие параметры:
Количество плит на автомобиле, который требуется разгрузить (от 3 до 8).
Выходные данные:
Стратегия перемещения плит с автомобиля на автомобиль:
● #1 slot_a -> slot_c
● #2 slot_a -> slot_b
● #1 slot_c -> slot_b
● ...
где: ​slot_a - разгружаемый автомобиль, ​slot_b - дополнительное место для промежуточного хранения плит, ​slot c - пустой автомобиль,
куда нужно перенести весь груз, ​#n​ - номер перемещаемой плиты.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of plates for shipment:");
        int numberOfPlates = scanner.nextInt();
        if (PermissibleLoadRange(numberOfPlates)) {
            Crane.craneShippingAlgorithm(numberOfPlates, "a", "c", "b");
        } else {
            System.out.println("Error! The number of plates for shipment from 3 to 8");
        }
    }

    private static boolean PermissibleLoadRange(int numberOfPlates) {
        return numberOfPlates >= 3 && numberOfPlates <= 8;
    }
}