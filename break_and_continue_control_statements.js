// continue and break are control/jumping statement
// We use break to jump out of the loop once the condition in the IF staement is true or met
// We use continue to skip the values provided in the IF statement and continue by moving to the next 
 //value. eg In  example below 70, 80, 90,will be skipped and will not be printed

 //for  - is a looping satement. 

for (let examscore = 20; examscore <= 100; examscore = examscore + 10 ) {
    if (examscore == 60 || examscore == 70 || examscore == 80 ) 
    continue; //meaning skips those numbers and continue on 90
    console.log("You scored "+ examscore + "% Your score is too low and you failed ");
    
}

// the code below the loop will break and jump out of looping when evennumer becomes 8 
for (let evennumber = 2; evennumber <= 20; evennumber = evennumber + 2) {
    console.log("number ", evennumber)
if (evennumber == 8) {
   break; //stops the loop
  }
}
