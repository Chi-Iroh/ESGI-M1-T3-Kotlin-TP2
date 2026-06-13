import media.Dvd
import media.EnregistrementAudio
import media.Journal
import media.Livre
import media.Magazine

fun main() {
    val bibliotheque = Bibliotheque()
    val livre = Livre("1984", "1972-01-01", "George Orwell", "Gallimard")
    val magazine = Magazine("National Geography", "2024-10-28", "10")
    val journal = Journal("Le Monde", "2024-10-28")
    val dvd = Dvd("Inception", "2010-01-01", 8880, "Action")
    val enregistrementAudio = EnregistrementAudio("Beethoven - Symphonie No.9", "1967-01-01", 960, "Musique classique")

    // On emprunte et consulte
    bibliotheque.emprunter(livre)
    bibliotheque.emprunter(dvd)
    bibliotheque.emprunter(enregistrementAudio)
    bibliotheque.consulter(magazine)
    bibliotheque.consulter(journal)

    // On vérifie que les médias sont bien empruntés
    bibliotheque.afficherEmprunts()

    // On rend les médias
    bibliotheque.retourner(livre)
    bibliotheque.retourner(dvd)
    bibliotheque.retourner(enregistrementAudio)

    // On vérifie qu'ils ont tous été rendus
    bibliotheque.afficherEmprunts()
}
