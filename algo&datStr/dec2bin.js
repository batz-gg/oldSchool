function bits(n){
    if(n != 0){
        bits(n/2)
        console.log(n%2)
    }
    return n;
}

bits(10)