
import org.scalatest.{FlatSpec, Matchers, WordSpecLike, _}

class AlanPartridgeSpec extends WordSpecLike with Matchers {
  "Calling findWords" should {

    "return I've stood on a spike where an list with no words are passed" in {
      AlanPartridge.findWords(List()) shouldBe "I've stood on a spike!"
    }

    "return I've stood on a spike where a mixed list with no is passed" in {
      AlanPartridge.findWords(List("Cat","Dog", "Lynn", "Lard")) shouldBe "Mines a pint!"
    }

    "return I've stood on a spike where an list with no matching words is passed" in {
      AlanPartridge.findWords(List("Cat","Dog","Lard")) shouldBe "I've stood on a spike!"
    }

    "return mines a pint! with one ! where an list with one matching words is passed" in {
      AlanPartridge.findWords(List("Nomad")) shouldBe "Mines a pint"+ "!"
    }

    "return mines a pint! with one ! where an list with three matching words are passed" in {
      AlanPartridge.findWords(List("Nomad", "Lynn", "Dan")) shouldBe "Mines a pint"+ "!!!"
    }

  }


}
