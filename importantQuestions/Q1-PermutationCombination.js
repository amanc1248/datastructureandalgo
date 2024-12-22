// find all the possible combination of the string "abc"
const findAllTheDifferentCombinations = (string) => {
    const processedUnProcessed = (processed, unProcessed) => {
        // base condition
        if (unProcessed === "") {
            return [processed];
        }

        // recursive call
        const list1 = [];
        const firstLetterOfUnProcessed = unProcessed.charAt(0);
        for (let i = 0; i <= processed.length; i++) {
            const modifiedProcessed = processed.slice(0,i)+firstLetterOfUnProcessed+processed.slice(i);
            const modifiedUnProcessed = unProcessed.slice(1);
            const list2 = processedUnProcessed(modifiedProcessed, modifiedUnProcessed);
            list1.push(...list2);
        }
        return list1;
    }
    const result = processedUnProcessed("", string);
    return result;
}
console.log(findAllTheDifferentCombinations("abc"))