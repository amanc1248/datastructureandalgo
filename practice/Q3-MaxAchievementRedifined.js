const getTheMaximumAchievement = (numbers) => {
    const memo = new Map(); // For memoization

    const processedUnProcessed = (processed, unProcessed) => {
        const key = `${processed}-${unProcessed.join(",")}`;
        if (memo.has(key)) return memo.get(key);

        if (unProcessed.length === 0) {
            return processed;
        }

        let maxAchievement = processed;

        for (let i = 0; i < unProcessed.length; i++) {
            if (unProcessed[i] > processed) {
                // Add the current number to processed
                const newProcessed = processed + unProcessed[i];
                const newUnProcessed = unProcessed.slice(0, i).concat(unProcessed.slice(i + 1));

                // Recursive call
                maxAchievement = Math.max(
                    maxAchievement,
                    processedUnProcessed(newProcessed, newUnProcessed)
                );
            }
        }

        memo.set(key, maxAchievement);
        return maxAchievement;
    };

    return processedUnProcessed(0, numbers);
};

console.log(getTheMaximumAchievement([1, 5, 3])); // Output: 9
// console.log(getTheMaximumAchievement([1, 5, 3,4,5,6,12,23,1,1,1,1,1,1,1,34])); // Output: 8
