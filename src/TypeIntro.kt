//track whether the player

fun main() {
    var experiencePoints: Int = 5;
    val playerName: String = "Estragon";
    experiencePoints += 5;
    println(experiencePoints);
    println(playerName);
    var hasSteed: Boolean = false; //He does not have a dragon
    The_player(hasSteed);
    var magic = playerName.reversed();
    println(magic);
}
class TypeIntro {
}

fun The_player(hasSteed:Boolean):Unit{

    if(hasSteed==false){ println("He does not have a dragon or minotaur ")}
    if(hasSteed==true){ println("He has a dragon or minotaur")}
}
