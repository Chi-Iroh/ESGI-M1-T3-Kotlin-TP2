import media.Livre

fun main() {
    val livre1984 = Livre("George Orwell", "Gallimard", "1984", "1972-01-01")

    livre1984.afficher()

    livre1984.consulter()
    livre1984.emprunter()
    livre1984.retourner()
}