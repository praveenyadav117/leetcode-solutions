/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(array) {

   let isDuplicate = false;
   let set = new Set();

  array.forEach((element) => {
    if (set.has(element)) {
      isDuplicate = true;
    }
    else{
        set.add(element);
    }
  });

  return isDuplicate;
//     for (let i = 0; i < array.length - 1; i++) {
//     for (let j = i + 1; j < array.length; j++) {
//       if (array[i] === array[j]) {
//         return true; // Found a duplicate
//       }
//     }
//   }
//   return false; // No duplicates found

};