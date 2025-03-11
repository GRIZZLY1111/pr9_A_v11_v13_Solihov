// Наследник класса Товар
class Nofood(
    Name: String,
    Price: Double,
    edIzm: String,
    vidTovara: String,
    colvo: Int,
    val garantperiod: String
) : Tovar(Name, Price, edIzm, vidTovara, colvo) {
    override fun Inf(): String {
        return super.Inf() + ", Гарантийный срок : $garantperiod"
    }
}