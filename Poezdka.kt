// Основной класс Поездка
open class Poezdka(
    val numberPoezd: String,
    val punktnazn: String,
    val dayssled: List<String>,
    val timeprib: String,
    val timest: String
) {
    open fun InF(): String {
        return "Поездка: $numberPoezd, Пункт назначения: $punktnazn, " +
                "Дни следования: ${dayssled.joinToString(", ")}, " +
                "Время прибытия: $timeprib, Время стоянки: $timest"
    }
}