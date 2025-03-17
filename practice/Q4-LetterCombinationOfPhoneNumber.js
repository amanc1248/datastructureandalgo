/**
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function (digits) {
    const totalCombinations = [];
    const letterMapping = {
        "1": "",
        "2": ["a", "b", "c"],
        "3": ["d", "e", "f"],
        "4": ["g", "h", "i"],
        "5": ["j", "k", "l"],
        "6": ["m", "n", "o"],
        "7": ["p", "q", "r", "s"],
        "8": ["t", "u", "v"],
        "9": ["w", "x", "y", "z"],
        "0": [],
    }
    const modifiedDigits = digits + ""

    const processedUnProcessed = (processed, unProcessed) => {
        if (unProcessed.length === 0) {
            if (processed) {
                totalCombinations.push(processed);
                return
            }

            return;
        }
        const letters = letterMapping[unProcessed.charAt(0)];
        for (let i = 0; i < letters.length; i++) {
            const modProcessed = processed + letters[i];
            if (unProcessed.length > 0) {
                const modifiedUnProcessed = unProcessed.slice(1);
                processedUnProcessed(modProcessed, modifiedUnProcessed);
            }
        }
    }
    processedUnProcessed("", modifiedDigits);
    return totalCombinations
};
console.log(letterCombinations(23))