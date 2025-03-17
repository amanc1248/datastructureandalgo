const findAllTheDifferentCombinations = (string) => {
    const entireList = [];
    const processedUnProcessed = (processed, unProcessed) => {
        if (unProcessed === "") {
            entireList.push(processed);
            return;
            // return [processed];
        }

        const firstChar = unProcessed.charAt(0);
        // let list1 = [];
        for (let i = 0; i <= processed.length; i++) {
            const modifiedProcessed = processed.slice(0,i)+firstChar + processed.slice(i);
            const modifiedUnProcessed = unProcessed.slice(1);
            processedUnProcessed(modifiedProcessed, modifiedUnProcessed);
            // list1.push(...list);
        }
        // return list1;
    }
    const list = processedUnProcessed("", string);
    console.log(list);
    return entireList;
}
console.log(findAllTheDifferentCombinations("abc"))