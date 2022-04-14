export default function calendarButton(plantDate, plant, fdate) {
  console.log(plant);
  let date = plantDate;
  if(plantDate == "Not recommended."){
    date = fdate;
  }
    return `<div class="atcb" style="display:none;">
    {
      "name":"Today's the day to plant your ${plant.name}",
      "description":"${plant.careTips}",
      "startDate":"${date.getFullYear()}-${(date.getMonth()+1)}-${date.getDate()}",
      "endDate":"${date.getFullYear()}-${(date.getMonth()+1)}-${date.getDate()}",
      "startTime":"11:00",
      "endTime":"12:00",
      "location":"My Garden",
      "label":"Add to Calendar",
      "options":[
        "Apple",
        "Google",
        "iCal",
        "Microsoft365",
        "MicrosoftTeams",
        "Outlook.com",
        "Yahoo"
      ],
      "timeZone":"currentBrowser",
      "timeZoneOffset":"",
      "trigger":"click",
      "iCalFileName":"Reminder-Event"
    }
  </div>`

}