export default function indoorStartFrag(plant, d, plantDate) {

    const lengthOfDay = (24 * 60 * 60 * 1000);

    if (plant.indoorCalc == -999) {
        return "Don't plant this inside!"
    }
    else { return plantDate = new Date(
        d.getTime() + plant.indoorCalc * lengthOfDay
      ).toDateString();
    // calendarButton();
    };
    
}