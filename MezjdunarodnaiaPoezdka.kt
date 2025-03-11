// Наследник класса Поездка
class MezjdunarodnaiaPoezdka(
    numberPoezd: String,
    punktnazn: String,
    dayssled: List<String>,
    timeprib: String,
    timest: String,
    val countrynazn: String
) : Poezdka(numberPoezd, punktnazn, dayssled, timeprib, timest) {
    override fun InF(): String {
        return super.InF() + ", Страна назначения: $countrynazn"
    }
    // Проверка необходимости визы
    fun isVisaRequired(): String {
        val countriesRequiringVisa = listOf("Великобритания", "США", "Канада", "Австралия")
        return if (countrynazn in countriesRequiringVisa) {
            "Для поездки в $countrynazn требуется виза."
        } else {
            "Для поездки в $countrynazn виза не требуется."
        }
    }

    // Получение валюты страны
    fun getCurrency(): String {
        val countryCurrencies = mapOf(
            "Великобритания" to "Фунт стерлингов (£)",
            "США" to "Доллар США ($)",
            "Канада" to "Канадский доллар (CAD)",
            "Австралия" to "Австралийский доллар (AUD)"
        )
        return countryCurrencies[countrynazn] ?: "Валюта для $countrynazn неизвестна."
    }

    // Рекомендации для путешественников
    fun getTravelAdvice(): String {
        val travelAdvice = mapOf(
            "Великобритания" to "Обратите внимание на погоду: часто дождливо. Не забудьте зонт.",
            "США" to "Размер чаевых в ресторанах обычно составляет 15-20% от счета.",
            "Канада" to "Зимы могут быть очень холодными. Одевайтесь тепло.",
            "Австралия" to "Будьте осторожны с дикими животными, например, ядовитыми пауками."
        )
        return travelAdvice[countrynazn] ?: "Рекомендации для $countrynazn отсутствуют."
    }
}