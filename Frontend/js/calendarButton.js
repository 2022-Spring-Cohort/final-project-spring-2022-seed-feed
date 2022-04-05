export default function calendarButton() {
    return `<div class="atcb" style="display:none;">
    {
        "name":"Add the title of your event",
        "description":"A nice description does not hurt",
        "startDate":"2022-02-21",
        "endDate":"2022-03-24",
        "startTime":"10:13",
        "endTime":"17:57",
        "location":"Somewhere over the rainbow",
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
        "timeZone":"Europe/Berlin",
        "timeZoneOffset":"+01:00",
        "trigger":"click",
        "iCalFileName":"Reminder-Event"
      }
    </div>`
}