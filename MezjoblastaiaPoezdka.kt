// Наследник класса Поездка
class MezjoblastaiaPoezdka(
    numberPoezd: String,
    punktnazn: String,
    dayssled: List<String>,
    timeprib: String,
    timest: String,
    val oblastnazn: String
) : Poezdka(numberPoezd, punktnazn, dayssled, timeprib, timest) {
    override fun InF(): String {
        return super.InF() + ", Область назначения: $oblastnazn"
    }
    // Расчет расстояния до области
    fun calculateDistance(): String {
        val distancesToRegions = mapOf(
            "Свердловская область" to 1400,
            "Новосибирская область" to 3000,
            "Краснодарский край" to 1500
        )
        return distancesToRegions[oblastnazn]?.let { distance ->
            "Расстояние до $oblastnazn составляет $distance км."
        } ?: "Расстояние до $oblastnazn неизвестно."
    }

    // Разница во времени
    fun getTimeZoneDifference(): String {
        val timeZoneDifferences = mapOf(
            "Свердловская область" to "+2 часа",
            "Новосибирская область" to "+4 часа",
            "Краснодарский край" to "+0 часов"
        )
        return timeZoneDifferences[oblastnazn] ?: "Разница во времени для $oblastnazn неизвестна."
    }

    // Местные достопримечательности или продукты
    fun getLocalSpecialty(): String {
        val localSpecialties = mapOf(
            "Свердловская область" to "Посетите Екатеринбургский цирк и попробуйте уральские пельмени.",
            "Новосибирская область" to "Не пропустите Новосибирский зоопарк и блюда из сибирской рыбы.",
            "Краснодарский край" to "Отдохните на Черном море и попробуйте местное вино."
        )
        return localSpecialties[oblastnazn] ?: "Информация о достопримечательностях $oblastnazn отсутствует."
    }
}