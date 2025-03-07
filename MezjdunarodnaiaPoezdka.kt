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
}