package Week2.Wednesday


// Username must be equal to or more than 8 letters long.
// Must all be lowercase

class Username {

  def checkUsername (username: String): Boolean = {
    if (username.length >= 8 && username.toLowerCase == username){
      true  }
    else {
      false
    }
  }





}
