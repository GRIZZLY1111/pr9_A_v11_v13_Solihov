// Использование класса поездка
fun main() {
    val poezdka1 = Poezdka("123", "Москва", listOf("Пн", "Ср", "Пт"), "18:00", "30 мин")
    val Mezjdunarodnaiapoezdka1 =
        MezjdunarodnaiaPoezdka("456", "Лондон", listOf("Вт", "Чт"), "10:00", "1 час", "Великобритания")

    println(poezdka1.InF())
    println(Mezjdunarodnaiapoezdka1.InF())
}