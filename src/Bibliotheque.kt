class Bibliotheque {
    private var emprunts = ArrayList<Media>()

    // Fonction générique car l'argument doit à la fois implémenter Empruntable et hériter de Media
    // car on appelle .emprunter() mais la liste des emprunts est une liste de Media
    fun <T> emprunter(media: T)
        where T : Media,
              T : Empruntable
    {
        if (media.emprunter()) {
            emprunts.add(media)
        }
    }

    fun <T> retourner(media: T)
        where T : Media,
              T : Empruntable
    {
        if (media.retourner()) {
            emprunts.remove(media)
        }
    }

    fun consulter(media: Consultable) {
        media.consulter()
    }

    fun afficherEmprunts() {
        if (emprunts.isEmpty()) {
            println("Aucun emprunt en cours !")
            return
        }

        println("Emprunts en cours:")
        for (emprunt in emprunts) {
            print(" - ")
            emprunt.afficher()
        }
    }
}
