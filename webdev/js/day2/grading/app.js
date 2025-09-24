"use strict";

// TODO-1: Implement getLetterGrade(score)
// Return "A".."F" (or "Invalid") using switch(true) or if/else ranges.
function getLetterGrade(score) {
  // TODO
  // if(score >= 90)
  // {
  //   return "A";
  // }
  // else if(score >= 80)
  // {
  //   return "B";
  // }

  // else if(score >= 70)
  // {
  //   return "C"
  // }

  // else if(score >= 60)
  // {
  //   return "D";
  // }

  // else{
  //   return "F"
  // }

  switch(true){
    case score >= 90: return "A";
    case score >= 80: return "B";
    case score >= 70: return "C";
    case score >= 60: return "D";
    default: return "F";
  }

}

function collectScores() {
  const scores = [];
  while (true) {
    const input = prompt("Enter score (0-100). Cancel to finish:");
    if (input === null) break;
    const num = parseFloat(input);
    if (!Number.isNaN(num) && num >= 0 && num <= 100) {
      scores.push(num);
    } else {
      alert("Invalid score. Please enter a number between 0 and 100.");
      continue;
    }
  }
  return scores;
}

// TODO-2: Implement computeAverage(scores) as an arrow function
// Return NaN for empty array.
const computeAverage = (scores) => {
  // TODO
  if(scores.length === 0)
  {
    return NaN;
  }
  let avg = 0;
  for(let i = 0; i < scores.length; i++){
    avg += scores[i];
  }
  return avg/scores.length;
};

function showResults(scores) {
  if (!scores || scores.length === 0) {
    alert("No scores entered.");
    return;
  }
  const tableRows = scores.map((s, i) => ({ Index: i + 1, Score: s, Grade: getLetterGrade(s) }));
  console.table(tableRows);
  const avg = computeAverage(scores);
  const avgGrade = getLetterGrade(avg);
  let report = "Results:\n";
  tableRows.forEach((r) => {
    report += `Score: ${r.Score} → Grade: ${r.Grade}\n`;
  });
  report += `\nClass Average: ${Number.isNaN(avg) ? "NaN" : avg.toFixed(2)} → Grade: ${avgGrade}`;
  alert(report);
}

function main() {
  const scores = collectScores();
  showResults(scores);
}

document.getElementById("start").addEventListener("click", main);
