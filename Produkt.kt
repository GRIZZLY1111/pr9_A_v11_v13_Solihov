// Наследник класса Товар
class Produkt(
    Name: String,
    Price: Double,
    edIzm: String,
    vidTovara: String,
    colvo: Int,
    val srokYears: String
) : Tovar(Name, Price, edIzm, vidTovara, colvo) {
    override fun Inf(): String {
        return super.Inf() + ", Срок годности: $srokYears"
    }
}