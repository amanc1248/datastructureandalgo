const getTheMaximumAchievement = (numbers)=>{
    const finalList = [];
    const processedUnProcessed = (processed, unProcessed)=>{
        if(unProcessed.length===0){
            finalList.push(processed);
            processed = 0;
            return;
        }

        for(let i = 0; i<unProcessed.length; i++){
            // check
            if(unProcessed[i]>processed){
                const processed1 = processed + unProcessed[i];
                const newArray = unProcessed.filter((_, index) => index !== i);

                processedUnProcessed(processed1, newArray)
            }else{
                const processed1 = processed ;

                const newArray = unProcessed.filter((_, index) => index !== i);

                processedUnProcessed(processed1, newArray)
            }
        }

    }
    processedUnProcessed(0, numbers);
    const theMax = Math.max(...finalList)
    return theMax;
}
console.log(getTheMaximumAchievement([1, 5, 3,4,5,6,12,23,1,1,1,1,1,1,1]));
