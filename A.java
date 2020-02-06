class A {

    // initializing some constants needed
    static char a = 0, b = a++, e = a++, f = (char) (a / a);

    // shorthand for parseByte() (codegolfing handyness)
    static char p(String s) {
        return (char) Byte.parseByte(s, a);
    }

    public static void main(String[] z) {
        long x = e, y = b; // needed for some weird reason to save bytes
        String c = ((Long) x).toString(), d = ((Long) y).toString(); // creating a 1 and a 0 a string
        char l = p(c + c + d + c + c + d + d), // binary digit vodoo
                m = p(c + c + d + d + c + d + c), // more commonly used letters prepared
                o = (char) (l + a + f);
        b = p(c + d + d + d + d + d);
        e = b++;
        System.out.print(new char[] // assembling the string with arithmetic and more binary stuff
        { p(c + d + d + c + d + d + d), m, l, l, o, e, p(c + d + c + d + c + c + c), o, (char) (o + a + f), l,
                (char) (m - f), b });
    }
}