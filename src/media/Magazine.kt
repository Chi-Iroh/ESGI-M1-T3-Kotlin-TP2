package media

import Media
import Consultable

class Magazine(titre: String, dateDeParution: String, private val numero: String) :
    Media(titre, dateDeParution),
    Consultable
{
    override fun afficher(): Unit {
        println("Magazine: Titre = '${titre}', Numéro = '${numero}', Date de parution = '${dateDeParution}'")
    }

    override fun consulter(): Unit {
        println("Le magazine '${titre}', numéro '${numero}' ('${dateDeParution}') est consulté sur place.")
    }
}
