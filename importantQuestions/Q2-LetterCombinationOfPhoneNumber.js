// Question link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
/**
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function (digits) {
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
    const processedUnProcessed = (processed, unProcessed) => {
        // base condition
        if (unProcessed === "") {
            if (processed) return [processed];
            return []
        }

        // recursive condition
        const firstNumberLetters = letterMapping[unProcessed.charAt(0)];
        let list = [];
        for (let i = 0; i < firstNumberLetters.length; i++) {
            const modifiedProcessed = processed + firstNumberLetters[i];
            const modifiedUnProcessed = unProcessed.slice(1);
            const list2 = processedUnProcessed(modifiedProcessed, modifiedUnProcessed);
            list.push(...list2);
        }
        return list;
    }
    const result = processedUnProcessed("", digits + "");
    return result;
};
console.log(letterCombinations(23))