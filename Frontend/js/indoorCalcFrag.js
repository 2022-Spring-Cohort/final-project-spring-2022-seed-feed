export default function indoorCalcFrag(plant, d) {
  const lengthOfDay = 24 * 60 * 60 * 1000;

  if (plant.indoorCalc == -999) {
    //WHEN CHANGING THIS STRING, CHANGE STRING ON calendarButton.js LINE 4
    return "Not recommended.";
  } else {
    return new Date(d.getTime() + plant.indoorCalc * lengthOfDay)
      .toDateString()
      .replace(/^\S+\s/, "");

  }
}
