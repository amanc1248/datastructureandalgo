// const getTheMaximumAchievement = (k) => {
//     let list = []
//     const processedUnProcessed = (processed, unProcessed) => {
//         if (unProcessed.length === 0) {
//             return processed;
//         }

//         // let maxSum = processed;
//         for (let i = 0; i < unProcessed.length; i++) {
//             // Select the current element if it's greater than `processed`
//             if (unProcessed[i] > processed) {
//                 const newProcessed = processed + unProcessed[i];

//                 // Create a new array excluding the current element
//                 const remainingArray = unProcessed.filter((_, index) => index !== i);

//                 // Recursively calculate the maximum sum
//                 const sum = processedUnProcessed(newProcessed, remainingArray);

//                 // Keep track of the maximum sum
//                 list.push(...sum)
//             }
//         }
//         return list;
//     };

//     const list2 = processedUnProcessed(0, k);
//     console.log(list2)
// };

// console.log(getTheMaximumAchievement([1, 5, 3, 2, 1]));
