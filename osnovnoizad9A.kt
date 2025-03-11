// Использование класса поездка
fun main() {
    val poezdka1 = Poezdka("123", "Москва", listOf("Пн", "Вт", "Ср"), "18:00", "30 мин")
    val Mezjdunarodnaiapoezdka1 =
        MezjdunarodnaiaPoezdka("456", "Лондон", listOf("Пн", "Вт", "Ср", "Чт"), "10:00", "6 час", "Великобритания")
    val MezjoblastaiaPoezdka1 =
        MezjoblastaiaPoezdka("789", "Екатеринбург", listOf("Вт", "Ср", "Чт"), "12:00", "1 час", "Свердловская область")
    println(poezdka1.InF())
    println(Mezjdunarodnaiapoezdka1.InF())
    println(Mezjdunarodnaiapoezdka1.isVisaRequired()) // Проверка необходимости визы
    println(Mezjdunarodnaiapoezdka1.getCurrency())    // Валюта страны
    println(Mezjdunarodnaiapoezdka1.getTravelAdvice()) // Рекомендации для путешественников
    println(MezjoblastaiaPoezdka1.InF())
    println(MezjoblastaiaPoezdka1.calculateDistance()) // Расстояние до области
    println(MezjoblastaiaPoezdka1.getTimeZoneDifference()) // Разница во времени
    println(MezjoblastaiaPoezdka1.getLocalSpecialty()) // Местные достопримечательности
}