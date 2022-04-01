export default function selectedPlantsView(plants){
return`
<div class="plantInfo">
${plants.map(plant => {
return`
<h1 class="plantName">${plant.name}</h1>
<img class="plantPhoto" src=${plant.photoLink}>
<h3 class="maturityDay"> Days to maturity: ${plant.maturityDays}</h3>
<h3 class="height"> Height: ${plant.height}</h3>
<h3 class="sun"> Sun exposure: ${plant.sunExposure}</h3>
<h3 class="indoorStart"> Indoor start date: ${plant.indoorCalc}</h3>
<button>Click for ${plant.name} recipes </button>
</div>`
}).join("")
}
`


}