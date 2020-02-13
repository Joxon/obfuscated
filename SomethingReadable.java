class SomethingReadable {

  // initializing some constants needed
  static char TWO = 0, EXCLAIM = TWO++, SPACE = TWO++, ONE = (char) (TWO / TWO);

  // shorthand for parseByte() (codegolfing handyness)
  static char parseStringToByte(String string) {
    return (char) Byte.parseByte(string, TWO);
  }

  public static void main(String[] args) {
    long ONE = SPACE, ZERO = EXCLAIM; // needed for some weird reason to save bytes

    String STRING_ONE = ((Long) ONE).toString(), STRING_ZERO = ((Long) ZERO).toString(); // creating a 1 and a 0 a string

    char LETTER_L = parseStringToByte(
        STRING_ONE + STRING_ONE + STRING_ZERO + STRING_ONE + STRING_ONE + STRING_ZERO + STRING_ZERO), // binary digit vodoo

        LETTER_E = parseStringToByte(
            STRING_ONE + STRING_ONE + STRING_ZERO + STRING_ZERO + STRING_ONE + STRING_ZERO + STRING_ONE), // more commonly used letters prepared

        LETTER_O = (char) (LETTER_L + TWO + ONE);

    EXCLAIM = parseStringToByte(STRING_ONE + STRING_ZERO + STRING_ZERO + STRING_ZERO + STRING_ZERO + STRING_ZERO);

    SPACE = EXCLAIM++;

    System.out.print(new char[] // assembling the string with arithmetic and more binary stuff
    { parseStringToByte(STRING_ONE + STRING_ZERO + STRING_ZERO + STRING_ONE + STRING_ZERO + STRING_ZERO + STRING_ZERO), // H
        LETTER_E, LETTER_L, LETTER_L, LETTER_O, // hello
        SPACE, // space
        parseStringToByte(STRING_ONE + STRING_ZERO + STRING_ONE + STRING_ZERO + STRING_ONE + STRING_ONE + STRING_ONE), // W
        LETTER_O, (char) (LETTER_O + TWO + ONE), LETTER_L, (char) (LETTER_E - ONE), // world
        EXCLAIM } // !
    );
  }
}