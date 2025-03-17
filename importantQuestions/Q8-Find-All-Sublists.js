const list = [6,9,9,6,6];
const limit = 3;
const divisor = 3;
const abc = [...list,...list];
const findAllTheUniqueSubLists= ()=>{
    const finalList = [];
    const singleList = [];
    const processedUnProcessed = (processed,unProcessed)=>{
        if(processed.length === limit){
            return;
        }
        const firstElem = unProcessed[0];
        for(let i = 0; i<=processed.length; i++){
            if(firstElem%divisor===0){
                let modProcessedList = processed;
                modProcessedList = [...modProcessedList.slice(0,i), firstElem, ...modProcessedList.slice(i)];
                const foundMatchedLists = finalList.filter(list=>list.length === modProcessedList.length);
                for(let j = 0; j<foundMatchedLists.length; j++){
                    let matched = true;
                    for(let k = 0; k<foundMatchedLists[j]; k++){
                        if(foundMatchedLists[j][k]!==modProcessedList[k]){
                            matched=false;
                        }
                    }
                    if(matched){
                        finalList.push(modProcessedList);
                    }
                }
                const modP = modProcessedList;
                const modUP = unProcessed.filter((_,index)=>index!==i);
                processedUnProcessed(modP,modUP);
            }else{
                const modP = processed;
                const modUP = unProcessed.filter((_,index)=>index!==i);
                processedUnProcessed(modP,modUP);
            }
        }
    }
    processedUnProcessed([], list);
    return finalList.length;
}
console.log(findAllTheUniqueSubLists())