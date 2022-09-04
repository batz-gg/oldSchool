// function f1(first, second) {
//   if (first == null || second == null) return null;
//   let i = first[0];
//   let j = second[0];
//   let result = [];
//   for (let k=0; k<first.length; k++) {
//     if (first[i] == second[j]) {
//       result[k] = first[i];
//       j++;
//     }
//     i++;
//   }
//   return result;
// }

function f(first, second) {
  if ((first || second) == null){
    return null;
  }
  let result = [];
  for (let i = 0; i < first.length; i++) {
    for (let j = 0; j < second.length; j++) {
      if (first[i] === second[j]) {
        result.push(first[i]);
      }
    }
  }
  return result;
}
const array1 = [1, 8, 3, 2], array2 = [4, 2, 6, 1];

const result1 = f(array1, array2);
// const result2 = f([1, 8, 3, 2, 6], [2, 6, 1]);
// const result3 = f([1, 3, 7, 9], [7, 1, 9, 3]);
// const result4 = f([1, 2], [3, 4]);
// const result5 = f([], [1, 2, 3]);
// const result6 = f([1, 2], []);
// const result7 = f([1, 2], null);
// const result8 = f(null, []);
// const result9 = f(null, null);

console.log(result1);