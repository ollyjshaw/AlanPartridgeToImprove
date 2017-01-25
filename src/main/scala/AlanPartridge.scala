object AlanPartridge {
  val alanisms = List("Pear Tree", "Chat","Dan","Toblerone","Lynn","Alpha Papa","Nomad")

  def findWords(words: List[String]) = {

    var c = 0;
    var numberFound=0
    while (c < words.length){

      var tempCounter=0
      var found=false

      while(tempCounter<=alanisms.length-1 && found==false) {
        println(tempCounter + words(c))
        if (words(c) == alanisms(tempCounter)) {
          tempCounter=0
          found = true
          numberFound = numberFound + 1
        }
        else {
          tempCounter = tempCounter + 1
        }
      }
      c=c+1
    }

    if (numberFound>0)
      "Mines a pint" ++ List.fill(numberFound)("!").mkString
    else
      "I've stood on a spike!"

  }


}
