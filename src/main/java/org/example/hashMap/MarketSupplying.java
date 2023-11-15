package org.example.hashMap;

import java.util.Map;
//Попрацюєш бухгалтером магазину? 🛒
//
//        Наш магазин найкращий у місті, тому товари на складі дуже швидко закінчуються. Ми вирішили замовити ще товарів та чекаємо на доставку.
//
//        Реалізуй метод supplyFruits(), який оновить кількість товарів на складі. Він повинен приймати такі параметри:
//
//        Map<String, Integer> storage — поточна кількість товарів на складі;
//        int supply — кількість доставлених товарів.
public class MarketSupplying {
    public Map<String, Integer> supplyFruits(Map<String, Integer> storage, int supply) {
        //напишите тут ваш код
        for (Map.Entry<String, Integer> entry : storage.entrySet()) {
            entry.setValue(entry.getValue() + supply);
        }
        return storage;
    }
}
