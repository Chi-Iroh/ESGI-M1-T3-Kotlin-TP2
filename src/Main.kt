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

    // On ajoute les médias dans la bibliothèque pour qu'elle y ait accès
    bibliotheque.ajouterMedia(livre)
    bibliotheque.ajouterMedia(magazine)
    bibliotheque.ajouterMedia(journal)
    bibliotheque.ajouterMedia(dvd)
    bibliotheque.ajouterMedia(enregistrementAudio)

    // On emprunte et consulte
    bibliotheque.emprunter(livre)
    bibliotheque.emprunter(dvd)
    bibliotheque.emprunter(enregistrementAudio)
    bibliotheque.consulter(magazine)
    bibliotheque.consulter(journal)

    println("----------")

    // On vérifie que les médias sont bien empruntés
    bibliotheque.afficherEmprunts()


    println("----------")

    // On rend les médias
    bibliotheque.retourner(livre)
    bibliotheque.retourner(dvd)
    bibliotheque.retourner(enregistrementAudio)

    println("----------")

    // On vérifie qu'ils ont tous été rendus
    bibliotheque.afficherEmprunts()

    println("----------")

    val autreLivre = Livre("Les Fables de la Fontaine - Volume I", "1668-01-01", "Jean de la Fontaine", "Grasset")

    try {
        bibliotheque.consulter(autreLivre)
    } catch (err: IllegalStateException) {
        // Erreur, on doit d'abord ajouter l'ouvrage à la bibliothèque !
        println("On a oublié d'ajouter le livre !")
        bibliotheque.ajouterMedia(autreLivre)
    }
    bibliotheque.consulter(autreLivre)
}
