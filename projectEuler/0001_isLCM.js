function isLCM(n, div1, div2){
  total = 0
  for(i = 1; i < n; i++){
    if(i % div1 == 0 || i % div2 == 0){
			total += i
    } 
  }
  return total
}

isLCM(1000 , 3, 5)