def isMultipleof5(n):

    while ( n > 0 ):
        n = n - 5

    if ( n == 0 ):
        return 1

    return 0

print(isMultipleof5(22))
