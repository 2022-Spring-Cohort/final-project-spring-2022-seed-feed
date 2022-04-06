import indoorStartFrag from "./indoorStartFrag.js";
import calendarButton from "./calendarButton.js";

export default function selectedPlantsView(plants, d, stationName){
    console.log(plants + d);
    const lengthOfDay = (24 * 60 * 60 * 1000);
return `
<button class ="backBtn">Back Button</button>
<button onclick="window.print()" class="printBtn">Print this Page</button>
<div class="plantInfo">
<h1>This is the Frost Date 50 percentile  + ${d.toDateString()}</h1>
<h2>Nearest Reporting Weather Station: ${stationName}
${plants
  .map((plant) => {
    return `
    <div class="singlePlant">
    <input type="hidden" class="plantId" value="${plant.id}">
<h1 class="plantName">${plant.name}</h1>
<img class="plantPhoto" src=${plant.photoLink}>
<p>${plant.careTips}</p>
<h3 class="maturityDay"> Days to maturity: ${plant.maturityDays}</h3>
<h3 class="height"> Height: ${plant.height}</h3>
<h3 class="sun"> Sun exposure: ${plant.sunExposure}</h3>
<h3 class="indoorStartH3"> Indoor start date: ${plant.indoorCalc}</h3>


<button class ="clickForRecipeButton">Click for ${plant.name} recipes </button>

<h1>${indoorStartFrag(plant, d)}</h1>
<button id="default-button">Calendar Button${calendarButton(indoorStartFrag(plant, d), plant, d)}</button>

</div>`;
  })
  .join("")}
  
</div>`;


}