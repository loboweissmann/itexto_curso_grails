// pesadelo Java pré 7
BigDecimal delta(BigDecimal a, BigDecimal b, BigDecimal c) {
    return b.multiply(b).minus(new BigDecimal(4).multiply(a).multiply(c))
}

delta(new BigDecimal(2), new BigDecimal(3), new BigDecimal(4))

// groovy
def deltaGroovy(a, b, c) {
    (b*b) - (4*a*c)
}
deltaGroovy(2,3,4)