import indoorStartFrag from "./indoorStartFrag.js";
import calendarButton from "./calendarButton.js";
import indoorCalcFrag
 from "./indoorCalcFrag.js";


export default function selectedPlantsView(plants, d, stationName){
    console.log(plants + d);
    const lengthOfDay = (24 * 60 * 60 * 1000);
return `

<div class="backButton">
<img class ="backBtn" src="/img/back_arrow.png">
<button onclick="window.print()" class="printBtn">Print this Page</button>
</div>
<div class="frostDate">
<h2>Your average last frost date is ${d.toDateString()}</h2>
</div>

<div class="plantInfo">
${plants
  .map((plant) => {
    return `
    <div class="singlePlant">
    <input type="hidden" class="plantId" value="${plant.id}">
<div class="plantNameAndImg">
    <h2 class="plantName">${plant.name}</h2>
<img alt="Image of ${plant.name}" class="plantPhotoSingle" src=${
      plant.photoLink
    }>
</div>
<div class="careTips">
<h2>Care Tips:</h2>
<p class="careTipsWords">${plant.careTips}</p>
</div>

<div class="plantDetails">
<h2>Plant Info:</h2>
<h3 class="maturityDay"> Days to maturity: ${plant.maturityDays}</h3>
<h3 class="height"> Height: ${plant.height} inches</h3>
<h3 class="sun"> Sun exposure: ${plant.sunExposure}</h3>
<h3>Indoor start date: ${indoorCalcFrag(plant, d)}</h3>
<h3>Outdoor start date: ${d.toDateString()}</h3>
</div>

<div class="companionDiv">
<p class="companion">Recommended Companion Plants: ${plant.companionPlants}</p>
</div>

<div class="plantRecButton">
<button class ="clickForRecipeButton">${plant.name} recipes </button>
</div>

<div class="plantCalBtn">
<button id="default-button">${calendarButton(
      indoorStartFrag(plant, d),
      plant,
      d
    )}</button>
</div>

</div>`;
  })
  .join("")}

<div class="weatherDiv">
  <p class="stationDisplay">All data is pulled using your nearest weather station: ${((stationName.toLowerCase(stationName)))}</p>

</div>`;




}

//   Check out the care tips and even browse our recipes page for inspiration on what to cook once your plant is ready to harvest!
// And, we know life gets busy, so we’ve got you covered! Add a calendar reminder with just a simple click.