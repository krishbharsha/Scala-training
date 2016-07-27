object GCD {
    def gcd(x: Int, y: Int): Int = {
        if (x < y) gcd(y, x) else if (y == 0) x else if (x % y == 0) y else gcd(y, x % y)
    }
}
