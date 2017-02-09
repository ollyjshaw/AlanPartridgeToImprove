object AlanPartridge {

  val alanisms = List("Pear Tree", "Chat","Dan","Toblerone","Lynn","Alpha Papa","Nomad")

  def findWords(words: List[String]) = {
    val numberFound = words.filter(alanisms.contains(_)).size
    constructPhrase(numberFound)
  }

  private def constructPhrase(termsFound: Int) = {
    if (termsFound>0)
      "Mines a pint" ++ List.fill(termsFound)("!").mkString
    else
      "I've stood on a spike!"
  }
}
